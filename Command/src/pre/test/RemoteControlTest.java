package pre.test;

import pre.command.GarageDoorOpenCommand;
import pre.command.LightOnCommand;
import pre.client.SimpleRemoteControl;
import pre.manufactory.GarageDoor;
import pre.manufactory.Light;

/**
 * @author yanyuchi
 * @date 2019-06-30 14:10
 * 命令模式客户
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        //遥控器是调用者，会传入一个命令对象，可以发出请求  --》 女侍者
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();

        //请求的接受者   --》 厨师
        Light light = new Light();

        GarageDoor garageDoor = new GarageDoor();

        //创建一个命令，然后将接受者传给它 --》  订单
        LightOnCommand lightOn  = new LightOnCommand(light);

        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);

        //把命令传给调用者    --》 takeOrder()

        remoteControl.setCommand(lightOn);

        //orderUp()
        remoteControl.buttonWasPressed();

        System.out.println("========");

        remoteControl.setCommand(garageDoorOpen);

        remoteControl.buttonWasPressed();
    }
}
