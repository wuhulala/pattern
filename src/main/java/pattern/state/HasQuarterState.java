package pattern.state;

/**
 * @author xueaohui
 */
public class HasQuarterState implements State{
    private GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }


    public void insertQuarter() {
        System.out.println("您已经投入币了，不能再投了");
    }

    public void ejectQuarter() {
        System.out.println("退钱成功");
        gumballMachine.setState(gumballMachine.getNoQuarterState());

    }

    public void turnCrank() {
        System.out.println("售出糖果成功");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    public void dispense() {
        System.out.println("执行错误");
    }

    @Override
    public String toString() {
        return "HasQuarterState";
    }
}
