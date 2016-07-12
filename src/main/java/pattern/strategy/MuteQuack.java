package pattern.strategy;

/**
 * @author xueaohui
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("什么都不做。");
    }
}
