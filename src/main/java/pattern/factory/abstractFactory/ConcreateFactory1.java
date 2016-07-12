package pattern.factory.abstractFactory;

/**
 * @author xueaohui
 */
public class ConcreateFactory1 implements AbstractFactory {
    public AbstractProductA createProductA(String type) {
        System.out.println("工厂1制造。。。");
        AbstractProductA abstractProductA = null;

        if(type.equals("1")){
            abstractProductA = new ProductA1();
        }else if(type.equals("1")){
            abstractProductA = new ProductA2();
        }

        return abstractProductA;
    }

    public AbstractProductB createProductB(String type) {
        System.out.println("工厂1制造。。。");

        AbstractProductB abstractProductB = null;

        if(type.equals("1")){
            abstractProductB = new ProductB1();
        }else if(type.equals("1")){
            abstractProductB = new ProductB2();
        }

        return abstractProductB;
    }
}
