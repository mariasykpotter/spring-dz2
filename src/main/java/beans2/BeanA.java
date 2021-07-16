package beans2;

import beans1.GeneralBean;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class BeanA extends GeneralBean implements InitializingBean, DisposableBean {
    public BeanA(String nam, Integer val) {
        super(nam, val);
        System.out.println("BeanA constructor");
    }

    @Override
    public String toString() {
        return "BeanA{" +
                "country='" + getName() + '\'' +
                ", population='" + getValue() + '\'' +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Properties were set for beanA");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("BeanA destroyed");
    }

}
