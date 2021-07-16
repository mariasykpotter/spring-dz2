package postprocessors;

import beans1.GeneralBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
    Logger logger = Logger.getLogger(String.valueOf(MyBeanPostProcessor.class));

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {
        if (bean instanceof GeneralBean) {
            if (((GeneralBean) bean).validate()) {
                return bean;
            } else {
                logger.info("Invalid bean");
            }
        }
        return null;
    }
}
