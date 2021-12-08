public class WGS84 {
    private final double x;
    private final double y;

    public WGS84(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getDistance(WGS84 point) {
        double disX = this.x - point.getX();
        double disY = this.y - point.getY();
        return Math.sqrt(disX * disX + disY * disY);
    }
}
