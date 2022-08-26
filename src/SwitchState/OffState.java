package SwitchState;

public class OffState implements State{
    public void doAction(Switch switch1){
        System.out.println("User is in off state.");
        switch1.setState(this);
    }

    public String toString(){
        return "Off state";
    }
}
