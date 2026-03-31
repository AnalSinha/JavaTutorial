class Human
{
    private int age;
    private String name;

    public Human(){    //default constructor
        age = 12;
        name = "John Marston";
    }
    
    public Human(int age, String name){     //parameterized constructor
        this.age = age;
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

}


public class ConstructorJava {
    public static void main(String[] args) {
        
        Human obj = new Human();
        System.out.println("name = " + obj.getName() + " : " + "age = " + obj.getAge());

        Human obj1 = new Human(20, "Arthur Morgan");
        System.out.println("name = " + obj1.getName() + " : " + "age = " + obj1.getAge());
    }
}
