import beans1.BeanF;
import beans1.GeneralBean;
import beans2.BeanA;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import postprocessors.MyBeanFactoryPostProcessor;
import postprocessors.MyBeanPostProcessor;

public class ApplicationDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac1 = new AnnotationConfigApplicationContext(AppConfig2.class);
//        BeanF beanF = ac1.getBean(BeanF.class);
        ac1.close();
    }
}
