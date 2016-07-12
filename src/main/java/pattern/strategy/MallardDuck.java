package pattern.strategy;

/**
 * @author xueaohui
 *
 * 绿头鸭
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        setQuackBehavior(new Quack());
        setFlyBehavior(new FlyWithWings());
    }

    public void display(){
        System.out.println("我是一只 mallard 鸭");
    }
}
