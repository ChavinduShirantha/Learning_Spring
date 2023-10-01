package lk.ijse.spring.config;

import lk.ijse.spring.pojo.PojoThree;
import lk.ijse.spring.pojo.PojoTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Chavindu
 * created : 10/1/2023-3:28 PM
 **/
@Configuration
@ComponentScan(basePackages = "lk.ijse.spring.pojo")
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig Instantiate");
    }

    /*
    Full Mode
    @Bean
    public PojoTwo pojoTwo() {
//        Inter bean dependencies
//        Inter bean dependency invocation
        PojoThree pojoThree = pojoThree();
        PojoThree pojo03 = pojoThree();
        System.out.println(pojoThree);
        System.out.println(pojo03);

        return new PojoTwo();
    }

    @Bean
    public PojoThree pojoThree() {
        return new PojoThree();
    }
    */
}
