package pattern.singleton;

/**
 * @author xueaohui
 *
 * 单例模式最简单实现
 */
public class SingletonOne {
    private volatile static SingletonOne instance;
    private String name;
    private SingletonOne() {
        name = "由线程"+Thread.currentThread().getName()+"创建的单例";
    }

    /**
     *
     * 1.加上synchronized保持同步，但是性能消耗特别大 public static synchronized SingletonOne getInstance()
     * 2.加入volatile按照以下双重锁创建单例，注意：需要java 1.5+
     */
    public static SingletonOne getInstance(){
        if(instance == null){
            synchronized (SingletonOne.class){
                System.out.println("同步");
                if(instance == null){
                    instance = new SingletonOne();
                    System.out.println("创建");
                }
            }
        }
        return instance;
    }

    @Override
    public String toString() {
        return "SingletonOne{" +
                "name='" + name + '\'' +
                '}';
    }
}
