package checkedunchecked;

public class UncheckedException_1 {
    static public void fun1(){
        try{
            System.out.println(10/0); //Unchecked Exception
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        fun1();
    }
}
