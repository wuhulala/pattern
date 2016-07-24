package pattern.state;

/**
 * @author xueaohui
 */
public class NoQuarterState implements State{
    private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }


    public void insertQuarter() {
        System.out.println("投币成功");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    public void ejectQuarter() {
        System.out.println("您没有投钱怎么会有钱");
    }

    public void turnCrank() {
        System.out.println("先投入25分钱");

    }

    public void dispense() {
        System.out.println("先支付再说其他的");
    }

    @Override
    public String toString() {
        return "NoQuarterState";
    }
}
