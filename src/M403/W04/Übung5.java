package M403.W04;

import java.util.Scanner;

public class Übung5 {
    public static void main(String[] args) {
        System.out.println("Gib deinen Umsatzt an:");
        Scanner sc = new Scanner(System.in);
        int umsatz = sc.nextInt();
        int rabatt = 0;

        if (umsatz > 100){
            if (umsatz > 500){
                 rabatt = 10;
            }
            else{
                 rabatt = 5;
            }
        }
        else{
             rabatt = 0;
        }
        int rechnungsbetrag = (umsatz - rabatt);
        System.out.println(rechnungsbetrag);

    }
}
