package pattern.decorator;

/**
 * @author xueaohui
 */
public class Client {
    public static void main(String[] args){
        Beverage beverage = new Espresso();
        System.out.println("名称描述:"+beverage.getDescription()+"\n\r花费:"+beverage.cost());

        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);

        System.out.println("名称描述:"+beverage.getDescription()+"\n\r花费:"+beverage.cost());
    }
}
