package Collections.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        LinkedList<Integer> a1=new LinkedList<>();
        LinkedList<Integer> a2=new LinkedList<>(List.of(50,60,70,80));
        a1.addAll(a2);
        a1.add(90);
        a1.add(5,100);
        System.out.println(a1.contains(50));
        a1.addLast(110);
        System.out.println(a1.getLast());
        a1.set(5,120);
        System.out.println(a1.lastIndexOf(120));
    }
}