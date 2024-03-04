package transport;

import magazyn.Magazyn;
import towar.Kontener;

import java.util.ArrayList;

public abstract class Transport {
    private String rodzaj;
    protected ArrayList<Kontener> kontenery = new ArrayList<>();
    public String getRodzaj() {
        return rodzaj;
    }

    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }
    public void przetransportuj(Magazyn z, Magazyn dokad){

    }
    public abstract void zaladuj(Kontener kontener);
}
