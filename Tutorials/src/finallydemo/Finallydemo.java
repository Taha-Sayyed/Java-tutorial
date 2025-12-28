package finallydemo;

public class Finallydemo {
    static void meth1() throws Exception{
        try{
            throw new Exception();
        }
        finally{
            System.out.println("End of the program");
        }
    }

    public static void main(String[] args){
        try{
            meth1();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
