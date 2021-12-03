package Observer;

public class Notification {

    private final WGS84 localization;
    private final Type type;

    enum Type {
        AF,
        MZ,
        PZ
    }

    public Notification(WGS84 localization, Type type) {
        this.localization = localization;
        this.type = type;
    }

    public WGS84 getLocalization() {
        return localization;
    }

    public Type getType() {
        return type;
    }
}
