package M226a.Regatta;

public class Start {
    public static void main(String[] args) {
    Schiff Schiff1 = new Schiff(1,"Der Flitzer");
    Schiff Schiff2 = new Schiff(2,"Le Coq Sportif");
    Schiff Schiff3 = new Schiff(69,"Der schneller kommer");
    Schiff Schiff4 = new Schiff(12,"der sterbende krahn");
    Schiff Schiff5 = new Schiff(13,"Le Baquette");


    Wettkampf w1 = new Wettkampf("Cup der Opfer");

    w1.addSchiff(Schiff1);
    w1.addSchiff(Schiff2);
    w1.addSchiff(Schiff3);
    w1.addSchiff(Schiff4);


    w1.Start();
    w1.printSchiffe();
    }
}
