package pre.command;

import pre.Command;
import pre.manufactory.Light;

/**
 * @author yanyuchi
 * @date 2019-06-30 14:00
 */
public class LightOnCommand implements Command {
    Light light;


    public LightOnCommand(Light light){
        this.light = light;
    }



    @Override
    public void execute() {
        light.on();
    }
}
