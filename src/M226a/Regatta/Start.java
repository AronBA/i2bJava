package M226a.Regatta;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Start {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger("regatta");

        FileHandler fh;
        fh = new FileHandler("src/M226a/Regatta/logs/regatta.log");
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);








    Besitzer besitzer1 = new Besitzer("lola","jonny","Basel");
    Besitzer besitzer2 = new Besitzer("Umpa","Frederik","New York");
    Besitzer besitzer3 = new Besitzer("jostar","joseph","london");


    Schiff Schiff1 = new Schiff(1,"Der Flitzer",besitzer1);
        logger.info("created " + Schiff1.getClass());
    Schiff Schiff2 = new Schiff(2,"Le Coq Sportif",besitzer3);
        logger.info("created " + Schiff2.getClass());
    Schiff Schiff3 = new Schiff(69,"Der schneller kommer",besitzer1);
        logger.info("created " + Schiff3.getClass());
    Schiff Schiff4 = new Schiff(12,"der sterbende krahn",besitzer2);
        logger.info("created " + Schiff4.getClass());
    Schiff Schiff5 = new Schiff(13,"Le Baquette",besitzer1);
        logger.info("created " + Schiff5.getClass());


    Wettkampf w1 = new Wettkampf("Cup der Opfer");
    logger.info("created " + w1.getClass());


    w1.addSchiff(Schiff1);
        logger.info("added " + Schiff1.getName());
    w1.addSchiff(Schiff2);
        logger.info("added " + Schiff2.getName());
    w1.addSchiff(Schiff3);
        logger.info("added " + Schiff3.getName());
    w1.addSchiff(Schiff4);
        logger.info("added " + Schiff4.getName());
    w1.addSchiff(Schiff5);
        logger.info("added " + Schiff5.getName());


    w1.Start();
        logger.info("Started " + w1.getName());
    w1.printSchiffe();
        logger.info("finished " + w1.getName());







    }
}
