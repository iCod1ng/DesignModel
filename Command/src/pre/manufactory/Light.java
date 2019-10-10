package pre.manufactory;

/**
 * @author yanyuchi
 * @date 2019-06-30 14:02
 */
public class Light {

    private String location;

    public Light(){

    }

    public Light(String location){
        this.location = location;
    }

    public void on(){

        System.out.println(location+" Light is on");

    }

    public void off(){
        System.out.println(location+" Light is off");

    }
}
