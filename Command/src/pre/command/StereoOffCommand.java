package pre.command;

import pre.Command;
import pre.manufactory.Stereo;

/**
 * @author yanyuchi
 * @date 2019-06-30 16:21
 */
public class StereoOffCommand implements Command {

    Stereo stereo;

    public StereoOffCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
