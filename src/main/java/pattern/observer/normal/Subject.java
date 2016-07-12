package pattern.observer.normal;

/**
 * @author xueaohui
 *
 * 主题
 */
public interface Subject {
    /**
     * 注册观察者
     */
    void registerObserver(Observer o);

    /**
     * 移除观察者
     */
    void removeObserver(Observer o);

    /**
     * 更新所有观察者
     */
    void notifyObserver();
}

