package Abstract_and_InnerClass;

class A{
    public void show(){
        System.out.println("in A show");
    }
}



public class AnonymousInnerClass {
    public static void main(String[] args) {
        A obj = new A(){                        //this right here is anonymous inner class
            public void show(){                 //inner because it is created inside main class
        System.out.println("in new show");   //Anonymous because it doesn't have name to it.
            }
        }; 
        obj.show();
    }
}
