package W05;

public class Übung4 {
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,11};
        int[] arrdup = arr;
        System.out.println(arrdup[1]);
        arr[1] = 12;
        System.out.println(arrdup[1]);
    }
}
