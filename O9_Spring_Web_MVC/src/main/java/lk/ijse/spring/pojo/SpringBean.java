package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author : Chavindu
 * created : 10/7/2023-4:33 PM
 **/

@Component
public class SpringBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public SpringBean() {
        System.out.println("SpringBean Instantiate");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("SpringBean Factory Awareness(DI) : " );
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("SpringBean name Awareness : " + s);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("End of the SpringBean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("SpringBean Is ready to use ");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("SpringBean Application Context Awareness(DP,AOP) : " );
    }
}
