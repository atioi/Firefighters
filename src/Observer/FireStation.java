package Observer;

public class FireStation implements Observer {

    private WGS84 localization;
    private int availableCars = 5;
    //TODO: Gdzieś przechowywać samochody.

    public FireStation(WGS84 localization) {
        this.localization = localization;
    }

    @Override
    public void update() {
        System.out.println("Dostałem informację o pożarze!!");
    }

    public WGS84 getLocalization() {
        return localization;
    }
}

