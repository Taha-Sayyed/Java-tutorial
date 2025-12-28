package userDefinedException;

class LowBalanceException extends Exception{
    @Override
    public String toString() {
        return "Balance should not be less then 5000/- ";
    }
}

public class UserDefinedException {
    public static int balance=9000;
    static void fun1(){
        try{
            if(balance<=5000){
                throw new LowBalanceException();
            }
        }catch(LowBalanceException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        fun1();
    }
}
