package pre.test;

import pre.RemoteControl;
import pre.command.LightOffCommand;
import pre.command.LightOnCommand;
import pre.command.StereoOffCommand;
import pre.command.StereoOnWithCDCommand;
import pre.manufactory.Light;
import pre.manufactory.Stereo;

/**
 * @author yanyuchi
 * @date 2019-06-30 16:15
 */
public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("kitchenLight");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchLightOff = new LightOffCommand(kitchenLight);

        Stereo stereo = new Stereo();

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);

        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remoteControl.setCommand(0,livingRoomLightOn,livingRoomLightOff);
        remoteControl.setCommand(1,kitchenLightOn,kitchLightOff);
        remoteControl.setCommand(2,stereoOnWithCD,stereoOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);


    }
}
