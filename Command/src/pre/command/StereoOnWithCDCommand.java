package pre.command;

import pre.Command;
import pre.manufactory.Stereo;

/**
 * @author yanyuchi
 * @date 2019-06-30 16:11
 */
public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setDvd("Black Car");
        stereo.setVolume(11);
    }
}
