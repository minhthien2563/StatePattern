package TrafficLight;

public class TrafficLightTestDrive {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        trafficLight.change();
        trafficLight.warn();

        trafficLight.change();
        trafficLight.warn();
    }
}
