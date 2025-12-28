package userDefinedException;

class LowBalanceException extends Exception{
    @Override
    public String toString() {
        return "Balance should not be less then 5000/- ";
    }
}

public class UserDefinedException {
    static void fun1(){
        try{
           throw new LowBalanceException();
        }catch(LowBalanceException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        fun1();
    }
}
