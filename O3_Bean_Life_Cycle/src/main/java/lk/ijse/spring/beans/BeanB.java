package lk.ijse.spring.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author : Chavindu
 * created : 9/28/2023-9:41 AM
 **/
@Component
@Scope("prototype")
public class BeanB implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public BeanB() {
        System.out.println("Bean B Constructor : Instantiate");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean B name Awareness : " + s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean B Factory Awareness(DI) : ");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Bean B Application Context Awareness(DP,AOP) : ");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean B Is ready to use ");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("End of the Bean B");
    }
}
