import Observer.FireStation;
import Observer.SKKM;
import Observer.WGS84;

public class Main {
    public static void main(String[] args) {

        SKKM subject = new SKKM();

        FireStation JRG1 = new FireStation(new WGS84(50.059989, 19.943159));
        FireStation JRG2 = new FireStation(new WGS84(50.033413, 19.935811));
        FireStation JRG3 = new FireStation(new WGS84(50.527612, 20.258989));
        FireStation JRG4 = new FireStation(new WGS84(50.037593, 20.005781));
        FireStation JRG5 = new FireStation(new WGS84(50.092252, 19.919651));
        FireStation JRG6 = new FireStation(new WGS84(50.015935, 20.015674));
        FireStation JRG7 = new FireStation(new WGS84(50.046968, 20.004790));
        FireStation JRGSK = new FireStation(new WGS84(49.973038, 19.825049));
        FireStation SAPSP = new FireStation(new WGS84(52.237680, 21.330550));
        FireStation LSP = new FireStation(new WGS84(50.070369, 19.800583));


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