import system.FireStation;
import system.SKKM;
import system.WGS84;

public class Main {

    public static void main(String[] args) {

        SKKM skkm = new SKKM(); // skkm is subject, all fireStations are observers.

        FireStation JRG1 = new FireStation(new WGS84(50.059989, 19.943159), "JRG1");
        FireStation JRG2 = new FireStation(new WGS84(50.033413, 19.935811), "JRG2");
        FireStation JRG3 = new FireStation(new WGS84(50.527612, 20.258989), "JRG3");
        FireStation JRG4 = new FireStation(new WGS84(50.037593, 20.005781), "JRG4");
        FireStation JRG5 = new FireStation(new WGS84(50.092252, 19.919651), "JRG5");
        FireStation JRG6 = new FireStation(new WGS84(50.015935, 20.015674), "JRG6");
        FireStation JRG7 = new FireStation(new WGS84(50.046968, 20.004790), "JRG7");
        FireStation JRGSK = new FireStation(new WGS84(49.973038, 19.825049), "JRG SKAWINA");
        FireStation SAPSP = new FireStation(new WGS84(52.237680, 21.330550), "SAPSP");
        FireStation LSP = new FireStation(new WGS84(50.070369, 19.800583), "LSP");


        skkm.addFireStation(JRG1);
        skkm.addFireStation(JRG2);
        skkm.addFireStation(JRG3);
        skkm.addFireStation(JRG4);
        skkm.addFireStation(JRG5);
        skkm.addFireStation(JRG6);
        skkm.addFireStation(JRG7);
        skkm.addFireStation(JRGSK);
        skkm.addFireStation(SAPSP);
        skkm.addFireStation(LSP);

        skkm.listen();

    }
}
