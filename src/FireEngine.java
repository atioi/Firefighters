public class FireEngine {

    private State state = new Available();

    protected void setState(State state) {
        this.state = state;
    }

    protected void driveOut() {
        this.state.driveOut(this);
    }

    public int call() {
        return this.state.call(this);
    }

}
