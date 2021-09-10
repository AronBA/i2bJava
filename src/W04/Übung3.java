package W04;

import java.util.Scanner;

public class Übung3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Für welche Zahl möchtest du eine Multiplikationstafel haben? :");
        int num = sc.nextInt();


        for (int i = 1; i < 11; i++){
            int n = i * num;
            System.out.println(i + "*" + num + "=" + n);
        }

    }
}
