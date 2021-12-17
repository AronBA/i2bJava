package M403.W04;

import java.util.Scanner;

public class Übung6 {
    public static void main(String[] args) {
        System.out.println("Gib eine Zahl an");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = 0;
        for (int i = 1 ; i <= n;) {
            if (n %i == 0){
                t++;
            }
            i++;
        }
        if (t == 2){
            System.out.println(n + " ist eine Primzahl");
        }
        else{
            System.out.println(n + " ist keine Primzahl");
        }

    }
}







