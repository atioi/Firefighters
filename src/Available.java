

public class Available implements State {


    @Override
    public int call(FireEngine fireEngine) {
        fireEngine.setState(new Taken());
        fireEngine.driveOut();
        return 1;
    }

    public void driveOut(FireEngine fireEngine) {

    }

}