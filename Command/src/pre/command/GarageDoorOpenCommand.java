package pre.command;

import pre.Command;
import pre.manufactory.GarageDoor;

/**
 * @author yanyuchi
 * @date 2019-06-30 14:37
 */
public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
