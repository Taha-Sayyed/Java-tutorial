package challengingQuestions;

class ATM{ //shared resource/data

    synchronized void checkBalance(String name){
        System.out.println("Checking balance for "+name);
        //try{Thread.sleep(5000);}catch(Exception e){}
    }
    synchronized void withDraw(String name,int amount){
        System.out.println("Amount withdraw by "+name+" is "+amount);
    }
}

class Customer_1 extends Thread{
    ATM atm_1;
    String name;
    int amount;

    public Customer_1(ATM a1,String name,int amount){
            atm_1=a1;
            this.name=name;
            this.amount=amount;
    }

    public void run(){
        atm_1.checkBalance(name);
        atm_1.withDraw(name,amount);
    }
}

class Customer_2 extends Thread{
    ATM atm_2;
    String name;
    int amount;

    public Customer_2(ATM a2,String name,int amount){
        atm_2=a2;
        this.name=name;
        this.amount=amount;
    }
    public void run(){
        atm_2.checkBalance(name);
        atm_2.withDraw(name,amount);
    }
}



public class ThreadTest_11 {
    public static void main(String[] args) {
        ATM a=new ATM();
        Customer_1 c1=new Customer_1(a,"Taha",1000);
        Customer_2 c2=new Customer_2(a,"Sayyed",5000);
        c1.start();
        c2.start();

    }
}
