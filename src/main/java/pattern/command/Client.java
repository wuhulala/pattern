package pattern.command;

/**
 * @author xueaohui
 */
public class Client {
    public static void main(String[] args){
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        simpleRemoteControl.setSlot(new LightOnCommand(new Light()));
        simpleRemoteControl.buttonWasPressed();
    }
}
