package nestedcatch;

public class NestedCatch {
    public static void main(String[] args) {
        try{
            int A[]={10,0,30,40,50};
            try{
                int r=A[0]/A[1];
                System.out.println(r);
            }
            catch(ArithmeticException e){
                System.out.println("Denominator should not be zero");
            }
            System.out.println(A[10]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of scope");
        }
    }
}
