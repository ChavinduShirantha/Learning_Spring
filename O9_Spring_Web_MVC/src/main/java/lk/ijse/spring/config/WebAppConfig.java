package lk.ijse.spring.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author : Chavindu
 * created : 10/7/2023-4:31 PM
 **/
@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"lk.ijse.spring.pojo","lk.ijse.spring.controller"})
public class WebAppConfig implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public WebAppConfig() {
        System.out.println("WebAppConfig Instantiate");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("WebAppConfig Factory Awareness(DI) : " );
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("WebAppConfig name Awareness : " + s);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("End of the WebAppConfig");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("WebAppConfig Is ready to use ");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("WebAppConfig Application Context Awareness(DP,AOP) : " );
    }
}
