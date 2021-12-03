// This will be SKKM it listens for reports..

import java.util.ArrayList;
import java.util.List;

public class Subject /*SKKM*/ {

    // Jednostki:
    private final List<Jednostka> observers = new ArrayList<Jednostka>();


    private void notifyObservers() {
        //TODO Wezwać odpowiednią jednostkę.
    }

    public void addObserver(Jednostka observer) {
        this.observers.add(observer);
    }


    /**
     * Nasłchuje nadzchodzące zgłoszenia.
     */
    public void listen() {

    }

}




