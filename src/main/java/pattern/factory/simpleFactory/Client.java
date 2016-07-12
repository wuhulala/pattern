package pattern.factory.simpleFactory;

/**
 * @author xueaohui
 */
public class Client {
    public static void main(String[] args){
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);
        pizzaStore.orderPizza("veggie");
    }
}
