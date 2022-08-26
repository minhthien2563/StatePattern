package SwitchState;

public class Switch {
    private State state;

    public Switch(){
        state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }


}
