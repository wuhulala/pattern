package pattern.state;

/**
 * @author xueaohui
 */
public interface State {
    /**
     * 投币
     */
    void insertQuarter();

    /**
     * 退币
     */
    void ejectQuarter();

    /**
     * 转动曲柄
     */
    void turnCrank();
    /**
     * 发糖果
     */
    void dispense();
}
