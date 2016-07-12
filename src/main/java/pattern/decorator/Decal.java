package pattern.decorator;

/**
 * @author xueaohui
 *
 * 低咖啡因
 */
public class Decal extends Beverage{
    public Decal() {
        description = "Decal";
    }

    @Override
    public double cost() {
        return 2.99;
    }
}
