package TrafficLight;

public class RedState implements State{
    TrafficLight trafficLight;

    public RedState(TrafficLight trafficLight){
        this.trafficLight = trafficLight;
    }

    @Override
    public void change() {
        System.out.println("RED to GREEN");
        trafficLight.setCurrentLight(trafficLight.getGreenLight());
    }

    @Override
    public void warn() {
        System.out.println("You MUST STOP!");
    }


}
