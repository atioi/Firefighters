public class Jednostka implements Observer{

    private WGS84 localization;
    //TODO: Gdzieś przechowywać samochody.

    public Jednostka(WGS84 localization) {
        this.localization = localization;
    }


    @Override
    public void update() {

    }
}

