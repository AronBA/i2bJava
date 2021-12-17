package M403.W05;

import java.util.Scanner;

public class übung3 {
    public static void func(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Email address");
        String Text = myObj.nextLine();
        int n = Text.length();
        int iend = Text.indexOf("@");
        String Username = Text.substring(0 , iend);
        String Domainname = Text.substring(iend + 1 , n);
        if (Domainname.equals("gmail.com")){
            System.out.println("You use a Google Email.");
        }
        else {
            System.out.println("You use another Mail server, other than Google.");
        }
        System.out.println("Your username is: " + Username);
        System.out.println("Your domainname is: " + Domainname);
    }
    public static void main(String[] args){
        func();
    }
}