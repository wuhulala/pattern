package pattern.state;

/**
 * @author xueaohui
 */
public class GumballMachine {
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State soldOutState;

    private State state = soldOutState;

    public GumballMachine(int count) {
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldState = new SoldState(this);
        this.soldOutState = new SoldOutState(this);
        this.count = count;
        if(count > 0){
            state = noQuarterState;
        }
    }

    private int count = 0;

    public int getCount() {
        return count;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void releaseBall() {
        System.out.println("发送一个糖果");
        if(count != 0){
            count = count - 1;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                ", state=" + state +
                ", count=" + count +
                '}';
    }
}
