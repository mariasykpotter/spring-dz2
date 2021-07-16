package beans1;

public class BeanD extends GeneralBean{
    private String name;
    private Integer value;

    public BeanD(String nam, Integer val) {
        super(nam,val);
        System.out.println("BeanD constructor");
    }

    @Override
    public String toString() {
        return "BeanD{" +
                "country='" + getName() + '\'' +
                ", population='" + getValue() + '\'' +
                '}';
    }

    private void init() {
        System.out.println("BeanD initialization");
    }

    private void destroy() {
        System.out.println("BeanD destroyed");
    }
}
