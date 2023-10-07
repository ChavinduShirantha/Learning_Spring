package lk.ijse.spring.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Chavindu
 * created : 10/7/2023-4:31 PM
 **/
@Configuration
public class WebRootConfig implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public WebRootConfig() {
        System.out.println("WebRootConfig Instantiate");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("WebRootConfig Factory Awareness(DI) : " );
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("WebRootConfig name Awareness : " + s);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("End of the WebRootConfig");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("WebRootConfig Is ready to use ");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("WebRootConfig Application Context Awareness(DP,AOP) : " );
    }
}
