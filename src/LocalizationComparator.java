import java.util.Comparator;

public class LocalizationComparator implements Comparator<FireStation> {

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