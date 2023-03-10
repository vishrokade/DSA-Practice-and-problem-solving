package Generics;

public class GenericsExample<T> {
    private T value;

    public GenericsExample(T value) {
        this.value = value;
    }

    public T getValue(){
        return this.value;
    }

    public static void main(String[] args) {
        GenericsExample<Integer> g1 = new GenericsExample<>(20);

        GenericsExample<String> g2 = new GenericsExample<>("vishal");

        System.out.println(g1.getValue());
        System.out.println(g2.getValue());
    }
}
