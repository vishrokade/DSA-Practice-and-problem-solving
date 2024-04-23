#include <stdio.h>

#define N 512 // Matrix size (N x N)

__global__ void matrixMul(int *a, int *b, int *c) {
    int row = blockIdx.y * blockDim.y + threadIdx.y;
    int col = blockIdx.x * blockDim.x + threadIdx.x;

    if (row < N && col < N) {
        int sum = 0;
        for (int k = 0; k < N; k++) {
            sum += a[row * N + k] * b[k * N + col];
        }
        c[row * N + col] = sum;
    }
}

int main() {
    int *a, *b, *c; // Host matrices
    int *d_a, *d_b, *d_c; // Device matrices
    int size = N * N * sizeof(int);

    // Allocate memory on the host
    a = (int *)malloc(size);
    b = (int *)malloc(size);
    c = (int *)malloc(size);

    // Initialize matrices on the host
    for (int i = 0; i < N * N; i++) {
        a[i] = i;
        b[i] = i;
    }

    // Allocate memory on the device
    cudaMalloc(&d_a, size);
    cudaMalloc(&d_b, size);
    cudaMalloc(&d_c, size);

    // Copy matrices from host to device memory
    cudaMemcpy(d_a, a, size, cudaMemcpyHostToDevice);
    cudaMemcpy(d_b, b, size, cudaMemcpyHostToDevice);

    // Define grid and block dimensions
    dim3 threadsPerBlock(16, 16);
    dim3 blocksPerGrid((N + threadsPerBlock.x - 1) / threadsPerBlock.x, 
                       (N + threadsPerBlock.y - 1) / threadsPerBlock.y);

    // Launch kernel
    matrixMul<<<blocksPerGrid, threadsPerBlock>>>(d_a, d_b, d_c);

    // Copy result from device memory to host
    cudaMemcpy(c, d_c, size, cudaMemcpyDeviceToHost);

    // Verify result
    // (omitted for brevity)

    // Free device memory
    cudaFree(d_a);
    cudaFree(d_b);
    cudaFree(d_c);

    // Free host memory
    free(a);
    free(b);
    free(c);

    printf("Matrix multiplication completed successfully.\n");

    return 0;
}
