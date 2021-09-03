package W04;

import java.util.Scanner;

public class Übung1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Gib zwei zahlen an: ");
        int numA = sc.nextInt();
        int numB = sc.nextInt();

        if(numA == numB)
        {
            System.out.println(numA + " ist gleichgross wie " + numB);
        }
        else if(numA > numB)
        {
            System.out.println(numA + " ist grösser als " +numB);
        }
        else
        {
            System.out.println(numA + " ist kleiner als " +numB);
        }
    }
}
