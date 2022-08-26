package TrafficLight;

public class GreenState implements State{
    TrafficLight trafficLight;

    public GreenState(TrafficLight trafficLight){
        this.trafficLight = trafficLight;
    }

    @Override
    public void change() {
        System.out.println("GREEN to YELLOW");
        trafficLight.setCurrentLight(trafficLight.getYellowLight());
    }

    @Override
    public void warn() {
        System.out.println("You can go.");
    }


}
