package pattern.strategy;

/**
 * @author xueaohui
 */
public class Client {
    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
    }
}
