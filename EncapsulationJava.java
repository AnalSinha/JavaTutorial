
class Human{
    private int age; //private variables are only accessible in the same class
    private String name;
    
    /*
    you can generate getters and setters from IDE, Source action--> generate getters and setters
    */
    public int getAge() {    
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }



/*   
    public void setAge(int a){
        age = a;
    }

    public void setName(String n){
        name= n;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }


*/
}
public class EncapsulationJava {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(11);
        obj.setName("Anal");
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
