package M403.W06;

import java.util.Scanner;

public class Übung6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("geben sie ihre Arbeitsstunden an: ");
        int stunden = sc.nextInt();
        System.out.println("geben sie ihre Überstunden an: ");
        int überstunden = sc.nextInt();
        System.out.println("geben sie ihren stundenlohn an: ");
        int stundenlohn= sc.nextInt();
        int regulär =stunden * stundenlohn;
        int überstundenlohn = (stundenlohn * überstunden / 100)*20 + (überstunden * stundenlohn);
        int lohn = überstundenlohn + regulär;
        System.out.println("Sie erhalten " + lohn + " CHF!");
    }
}
