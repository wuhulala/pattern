package pattern.singleton;

/**
 * @author xueaohui
 */
public class Client {
    public static void main(String[] args){
        for(int i = 0 ; i < 10; i ++){
            Thread thread = new Thread(new SingletonRunable1());
            thread.start();
        }
    }
}


