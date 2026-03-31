package Abstract_and_InnerClass;

//Java only allows inner classes to be static.

class A{
    int age;
    
    public void show(){
        System.out.println("in show");
    }

    static class B{
        public void config(){
            System.out.println("in config");
        }
    }

}

public class StaticInnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj1 =  new A.B();
        obj1.config();
    }
}
