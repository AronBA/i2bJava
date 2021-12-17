package M403.W04;

import java.util.Scanner;

public class Übung4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0;
        String password = "pw";

        do {
            System.out.println("Gib das Passwort ein");
            String input = sc.next();
                if (password.equals(input)){
                    System.out.println("Sie sind eingeloggt!");
                    break;
                }
                else{
                    t++;
                    System.out.println("Sie haben noch " + (3-t) + " versuche");
                }
                if (t == 3) {
                    System.out.println("Keine versuche mehr!");
                    break;
                }

        }while(true);
    }
}
