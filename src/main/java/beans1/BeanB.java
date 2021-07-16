package beans1;

public class BeanB extends GeneralBean {
    public BeanB(String nam, Integer val) {
        super(nam, val);
        System.out.println("BeanB constructor");
    }

    @Override
    public String toString() {
        return "BeanB{" +
                "country='" + getName() + '\'' +
                ", population='" + getValue() + '\'' +
                '}';
    }

    private void init() {
        System.out.println("BeanB initialization 1");
    }

    private void init_method() {
        System.out.println("BeanB initialization 2");
    }

    private void destroy() {
        System.out.println("BeanB destroyed");
    }
}
