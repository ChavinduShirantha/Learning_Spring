package lk.ijse.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Chavindu
 * created : 10/1/2023-3:16 PM
 **/
@Configuration
@ComponentScan(basePackages = "lk.ijse.spring.bean")
public class AppConfig {
    public AppConfig(){
        System.out.println("AppConfig Constructor");
    }
}
