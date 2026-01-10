package Collections.ArrayDequeue;

import java.util.ArrayDeque;

public class Demo2 {
    public static void main(String[] args) {
        //Making ArrayDeque to behave as Queue
        ArrayDeque<Integer>dq=new ArrayDeque<>();
        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);

        dq.pollFirst();
    }
}
