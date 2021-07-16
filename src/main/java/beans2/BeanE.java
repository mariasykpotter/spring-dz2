package beans2;

import beans1.GeneralBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanE extends GeneralBean {
    private String name;
    private Integer value;

    public BeanE(String nam, Integer val) {
        super(nam,val);
        System.out.println("BeanE initialization");
    }

    @PostConstruct
    public void init() {
        System.out.println("PostConstruct for BeanE");
    }

    @PreDestroy
    private void shutdown() {

























        System.out.println("Predestroy for BeanE");
    }

    @Override
    public String toString() {
        return "BeanE{" +
                "country='" + getName() + '\'' +
                ", population='" + getValue() + '\'' +
                '}';
    }
}
