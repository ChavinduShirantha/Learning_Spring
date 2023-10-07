package lk.ijse.spring.config;

import lk.ijse.spring.pojo.PojoTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Chavindu
 * created : 10/7/2023-11:07 AM
 **/
@Configuration
public class ConfigTwo {
    public ConfigTwo() {
        System.out.println("ConfigTwo Instantiate");
    }

    @Bean
    public PojoTwo pojoTwo(){
        return new PojoTwo();
    }
}
