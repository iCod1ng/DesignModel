package pre.manufactory;

/**
 * @author yanyuchi
 * @date 2019-06-30 16:03
 */
public class Stereo {

    private String dvd;

    private int volume;



    public void on(){
        System.out.println("Stereo is on");
    }

    public void off(){
        System.out.println("Stereo is on");
    }

    public void setDvd(String dvd){
        this.dvd =dvd;
        System.out.println("setDVD: "+dvd);
    }

    public void setVolume(int volume){
        this.volume = volume;
        System.out.println("setVolume: "+volume);
    }


}
