package M226a.Regatta;
import java.lang.Math;
import java.util.Random;

public class Schiff {
    private String name;
    private int nr;
    private int time;

    Random r = new Random();

    Schiff(int nr, String name){
    this.nr = nr;
    this.name = name;
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

    public void setNr(int nr) {
        this.nr = nr;
    }
    public void race(){
        this.time = r.nextInt(300) + 300;
    }
}
