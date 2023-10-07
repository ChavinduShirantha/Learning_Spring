package lk.ijse.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author : Chavindu
 * created : 10/7/2023-4:51 PM
 **/
@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "lk.ijse.spring.pojo")
public class WebAppConfig {
    public WebAppConfig(){
        System.out.println("WebAppConfig Instantiated");
    }
}
