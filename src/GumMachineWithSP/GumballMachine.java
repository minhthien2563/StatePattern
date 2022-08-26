package GumMachineWithSP;

public class GumballMachine implements State{
    State soldOutState;
    State soldState;
    State hasQuarterState;
    State noQuarterState;

    State currentState;

    int countOfGumballs;

    public GumballMachine(int numberOfGumballs)  {
        countOfGumballs = numberOfGumballs;

        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        hasQuarterState = new HasQuarterState(this);
        noQuarterState = new NoQuarterState(this);

        currentState = noQuarterState;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public int getCountOfGumballs() {
        return countOfGumballs;
    }

    public void setCountOfGumballs(int countOfGumballs) {
        this.countOfGumballs = countOfGumballs;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public void setNoQuarterState(State noQuarterState) {
        this.noQuarterState = noQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public void insertQuarter() {
        currentState.insertQuarter();
    }

    public void turnCrank() {
        currentState.turnCrank();
    }

    public void ejectQuarter() {
        currentState.ejectQuarter();
    }

    public void dispense() {
        currentState.dispense();
    }

    public void releaseGumball() {
        System.out.println("A gumball comes rolling out...");
        if (countOfGumballs != 0) {
            countOfGumballs = countOfGumballs - 1;
        }
    }

    public State getHasQuarterState() {
        return hasQuarterState;
}

    
    

}
