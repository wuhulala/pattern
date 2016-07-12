package pattern.singleton;

/**
 * @author xueaohui
 */
public class SingletonRunable1 implements Runnable{

    public void run() {
        System.out.println(SingletonOne.getInstance());
    }
}
