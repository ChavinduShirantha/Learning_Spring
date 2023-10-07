package lk.ijse.spring.pojo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @author : Chavindu
 * created : 10/7/2023-4:15 PM
 **/
@Component
public class Pojo implements InitializingBean  {
    @Value("${USERNAME}")
    private String userName;

    @Value("localhost://3306")
    private String url;

    @Value("ijse.lk")
    private String email;

    @Autowired
    Environment env;
    public Pojo() {
        System.out.println("Pojo Instantiate");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("USERNAME : " + this.userName);
        System.out.println(this.url);
        System.out.println(this.email);

        String username1 = env.getProperty("USERNAME");

        String username2 = env.getRequiredProperty("USERNAME");

        System.out.println(username1);

        System.out.println(username2);
    }
}
