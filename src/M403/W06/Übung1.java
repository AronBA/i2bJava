package M403.W06;


public class Übung1 {
    static void reverse(int a[]){
        int i,t;
        int len = a.length;
        for (i=0;i < len / 2;i++){
            t = a[i];
            a[i] = a[len - i - 1];
            a[len - i -1] = t;
        }
        for (i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
    static void notreverse(int a[]){
        for (int j : a) {
            System.out.println(j);
        }
    }

    public static void main(String[] args) {
        int[] ar = {0,1,2,3,4,5,6,7,8,9};
        System.out.println("Array:");
        notreverse(ar);
        System.out.println("Reversed Array:");
        reverse(ar);
    }


}
