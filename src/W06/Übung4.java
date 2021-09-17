package W06;

public class Übung4 {
    public static void main(String[] args) {
        int ar[] = {1,2,3,4};
        int ab[] = new int[4];
        ab = ar;
        for (int i = 0; i < ab.length; i++){
            System.out.print(ab[i]);
        }
    }
}
