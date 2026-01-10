package Collections.ArrayDequeue;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Demo1 {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq=new ArrayDeque<>();
        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);

        dq.offerFirst(1);
        dq.offerFirst(2);
        dq.offerFirst(3);

        Iterator<Integer> it=dq.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

    }
}
