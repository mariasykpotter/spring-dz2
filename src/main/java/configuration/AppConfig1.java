package configuration;

import beans1.BeanB;
import beans1.BeanC;
import beans1.BeanD;
import beans1.BeanF;
import beans2.BeanA;
import beans2.BeanE;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"beans1", "beans2","postprocessors"})
@PropertySource(value = "application.properties")
public class AppConfig1 {
    @Bean(initMethod = "init", destroyMethod = "destroy")
    @DependsOn("beanD")
    public BeanB beanB(@Value("${beanb.name}")String name,@Value("${beanb.value}") Integer value) {
        return new BeanB(name, value);
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    @DependsOn({"beanB", "beanD"})
    public BeanC beanC(@Value("${beanc.name}") String name, @Value("${beanc.value}") Integer value) {
        return new BeanC(name, value);
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BeanD beanD(@Value("${beand.name}") String name, @Value("${beand.value}") Integer value) {
        return new BeanD(name, value);
    }

    @Bean
    public BeanA beanA(@Value("Hungary") String name, @Value("1000000") Integer value) {
        return new BeanA(name, value);
    }
    @Bean
    public BeanE beanE(@Value("Greece") String name, @Value("-25000000") Integer value) {
        return new BeanE(name, value);
    }
    @Bean
    @Lazy
    public BeanF beanF(@Value("Croatia") String name, @Value("15000000") Integer value) {
        return new BeanF(name, value);
    }
}
