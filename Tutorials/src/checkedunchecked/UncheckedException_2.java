package checkedunchecked;

public class UncheckedException_2 {
    static public void fun1(){
        try{
            System.out.println(10/0); //Unchecked Exception
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    static public void fun2(){
        fun1();
    }

    static public void fun3(){
        fun2();
    }

    public static void main(String[] args) {
        fun3();
    }
}
