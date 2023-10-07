package lk.ijse.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Chavindu
 * created : 10/7/2023-11:15 AM
 **/
@Configuration
@ComponentScan(basePackages = "lk.ijse.spring.pojo")
public class AppConfig {
    public AppConfig(){
        System.out.println("AppConfig Instantiate");
    }
}
