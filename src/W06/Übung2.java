package W06;

public class Übung2 {
    static void sum(int[] a){
        int summe = 0;
        for (int i = 0; i < a.length; i++){
            summe += a[i];
        }
        System.out.println("Die Summe ist: "+ summe);
    }

    static  void search(int[] a, int n){
        for (int i = 0; i < a.length; i++){
            if (a[i] == n){
                System.out.println(" Zahl wurde gefunden");
                break;
            }
        }
    }
    static void max(int[] a){
        int höchste = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] > höchste){
                höchste = a[i];
            }
        }
        System.out.println("Die höchste zahl: " + höchste);
    }

    static void secondmax(int[] a) {
        int höchste = 0;
        int zweithöchste = 0;
        int cache = 0;
        for (int i = 0; i < a.length; i++) {
                if (a[i] >= zweithöchste) {
                    zweithöchste = a[i];
                    if (a[i] >= höchste) {
                        cache = höchste;
                        höchste = a[i];
                        zweithöchste = cache;

                    }

                }
            }


                System.out.println("die zweithöchste Zahl: "+ zweithöchste);
            }

            public static void main (String[]args){
                int[] ar = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
                sum(ar);
                search(ar, 10);
                max(ar);
                secondmax(ar);

            }
        }
