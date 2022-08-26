package SwitchState;

public class OnState implements State{
    public void doAction(Switch switch1){
        System.out.println("User is in on state.");
        switch1.setState(this);
    }

    public String toString(){
        return "On state";
    }
}
