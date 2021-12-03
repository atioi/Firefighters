public class Main {
    public static void main(String[] args) {

        Subject subject = new Subject();

        Jednostka JRG1 = new Jednostka(new WGS84(50.059989, 19.943159));
        Jednostka JRG2 = new Jednostka(new WGS84(50.033413, 19.935811));
        Jednostka JRG3 = new Jednostka(new WGS84(50.527612, 20.258989));
        Jednostka JRG4 = new Jednostka(new WGS84(50.037593, 20.005781));
        Jednostka JRG5 = new Jednostka(new WGS84(50.092252, 19.919651));
        Jednostka JRG6 = new Jednostka(new WGS84(50.015935, 20.015674));
        Jednostka JRG7 = new Jednostka(new WGS84(50.046968, 20.004790));
        Jednostka JRGSK = new Jednostka(new WGS84(49.973038, 19.825049));
        Jednostka SAPSP = new Jednostka(new WGS84(52.237680, 21.330550));
        Jednostka LSP = new Jednostka(new WGS84(50.070369, 19.800583));


        subject.addObserver(JRG1);
        subject.addObserver(JRG2);
        subject.addObserver(JRG3);
        subject.addObserver(JRG4);
        subject.addObserver(JRG5);
        subject.addObserver(JRG6);
        subject.addObserver(JRG7);
        subject.addObserver(JRGSK);
        subject.addObserver(SAPSP);
        subject.addObserver(LSP);

        subject.listen();

    }
}
