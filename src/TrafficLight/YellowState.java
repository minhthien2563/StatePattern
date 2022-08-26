package TrafficLight;

public class YellowState implements State{
    TrafficLight trafficLight;

    public YellowState(TrafficLight trafficLight){
        this.trafficLight = trafficLight;
    }

    @Override
    public void change() {
        System.out.println("YELLOW to RED");
        trafficLight.setCurrentLight(trafficLight.getRedLight());
    }

    @Override
    public void warn() {
        System.out.println("You can go slowly then STOP.");
    }
}
