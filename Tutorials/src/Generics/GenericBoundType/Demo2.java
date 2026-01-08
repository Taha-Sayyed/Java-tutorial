package Generics.GenericBoundType;

interface P{}
class Q implements P{}
class R implements P{}

class MyArray<T extends P>{}

public class Demo2 {
    public static void main(String[] args) {

    }
}
