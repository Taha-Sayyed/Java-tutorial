package multipleTryCatch;

public class TryCatch {
    public static void main(String[] args) {
        try {
            int A[]={10,0,30,40,50};
            int r=A[0]/A[1];
            System.out.println(r); //Exception Expected
            System.out.println(A[100]); //Exception Expected
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
