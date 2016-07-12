package pattern.strategy;

/**
 * @author xueaohui
 */
public class FlyNoWay implements FlyBehavior{
    public void fly() {
        System.out.println("怎么也不会飞");
    }
}
