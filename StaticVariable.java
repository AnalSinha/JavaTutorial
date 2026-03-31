
class Mobile{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand + " " + price + " " + name);
    }
}

public class StaticVariable {
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
