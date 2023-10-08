package lk.ijse.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author : Chavindu
 * created : 10/7/2023-4:51 PM
 **/
@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"lk.ijse.spring.pojo","lk.ijse.spring.controller"})
public class WebAppConfig {
    public WebAppConfig(){
        System.out.println("WebAppConfig Instantiated");
    }
    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver irvr = new InternalResourceViewResolver();
        irvr.setPrefix("/");
        irvr.setSuffix(".jsp");
        return irvr;
    }
}
