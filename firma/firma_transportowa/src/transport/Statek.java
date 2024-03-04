package transport;

import towar.Kontener;

public class Statek extends Transport{
    private static final int ROZMIAR = 70;
    public Statek(){
        super();
        setRodzaj("Statek");
    }
    @Override
    public int zaladuj(Kontener kontener){
        if (kontenery.size() == ROZMIAR){
            return 0;
        }
        kontenery.add(kontener);
        return ROZMIAR - kontenery.size();
    }
}
