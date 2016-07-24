package pattern.state;

/**
 * @author xueaohui
 */
public class SoldOutState implements State{
    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }


    public void insertQuarter() {
        System.out.println("已经卖完了，晚点来吧！");
    }

    public void ejectQuarter() {
        System.out.println("已经卖完了，晚点来吧！");
    }

    public void turnCrank() {
        System.out.println("已经卖完了，晚点来吧！");

    }

    public void dispense() {
        System.out.println("已经卖完了，晚点来吧！");
    }

    @Override
    public String toString() {
        return "SoldOutState";
    }
}
