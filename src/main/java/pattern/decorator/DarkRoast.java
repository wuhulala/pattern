package pattern.decorator;

/**
 * @author xueaohui
 *
 * 深烘培
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
