package ArrayJava;

public class Array {
    public static void main(String[] args) {
        int num[] ={3,7,2,4};
        int num1[] = new int[4];

        for(int i=0; i<=3;i++){
                System.out.println(num[i]);
        }

         for(int i=0; i<=3;i++){
                num1[i]=(int)(Math.random()*100);
        }
        for(int n:num1){
                System.out.print(n + " ");
        }
        
    }
}
