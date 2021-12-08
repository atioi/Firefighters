package system.fireengine.states;

import system.fireengine.FireEngine;
import system.Notification;

public class Unavailable implements State {

    @Override
    public int call(FireEngine fireEngine, Notification notification) {
        return 0;
    }

    public void driveOut(FireEngine fireEngine) {
        //TODO: Thread ...
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("Wyjechałem...");

                try {
                    sleep(3000);
                    fireEngine.applyStrategy();
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                fireEngine.setState(new Available());
                System.out.println("Wróciłem");

            }

        };

        thread.start();
    }

    @Override
    public boolean isAvailable() {
        return false;
    }

}
