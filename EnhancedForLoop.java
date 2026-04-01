public class EnhancedForLoop {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};

        /*for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        */

        for(int num : a){
            System.out.println(num);
        }

    }
}
