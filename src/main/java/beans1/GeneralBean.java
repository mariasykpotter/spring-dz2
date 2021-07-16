package beans1;

public abstract class GeneralBean {
    private String name;
    private Integer value;

    public String getName() {
        return name;
    }

    public Integer getValue() {
        return value;
    }

    public GeneralBean(String nam, Integer val) {
        name = nam;
        value = val;
    }
    public boolean validate(){
        if (name!=null && value>0){
            return true;
        }
        return false;
    }
}
