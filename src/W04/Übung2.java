package W04;

import java.util.Scanner;

public class Übung2 {
    public static void func() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a text");
        while (!myObj.hasNext("exit")) {
            System.out.println(
                    myObj.hasNextInt() ? "(int) " + myObj.nextInt() :
                            myObj.hasNextLong() ? "(long) " + myObj.nextLong() :
                                    myObj.hasNextDouble() ? "(double) " + myObj.nextDouble() :
                                            myObj.hasNextBoolean() ? "(boolean) " + myObj.nextBoolean() :
                                                    "(String) " + myObj.next()
            );
        }
    }
    public static void main(String[] args){
        func();
    }
}
