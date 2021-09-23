package W06;
import java.util.Scanner;
class Übung8{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Noteeingeben:");
        double a=sc.nextDouble();


        if(a==6){
            System.out.print("Sehrgut");
        }else if(a>=5&&a<6){
            System.out.print("gut");
        }else if(a>=4&&a<5){
            System.out.print("Befriedigend");
        }else if(a>=3&&a<4){
            System.out.print("Ausreichend");
        }else if(a>=2&&a<3){
            System.out.print("Mangelhaft");
        }else if(a>=1&&a<2){
            System.out.print("Ungenügend");

        }else{
            System.out.print("Noteistungültig:");
        }


    }
}
