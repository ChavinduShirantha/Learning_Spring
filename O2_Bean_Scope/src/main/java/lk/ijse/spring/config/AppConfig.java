package lk.ijse.spring.config;

import lk.ijse.spring.pojo.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Chavindu
 * created : 9/24/2023-1:40 PM
 **/

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring.pojo")
public class AppConfig {
    public AppConfig() {
        System.out.println("App Config Constructor");
    }


    /*bean methods*/
    @Bean
    public BasicDataSource basicDataSource(){
        return new BasicDataSource();
    }
}
