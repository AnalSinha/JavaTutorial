//using 'Class' class to load Mobile class using class loaded (and run static block) without creating object.
class Mobile{
    String brand;
    int price;
    static String name;

    static{
        name = "phone"; 
        System.out.println("inside static block");
    }

    public Mobile(){
        brand = "";
        price = 1500;
        
         System.out.println("inside constructor");
    }

    public void show(){
        System.out.println(brand + " " + price + " " + name);
    }
}


public class StaticBlock2 {
    public static void main(String[] args) throws ClassNotFoundException {
        
        Class.forName("Mobile");
    }
}

/*
--> Normally we don't use this, but there are some cases where we need it.
Example - When we start jdbc.
*/