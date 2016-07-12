package pattern.factory.simpleFactory;

/**
 * @author xueaohui
 */
public class Pizza {
    public void prepare(){
        System.out.println("准备材料");
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
