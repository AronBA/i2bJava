package M226a.Regatta;
import java.lang.Math;
import java.util.Random;

public class Schiff {
    private String name;
    private int nr;
    private int time;
    private Besitzer Besitzer;

    Random r = new Random();

    Schiff(int nr, String name, Besitzer Besitzer) {
    this.nr = nr;
    this.name = name;
    this.Besitzer = Besitzer;
    }

    public int getNr() {
        return nr;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBesitzer(M226a.Regatta.Besitzer besitzer) {
        Besitzer = besitzer;
    }

    public M226a.Regatta.Besitzer getBesitzer() {
        return Besitzer;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }
    public void race(){
        this.time = r.nextInt(300) + 300;
    }
}
