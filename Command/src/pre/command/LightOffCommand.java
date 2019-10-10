package pre.command;

import pre.Command;
import pre.manufactory.Light;

/**
 * @author yanyuchi
 * @date 2019-06-30 16:08
 */
public class LightOffCommand implements Command {


    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }



    @Override
    public void execute() {
        light.off();
    }
}
