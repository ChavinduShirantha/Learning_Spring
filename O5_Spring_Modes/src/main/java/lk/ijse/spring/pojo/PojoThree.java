package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author : Chavindu
 * created : 10/1/2023-3:29 PM
 **/
/*This is not my class*/
public class PojoThree implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public PojoThree(){
        System.out.println("PojoThree Instantiate");
    }
    @Override
    public void setBeanName(String s) {
        System.out.println("Pojo 3 name Awareness : "+s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Pojo 3 Factory Awareness(DI) : ");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Pojo 3 Application Context Awareness(DP,AOP) : " );
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Pojo 3 Is ready to use ");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("End of the Pojo 3");
    }
}
