
package Enumeration;

enum Status{ //treated as a class
    Running, Failed, Pending, Success; //these are its objects (named constants)
}

public class EnumJava{
    public static void main(String[] args) {
        Status s = Status.Running;
        System.out.println(s);
        System.out.println(s.ordinal());
        Status[] ss = Status.values();
        for(Status s1 : ss){
            System.out.println(s1 + " : " + s1.ordinal());
        }
    }
}
