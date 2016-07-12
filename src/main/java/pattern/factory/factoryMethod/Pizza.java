package pattern.factory.factoryMethod;

import java.util.ArrayList;

/**
 * @author xueaohui
 */
public class Pizza {

    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();


    public void prepare(){
        System.out.println("准备材料");
        System.out.println("添加酱汁");
        System.out.println("添加料");
        for (int i = 0 ; i < toppings.size() ; i ++){
            System.out.println("  " + toppings.get(i));
        }
    }

    public void bake(){
        System.out.println("烘烤中。。。");
    }

    public void cut(){
        System.out.println("切块。。。");
    }

    public void box(){
        System.out.println("装箱。。。");
    }
}
