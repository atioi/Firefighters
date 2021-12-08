import strategy.GoBack;
import strategy.Help;
import strategy.IStrategy;

public class Available implements State {

    @Override
    public int call(FireEngine fireEngine, Notification notification) {

        fireEngine.setState(new Taken());

        if (notification.isFalseAlarm()) fireEngine.setStrategy(new GoBack());
        else fireEngine.setStrategy(new Help());

        fireEngine.driveOut();
        return 1;
    }

    public void driveOut(FireEngine fireEngine) {

    }

}