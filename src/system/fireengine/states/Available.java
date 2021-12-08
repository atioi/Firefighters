package system.fireengine.states;

import system.fireengine.FireEngine;
import system.Notification;
import system.strategy.GoBack;
import system.strategy.Help;

public class Available implements State {

    @Override
    public int call(FireEngine fireEngine, Notification notification) {

        fireEngine.setState(new Unavailable());

        if (notification.isFalseAlarm()) fireEngine.setStrategy(new GoBack());
        else fireEngine.setStrategy(new Help());

        fireEngine.driveOut();
        return 1;
    }

    public void driveOut(FireEngine fireEngine) {

    }

    @Override
    public boolean isAvailable() {
        return true;
    }

}