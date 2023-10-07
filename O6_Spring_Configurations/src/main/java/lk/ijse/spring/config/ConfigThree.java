package lk.ijse.spring.config;

import lk.ijse.spring.pojo.PojoThree;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Chavindu
 * created : 10/7/2023-11:07 AM
 **/
@Configuration
public class ConfigThree {
    public ConfigThree() {
        System.out.println("ConfigThree Instantiate");
    }

    @Bean
    public PojoThree pojoThree(){
        return new PojoThree();
    }
}
