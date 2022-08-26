package TrafficLight;

public class TrafficLight implements State{
    State redLight;
    State greenLight;
    State yellowLight;

    State currentLight;

    public TrafficLight(){
        greenLight = new GreenState(this);
        yellowLight = new YellowState(this);
        redLight = new RedState(this);

        currentLight = greenLight;
    }

    public State getCurrentLight() {
        return currentLight;
    }

    public void setCurrentLight(State currentLight) {
        this.currentLight = currentLight;
    }

    public State getGreenLight() {
        return greenLight;
    }

    public void setGreenLight(State greenLight) {
        this.greenLight = greenLight;
    }

    public State getRedLight() {
        return redLight;
    }

    public void setRedLight(State redLight) {
        this.redLight = redLight;
    }

    public State getYellowLight() {
        return yellowLight;
    }

    public void setYellowLight(State yellowLight) {
        this.yellowLight = yellowLight;
    }

    @Override
    public void warn() {
        currentLight.warn();
    }

    @Override
    public void change() {
        currentLight.change();
    }

    
}
