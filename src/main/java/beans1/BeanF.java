package beans1;

public class BeanF extends GeneralBean{
    private String name;
    private Integer value;

    public BeanF(String nam, Integer val) {
        super(nam,val);
        System.out.println("BeanF initialized");
    }

    @Override
    public String toString() {
        return "BeanF{" +
                "country='" + getName() + '\'' +
                ", population='" + getValue() + '\'' +
                '}';
    }
}
