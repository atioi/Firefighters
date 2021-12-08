public class Notification {
    private final WGS84 localization;
    private final Type type;

    public enum Type {
        AF(-1), MZ(2), PZ(3);

        private final int cars;


        Type(int cars) {
            this.cars = cars;
        }

        public int getCarsNumber() {
            return this.cars;
        }
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

