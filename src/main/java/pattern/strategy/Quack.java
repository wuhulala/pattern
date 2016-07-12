package pattern.strategy;

/**
 * @author xueaohui
 */
public class Quack implements QuackBehavior {

    public void quack() {
        System.out.println("鸭子呱呱叫。");
    }
}
