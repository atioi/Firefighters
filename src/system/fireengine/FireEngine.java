package system.fireengine;

import system.Notification;
import system.fireengine.states.Available;
import system.fireengine.states.State;
import system.strategy.IStrategy;

/**
 * Represents fire engine.
 */
public class FireEngine {

    private State state = new Available();
    private IStrategy strategy;

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void applyStrategy() throws InterruptedException {
        this.strategy.takeAction();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void driveOut() {
        this.state.driveOut(this);
    }


    public boolean isAvailable() {
        return this.state.isAvailable();
    }

    public int call(Notification notification) {
        return this.state.call(this, notification);
    }

}
