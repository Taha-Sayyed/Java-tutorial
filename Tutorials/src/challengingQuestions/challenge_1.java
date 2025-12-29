package challengingQuestions;

import java.sql.Array;

class StackUnderFlowException extends Exception{
    @Override
    public String toString(){
        return "No element in the stack";
    }
}

class StackOverFlowException extends Exception{
    @Override
    public String toString(){
        return "Stack is Full";
    }
}

class Stack{

    private int stackSize;
    public int top;
    int A[];

    public Stack(int n){
        stackSize=n;
        A= new int[stackSize];
        top=-1;
    }

    public void push(int element){
        try{
            if(top==stackSize-1){
                throw new StackOverFlowException();
            }
            top++;
            A[top]=element;
        }
        catch (StackOverFlowException e){
            System.out.println(e);
        }
    }
    public void display(){
        for(int i=0;i<stackSize;i++){
            System.out.print(A[i]+" ");
        }
    }

    public void pop(){

        try{
            if(top==-1){
                throw new StackUnderFlowException();
            }
            System.out.println("Popped element is "+A[top]);
            top--;
        }
        catch (StackUnderFlowException e){
            System.out.println(e);
        }
    }
}


public class challenge_1 {
    public static void main(String[] args) {
        Stack s=new Stack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.display();
        //System.out.println(s.top);
        System.out.println();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
    }
}
