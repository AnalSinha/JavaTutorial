
class Mobile{
    String brand;
    int price;
    static String name;

    static{
        name = "phone"; //irrespective of how many objects you create, static block will only be called once.
        System.out.println("inside static block");
    }

    public Mobile(){
        brand = "";
        price = 1500;
        //name = phone;
        /*
        --> on the other hand , if we initialize static variable inside constructor, it will be called for every 
         object creation.
        */

         System.out.println("inside constructor");
    }

    public void show(){
        System.out.println(brand + " " + price + " " + name);
    }
}

public class StaticBlock {
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
        
    }
}

/*
Why Staitc block runs before constructor ? 
--> because when the object is created, the class loader in jvm loads the class and everytime jvm loads a class, it calls static block.
Since class loading occurs first, so static block runs first.
--> static block will not be called again for 2nd  object, as class is already loaded.
*/

/*
What if no object is created and still you want to call static block?
--> For that we have a special class inside java which is called the 'Class' class.

*/