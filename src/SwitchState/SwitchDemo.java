package SwitchState;

public class SwitchDemo {
    public static void main(String[] args) {
        Switch switch1 = new Switch();

        OnState onState = new OnState();
        onState.doAction(switch1);

        System.out.println(switch1.getState().toString());

        OffState offState = new OffState();
        offState.doAction(switch1);

        System.out.println(switch1.getState().toString());

    }
}
