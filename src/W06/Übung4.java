package W06;

public class Übung4 {
    public static void main(String[] args) {
        int ar[] = {1,2,3,4,8,0};
        int ab[] = new int[6];
        ab = ar;
        for (int i : ab) {
            System.out.print(i);
        }
    }
}
