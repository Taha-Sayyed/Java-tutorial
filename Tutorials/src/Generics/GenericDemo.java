package Generics;

public class GenericDemo<T> {

    T[] data;

    @SuppressWarnings("unchecked")
    public GenericDemo() {
        data = (T[]) new Object[3];
    }

    public static void main(String[] args) {

        GenericDemo<String> gd = new GenericDemo<>();

        gd.data[0] = "Hello";
        gd.data[1] = "Taha";
        gd.data[2] = "Sayyed";

        String str = gd.data[0];
        System.out.println(str);
    }
}

