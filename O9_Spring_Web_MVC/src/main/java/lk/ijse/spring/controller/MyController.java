package lk.ijse.spring.controller;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Chavindu
 * created : 10/7/2023-4:33 PM
 **/
@RestController
public class MyController implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public MyController() {
        System.out.println("MyController Instantiate");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("MyController : Bean Factory Awareness");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("MyController : Bean Name Awareness");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("MyController : Disposable Bean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("MyController : Initializing Bean");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("MyController : Application Context Awareness");
    }
}
