import configuration.AppConfig2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac1 = new AnnotationConfigApplicationContext(AppConfig2.class);
        ac1.close();
    }
}
