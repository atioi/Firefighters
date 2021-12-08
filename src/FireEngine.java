import strategy.IStrategy;

/**
 * FireEngine
 */
public class FireEngine {

    private State state = new Available();
    private IStrategy strategy;

    protected void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void applyStrategy() throws InterruptedException {
        this.strategy.takeAction();
    }

    protected void setState(State state) {
        this.state = state;
    }

    protected void driveOut() {
        this.state.driveOut(this);
    }


    public int call(Notification notification) {
        return this.state.call(this, notification);
    }

}
