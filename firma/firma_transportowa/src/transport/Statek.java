package transport;

import towar.Kontener;

public class Statek extends Transport{
    private static final int ROZMIAR = 70;
    public Statek(){
        super();
        setRodzaj("Statek");
    }
    @Override
    public void zaladuj(Kontener kontener){
        if (kontenery.size() == ROZMIAR){
            return;
        }
        kontenery.add(kontener);
    }
}
