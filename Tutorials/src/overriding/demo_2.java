package overriding;

class TV{
    public void switchOn(){
        System.out.println("TV is switched On");
    }
    public void changeChannel(){
        System.out.println("TV channel is changed");
    }
}

class SmartTV extends TV{
    @Override
    public void switchOn(){
        System.out.println("Smart TV is switched On");
    }
    @Override
    public void changeChannel(){
        System.out.println("Smart TV channel is changed");
    }
    public void browse(){
        System.out.println("Smart TV Browsing");
    }
}


public class demo_2 {
    public static void main(String[] args) {
        TV t=new SmartTV();
        t.switchOn();
        t.changeChannel();
        //t.browse(); Not accessible because "DMD"
    }
}
