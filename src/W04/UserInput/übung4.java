package W04.UserInput;

public class übung4 {
    public static void zaehlen1(){
        int zaehl = 10;
        while (zaehl < 1001){
            System.out.println(zaehl + ",");
            zaehl = zaehl + 1;
        }
    }
    public static void main (String[] args){
        zaehlen1();
    }
}