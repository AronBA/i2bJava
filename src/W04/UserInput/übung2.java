package W04.UserInput;
import java.util.Scanner;

public class übung2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inp = input.next();

        int l = inp.length();
        char first = inp.charAt(0);
        char last = inp.charAt(l - 1);

        System.out.println("Erstes Zeichen ist: " + first);
        System.out.println("Erstes Zeichen ist: " + last);

    }
}
