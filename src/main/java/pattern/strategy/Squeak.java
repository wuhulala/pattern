package pattern.strategy;

/**
 * @author xueaohui
 */
public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("鸭子吱吱交。");
    }
}
