package system.fireengine.states;

import system.fireengine.FireEngine;
import system.Notification;

public interface State {
    int call(FireEngine fireEngine, Notification notification);

    void driveOut(FireEngine fireEngine);

    boolean isAvailable();
}