package throwthrowsdemo;

//Defining user defined Exception
class NegativeDimensionException extends Exception{
    @Override
    public String toString(){
        return "Negative Dimension not allowed";
    }
}

public class ThrowThrowsDemo {
    public static int area(int l,int b) throws NegativeDimensionException{ //passing Exception using throws to callingFunc() method
        if(l<0 || b<0){
            throw new NegativeDimensionException();
        }
        return l*b;
    }

    public static int callingFunc() throws NegativeDimensionException{ //passing Exception using throws to main() method
        return area(-10,20);
    }

    public static void main(String[] args) {
        try{
            System.out.println(callingFunc());
        }catch(NegativeDimensionException e){
            e.printStackTrace();
            System.out.println(e.toString());
        }
    }
}
