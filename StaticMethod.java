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

    public static void show1(Mobile obj){
        System.out.println(obj.brand + " " + obj.price + " " + name);
    }
}

public class StaticMethod {
     public static void main(String[] args) {
        Mobile ob1 = new Mobile();
        ob1.brand = "Apple";
        ob1.price= 1500;
        Mobile.name="SmartPhone";

        Mobile ob2 = new Mobile();
        ob2.brand = "Samsung";
        ob2.price = 1700;
        Mobile.name="Phone";

        ob1.show();
        ob2.show();

        Mobile.show1(ob1);
    }
}
