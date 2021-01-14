package DYNAMICProxy.JDKProxy;

/**
 * Person接口
 */
public interface PersonBean {

    String getName();

    String getGender();

    int getHotOrNotRating();

    void setName(String name);

    void setGender(String gender);

    void setHotOrNotRating(int rating);
}
