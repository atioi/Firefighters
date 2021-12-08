import java.util.Comparator;
import java.util.Scanner;

import iterator.Iterable;
import iterator.Iterator;



/**
 * SKKM and FireStation implements Observer Pattern where SKKM is the Subject and FireStations are observers.
 * */
public class SKKM {

    /**
     * The points below determine where notification come from.
     */
    private final double maxX = 50.154564013341734;
    private final double minX = 49.95855025648944;
    private final double minY = 19.688292482742394;
    private final double maxY = 20.02470275868903;


    /**
     * The fireStations is an iterable object that contains FireStation objects.
     */
    private final Iterable<FireStation> fireStations = new Iterable<FireStation>();


    /**
     * All notifications that comes to SKKM are processed here.
     * This function call another one that call FireStation respectively.
     */
    private void processNotification(Notification notification) {

        fireStations.sort(new LocalizationComparator(notification.getLocalization()));
        Iterator<FireStation> iterator = fireStations.iterator();
        int available = notification.getType().getCarsNumber();


        while (iterator.hasNext() & available > 0) {
            FireStation station = (FireStation) iterator.next();
            available -= station.call(notification, available);
        }

        if (available == notification.getType().getCarsNumber())
            System.out.println("Brak dostępnych jednostek.");

    }

    /**
     * FireStation represents observer.
     */
    public void addFireStation(FireStation fireStation) {
        fireStations.add(fireStation);
    }


    public void list() {
        System.out.println("PZ [1], MZ [2]");
    }

    public double generate(double min, double max) {
        return Math.random() * (max - min) + min;
    }


    public void listen() {
        Scanner scanner = new Scanner(System.in);
        list();
        while (scanner.hasNextLine()) {
            list();
            String line = scanner.nextLine();
            switch (line) {
                case "1" -> processNotification(new Notification(new WGS84(generate(minX, maxX),
                        generate(minY, maxY)), Notification.Type.PZ));
                case "2" -> processNotification(new Notification(new WGS84(generate(minX, maxX),
                        generate(minY, maxY)), Notification.Type.MZ));
            }
        }
    }

}
