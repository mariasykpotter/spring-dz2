package beans1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class BeanC extends GeneralBean{
    private String name;
    private Integer value;
    public BeanC(String nam,Integer val) {
        super(nam,val);
        System.out.println("BeanC constructor");
    }

    @Override
    public String toString() {
        return "BeanC{" +
                "country='" + getName() + '\'' +
                ", population='" + getValue() + '\'' +
                '}';
    }

    private void init() {
        System.out.println("BeanC initialization");
    }

    private void destroy() {
        System.out.println("BeanC destroyed");
    }
}
