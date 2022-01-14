package M226a.Regatta;

public class Start {
    public static void main(String[] args) {

    Besitzer besitzer1 = new Besitzer("lola","jonny","Basel");
    Besitzer besitzer2 = new Besitzer("Umpa","Frederik","New York");
    Besitzer besitzer3 = new Besitzer("jostar","joseph","london");

    Schiff Schiff1 = new Schiff(1,"Der Flitzer",besitzer1);
    Schiff Schiff2 = new Schiff(2,"Le Coq Sportif",besitzer3);
    Schiff Schiff3 = new Schiff(69,"Der schneller kommer",besitzer1);
    Schiff Schiff4 = new Schiff(12,"der sterbende krahn",besitzer2);
    Schiff Schiff5 = new Schiff(13,"Le Baquette",besitzer1);


    Wettkampf w1 = new Wettkampf("Cup der Opfer");

    w1.addSchiff(Schiff1);
    w1.addSchiff(Schiff2);
    w1.addSchiff(Schiff3);
    w1.addSchiff(Schiff4);


    w1.Start();
    w1.printSchiffe();
    }
}
