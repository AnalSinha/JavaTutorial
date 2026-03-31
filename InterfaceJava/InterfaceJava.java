//class - class --> extends
//class - interface --> implements
//interface - interface --> extends

interface A{
    void show();
    void config();
}

interface X{
void run();
}

interface Y extends X{

}
class B implements A,Y{
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
    public void run(){
        System.out.println("running...");
    }
}

public class InterfaceJava{
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.config();
        //obj.run();
        B obj1 = new B();
        obj1.run();
    }
}