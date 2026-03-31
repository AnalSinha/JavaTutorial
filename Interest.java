class Simpleinterest{
    double p;
    double r;
    short t;
    double si;
    public double si(){
        si = p*r*t/100;
        
        return si;
    }
}

public class Interest {
    public static void main(String[] args) {
        Simpleinterest obj = new Simpleinterest();
        Simpleinterest obj1 = new Simpleinterest();
        
        obj.p=1000;
        obj.r=10;
        obj.t=1;
        double result = obj.si();
        System.out.println("Simple In is " + result );

        obj1.p=2000;
        obj1.r=10;
        obj1.t=1;
        double result1 = obj1.si();
        System.out.println("Simple In is " + result1 );
    }
}
