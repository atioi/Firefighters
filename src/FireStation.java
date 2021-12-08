import iterator.Iterable;
import iterator.Iterator;

public class FireStation {

    private final WGS84 localization;
    private final Iterable<FireEngine> fireEngines = new Iterable<FireEngine>();
    private final String NAME;

    public FireStation(WGS84 localization, String name) {
        this.NAME = name;

        this.localization = localization;
        for (int i = 0; i < 5; i++)
            fireEngines.add(new FireEngine());
    }


    public int call(Notification notification, int neededUnits) {

        int available = 0;
        Iterator<FireEngine> fireEngineIterator = fireEngines.iterator();

        while (available < neededUnits & fireEngineIterator.hasNext()) {
            FireEngine fireEngine = (FireEngine) fireEngineIterator.next();
            available += fireEngine.call(notification);
        }

        if (available == 0)
            System.out.println(NAME + ": We don't have available fire engines.");
        else
            System.out.println(NAME + ": Roger that. I send " + available + " fire engines.");

        return available;
    }

    public WGS84 getLocalization() {
        return localization;
    }
}
