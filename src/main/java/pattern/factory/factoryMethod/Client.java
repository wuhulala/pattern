package pattern.factory.factoryMethod;



/**
 * @author xueaohui
 */
public class Client {
    public static void main(String[] args){
        PizzaStore pizzaStore = new NYPizzaStore();
        pizzaStore.orderPizza("cheese");
    }
}
