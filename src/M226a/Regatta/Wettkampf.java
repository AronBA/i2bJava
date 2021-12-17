package M226a.Regatta;

public class Wettkampf {
    private String name;
    private Schiff[] Schiff = new Schiff[5];

    Wettkampf(String name){
    this.name = name;
    }

    public String getName() {
        return name;
    }
    public void addSchiff(Schiff schiff){
        for (int i=0; i<Schiff.length; i++) {
            if(Schiff[i] == null) {
                Schiff[i] = schiff;
                break;
            }
        }
    }
    public void Start(){
        for(Schiff schiff : Schiff){
            if(schiff != null){
                schiff.race();
            }

        }

    }
    public void printSchiffe(){

        System.out.println(
                "--------------------------------\n" + getName() + "\n" + "--------------------------------");
        for(Schiff schiff : Schiff){
            if(schiff != null){
                int nr = schiff.getNr();
                String schiffname = schiff.getName();
                int time = schiff.getTime();
                System.out.println(nr +" | "+ schiffname + " | " + time + "\n");
            }
        }
    }
}

