package pattern.factory.simpleFactory;

/**
 * @author xueaohui
 */
public class PizzaStore {
    private SimplePizzaFactory simplePizzaFactory;

    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza = simplePizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
