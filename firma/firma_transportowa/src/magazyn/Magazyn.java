package magazyn;

import towar.Kontener;

import java.util.ArrayList;

public class Magazyn {
    private ArrayList<Kontener> magazyn = new ArrayList<>();
    public void przyjmij(Kontener kontener){
        magazyn.add(kontener);
    }
    public Kontener wydaj(){
        if (magazyn.isEmpty()){
            return null;
        }
        return magazyn.removeFirst();
    }
}
