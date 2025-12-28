package abstractclass;

abstract class TV{
    abstract public void switchOn();
    abstract public void changeChannel();
    abstract public void setupBox();
}


//concrete class
class SmartTV extends TV {
    @Override
    public void switchOn(){
        System.out.println("Smart TV is switched On");
    }
    @Override
    public void changeChannel(){
        System.out.println("Smart TV channel is changed");
    }
    @Override
    public void setupBox(){
        System.out.println("No need of Setup Box for smart tv");
    }
    public void browse(){
        System.out.println("Smart TV Browsing");
    }
}


public class demo_1 {
    public static void main(String[] args) {
        TV t=new SmartTV();
        t.switchOn();
        t.changeChannel();
        t.setupBox();
        //t.browse(); Not allowed since Superclass reference is used
    }
}
