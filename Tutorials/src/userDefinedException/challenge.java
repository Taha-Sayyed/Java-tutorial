package userDefinedException;

class LoanBalanceException extends Exception{
    @Override
    public String toString(){
        return "You are paying more then the loan balance";
    }
}

class SavingBalanceException extends Exception{
    @Override
    public String toString(){
        return "Invalid balance";
    }
}

class Account{
    private String accountNumber;
    private String holderName;
    private int phNo;


    public Account(String accNo,String name,int phNumber){
        accountNumber=accNo;
        holderName=name;
        phNo=phNumber;
    }
}

class loanAccount extends Account{
    private double loanBalance;
    public loanAccount(String accNo,String name,int phNumber,double bal){
        super(accNo,name,phNumber);
        loanBalance=bal;
    }

    public void payEMI(double amt){
        try{
            if(loanBalance<amt){
                throw new LoanBalanceException();
            }
            loanBalance=loanBalance-amt;
        }
        catch (LoanBalanceException e){
            System.out.println(e);
        }
    }

    public double getLoanBalance() {
        return loanBalance;
    }
}

class savingAccount extends Account{
    private double savingBalance;
    public savingAccount(String accNo,String name,int phNumber){
        super(accNo,name,phNumber);
        savingBalance=0;
    }
    public void deposit(double amt){
        savingBalance+=amt;
    }
    public void withdraw(double amt){
        try{
            if(savingBalance<amt){
                throw new SavingBalanceException();
            }
            savingBalance-=amt;
        }
        catch(SavingBalanceException e){
            System.out.println(e);
        }
    }
    public double getSavingBalance() {
        return savingBalance;
    }
}


public class challenge{
    public static void main(String[] args) {
        loanAccount a=new loanAccount("A023210","Taha Sayyed",995878564,5000);
        System.out.println("Loan Account balance "+a.getLoanBalance());
        a.payEMI(200);
        System.out.println("Loan Account balance "+a.getLoanBalance());

        savingAccount s=new savingAccount("A023210","Taha Sayyed",995878564);
        s.deposit(1000);
        s.withdraw(5000);
        System.out.println("Saving Account balance "+s.getSavingBalance());
    }
}
