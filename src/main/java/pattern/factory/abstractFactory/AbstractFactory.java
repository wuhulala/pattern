package pattern.factory.abstractFactory;

/**
 * @author xueaohui
 */
public interface AbstractFactory {
    AbstractProductA createProductA(String type);
    AbstractProductB createProductB(String type);
}
