package Collections.Arraylist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Integer> a1=new ArrayList<>(List.of(10,20,30,40,50));

        for(int i=0;i<a1.size();i++){
            System.out.print(a1.get(i)+" ");
        }
        System.out.println("\n");

        //for each loop
        for(Integer x:a1){
            System.out.print(x+" ");
        }
        System.out.println("\n");

        //Using var (No need to mention about Object type)
        for(var x:a1){
            System.out.print(x+" ");
        }

        System.out.println("\n");
        //Using Iterator class which is generic
        Iterator<Integer> it=a1.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

        //Using ListIterator class which is generic
        System.out.println("\n");
        ListIterator<Integer> lt=a1.listIterator();
        while(lt.hasNext()){
            System.out.print(lt.next()+" ");
        }

        //Using for loop along with the ListIterator class
        System.out.println("\n");
        for(ListIterator<Integer>ot=a1.listIterator();ot.hasNext();){
            System.out.print(ot.next()+" ");
        }

        //foreach method of class ArrayList
        System.out.println("\n");
        a1.forEach(n-> System.out.print(n+" "));

        System.out.println("\n");
        a1.forEach(System.out::print);

    }
}
