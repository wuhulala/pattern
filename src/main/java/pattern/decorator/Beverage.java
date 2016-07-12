package pattern.decorator;

/**
 * @author xueaohui
 *
 * 抽象组建类
 */
public abstract class Beverage {
    public final static int TALL = 1;
    public final static int GRANDE = 2;
    public final static int VENTI = 3;
    int size;
    String description = "UNKNOWN Beverage";

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getDescription(){
        return description;
    }
    public abstract double cost();
}
