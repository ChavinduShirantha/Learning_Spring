package lk.ijse.spring.config;

import lk.ijse.spring.pojo.PojoThree;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Chavindu
 * created : 10/7/2023-11:01 AM
 **/
@Configuration
@ComponentScan(basePackages = "lk.ijse.spring.pojo")
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig Instantiate");
    }
    @Bean
    public PojoThree pojoThree(){
        return new PojoThree();
    }
}
