package DYNAMICProxy.JDKProxy;

/**
 * @author yanyuchi
 * @date 2021-01-14 20:26
 */
public class PersonBeanImpl implements PersonBean{


    String name;

    String gender;

    int rating;

    int ratingCount = 0;


    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getHotOrNotRating() {
        if(ratingCount==0) return 0;
        return (rating/ratingCount);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setHotOrNotRating(int rating) {
        this.rating+=rating;
        ratingCount++;
    }
}
