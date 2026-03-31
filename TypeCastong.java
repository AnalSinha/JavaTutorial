public class TypeCastong {
    public static void main(String[] args) {
       // byte b=127;
        int a= 12;
        byte k = (byte)a;
        System.out.println(k);

        int b=257;
        byte l = (byte)b;
        System.out.println(l); // --> prints 257%256 because 257 is out of range
        //of byte, so type conversion finds its modulus wrt the range of Byte 
        //which is 256 , thats it !!!

        float f = 5.6f;
        int t=(int)f;
        System.out.println(t);
        

    }
}
