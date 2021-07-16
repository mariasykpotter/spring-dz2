package beans1;

public class BeanC extends GeneralBean{
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
