package M403.W06;

public class Übung5 {
    public static void main(String args[]){
        String[] array = new String[] {"rafael","leander","levon","severin","jack","jasin","silvan","beat","michael","yannic","janakan","adrian","erik","vincent","valentin","nirmal","danilo","David"};
        for(int i=0; i < array.length; i++ ) {
            array[i] = firstLetterCapital(array[i]);
        }
        for(String str:array) {
            System.out.println(str);
        }

    }
    static String firstLetterCapital(String str) {
        String firstLetter =  str.substring(0,1);
        String firstLetterCapital = firstLetter.toUpperCase();
        String strExcludeFirstLetter = str.substring(1, str.length());
        String result = firstLetterCapital + strExcludeFirstLetter;
        return result;
    }
}