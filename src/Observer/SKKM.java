package Observer;// This will be SKKM it listens for reports..

import Iterator.Iterable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SKKM /*Subject*/ {

    private final Iterable<FireStation> stations = new Iterable<FireStation>();

    private static class LocalizationComparator implements Comparator<FireStation> {

        private final WGS84 localization;

        public LocalizationComparator(WGS84 localization) {
            this.localization = localization;
        }

        @Override
        public int compare(FireStation o1, FireStation o2) {
            Double dis_1 = this.localization.getDistance(o1.getLocalization());
            Double dis_2 = this.localization.getDistance(o2.getLocalization());
            return dis_1.compareTo(dis_2);
        }

    }

    private void callFireStations() {


    }


    private void receiveNotification(Notification report) {

        WGS84 localization = report.getLocalization();
        Notification.Type type = report.getType();

//        this.stations.sort(new LocalizationComparator(localization));
        //TODO: Sprawdzić ile samochodów jest w najbliższej jednostce.
        //TODO: Jeżeli jest wystarczająco dużo samochodów wysłać je, w innym wypadku zawiadomić inną jednostkę.
    }


    public void addObserver(FireStation observer) {
        this.stations.add(observer);
    }

    public void listen() {
        //TODO: Opracować system, pozwalający na obserwowanie czy przychodzą zawiadomienia.
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            receiveNotification(new Notification(new WGS84(20.000, 19.000), Notification.Type.MZ));
        }
    }

}