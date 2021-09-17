package W05;

public class übung5 {
    public static void main(String[] args) {
    int[] arr =  new int[366];
        for (int i = 1; i <= 365;i++){
            arr[i] = i;
            int tage = arr[i];
            System.out.println(tage + " Tage haben " + (24*tage) + " Stunden");

        }
    }
}

