package W04.UserInput;

import java.util.Scanner;

public class Übung1 {
    public static void func() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Schreibe Zahlen und Buchstaben: ");
        String answer = myObj.next();

        for (char xxx: answer.toCharArray()) {
            if (Character.isLetter(xxx)) {
                System.out.println("Das waren nicht nur Zahlen");
                System.exit(0);
            }
        }
        System.out.println("Das waren nur Zahlen");

    }

    public static void main(String[] args) {
        func();

    }

}