package pre.client;

import pre.Command;

/**
 * @author yanyuchi
 * @date 2019-06-30 14:07
 */
public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl(){}


    public void setCommand(Command command){
        slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
