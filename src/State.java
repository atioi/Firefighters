
public interface State {
    public int call(FireEngine fireEngine, Notification notification);

    void driveOut(FireEngine fireEngine);
}