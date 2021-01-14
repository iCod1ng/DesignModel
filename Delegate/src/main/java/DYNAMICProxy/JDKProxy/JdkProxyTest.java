package DYNAMICProxy.JDKProxy;

import java.lang.reflect.Proxy;

/**
 * @author yanyuchi
 * @date 2021-01-14 20:44
 */
public class JdkProxyTest {

    public static void main(String[] args) {
        JdkProxyTest jdkProxyTest = new JdkProxyTest();
        jdkProxyTest.test();
    }

    public void test(){
        PersonBean joe = new PersonBeanImpl();
        joe.setName("joe");
        joe.setGender("male");
        PersonBean ownerProxy = getOwnerProxy(joe);
        System.out.println("Name is "+ownerProxy.getName());
        try{
            ownerProxy.setHotOrNotRating(10);
        }catch (Exception e){
            System.out.println("Can't set rating from owner proxy");
        }
    }

    PersonBean getOwnerProxy(PersonBean person){
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
    }

    PersonBean getNonOwnerProxy(PersonBean person){
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person));
    }

}
