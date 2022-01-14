package M226a.Regatta;
import java.util.ArrayList;

public class Wettkampf {
    private String name;
    private ArrayList<Schiff> schiffs = new ArrayList<Schiff>();

    Wettkampf(String name){
    this.name = name;
    }

    public String getName() {
        return name;
    }



    public void addSchiff(Schiff schiff){
        schiffs.add(schiff);
    }

    public void Start(){
        for(Schiff schiff : schiffs){
                schiff.race();

        }

    }
    public void printSchiffe(){

        System.out.println(
                "--------------------------------\n" + getName() + "\n" + "--------------------------------");
        for(Schiff schiff : schiffs){

                int nr = schiff.getNr();

                Besitzer besitzer  = schiff.getBesitzer();
                String besitzername = besitzer.getName();
                String schiffname = schiff.getName();
                int time = schiff.getTime();
                System.out.println(nr +" | "+ schiffname + " | " + time +  " | " + besitzername + "\n");

        }

    }
}

