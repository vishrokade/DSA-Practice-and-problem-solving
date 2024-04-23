#include <stdio.h>

#define N 1000000 // Number of elements in the vectors

__global__ void vectorAdd(int *a, int *b, int *c) {
    int index = threadIdx.x + blockIdx.x * blockDim.x;
    if (index < N) {
        c[index] = a[index] + b[index];
    }
}

int main() {
    int *a, *b, *c; // Host vectors
    int *d_a, *d_b, *d_c; // Device vectors
    int size = N * sizeof(int);

    // Allocate memory on the host
    a = (int *)malloc(size);
    b = (int *)malloc(size);
    c = (int *)malloc(size);

    // Initialize vectors on the host
    for (int i = 0; i < N; i++) {
        a[i] = i;
        b[i] = i;
    }

    // Allocate memory on the device
    cudaMalloc(&d_a, size);
    cudaMalloc(&d_b, size);
    cudaMalloc(&d_c, size);

    // Copy vectors from host to device memory
    cudaMemcpy(d_a, a, size, cudaMemcpyHostToDevice);
    cudaMemcpy(d_b, b, size, cudaMemcpyHostToDevice);

    // Launch kernel
    int threadsPerBlock = 256;
    int blocksPerGrid = (N + threadsPerBlock - 1) / threadsPerBlock;
    vectorAdd<<<blocksPerGrid, threadsPerBlock>>>(d_a, d_b, d_c);

    // Copy result from device memory to host
    cudaMemcpy(c, d_c, size, cudaMemcpyDeviceToHost);

    // Verify result
    for (int i = 0; i < N; i++) {
        if (c[i] != 2 * i) {
            printf("Error: mismatch at index %d\n", i);
            break;
        }
    }

    // Free device memory
    cudaFree(d_a);
    cudaFree(d_b);
    cudaFree(d_c);

    // Free host memory
    free(a);
    free(b);
    free(c);

    printf("Vector addition completed successfully.\n");

    return 0;
}
