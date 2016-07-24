package pattern.state;

/**
 * @author xueaohui
 */
public class SoldState implements State{
    private GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }


    public void insertQuarter() {
        System.out.println("等会再投");
    }

    public void ejectQuarter() {
        System.out.println("你已经支付了");
    }

    public void turnCrank() {
        System.out.println("在你购买的时候不能按两次");

    }

    public void dispense() {
        gumballMachine.releaseBall();
        if(gumballMachine.getCount() > 0){
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }else {
            gumballMachine.setState(gumballMachine.getSoldOutState());
            System.out.println("不好意思 已经售空了");
        }
    }

    @Override
    public String toString() {
        return "SoldState";
    }
}
