package lk.ijse.spring.config;

import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Chavindu
 * created : 9/28/2023-9:41 AM
 **/
@Configuration
@ComponentScan(basePackages = "lk.ijse.spring.beans")
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig Constructor");
    }
}
