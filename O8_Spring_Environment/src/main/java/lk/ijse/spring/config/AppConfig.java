package lk.ijse.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author : Chavindu
 * created : 10/7/2023-4:15 PM
 **/
@Configuration
@ComponentScan(basePackages = "lk.ijse.spring.pojo")
@PropertySource("classpath:resource.properties")
@PropertySource("classpath:application.properties")
public class AppConfig {
    public AppConfig(){
        System.out.println("AppConfig Instantiate");
    }
}
