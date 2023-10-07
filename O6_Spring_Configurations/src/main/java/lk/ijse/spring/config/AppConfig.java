package lk.ijse.spring.config;

import lk.ijse.spring.pojo.PojoOne;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author : Chavindu
 * created : 10/7/2023-11:01 AM
 **/
@Configuration
@ComponentScan(basePackages = "lk.ijse.spring")
//@Import({ConfigTwo.class,ConfigThree.class})
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig Instantiate");
    }

    @Bean
    public PojoOne pojoOne() {
        return new PojoOne();
    }
}
