package strategy;

import static java.lang.Thread.sleep;

public class Help implements IStrategy {
    @Override
    public void takeAction() throws InterruptedException {
        sleep(3000);
    }
}
