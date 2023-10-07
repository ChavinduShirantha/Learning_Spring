package lk.ijse.spring.pojo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author : Chavindu
 * created : 10/7/2023-11:16 AM
 **/
@Component
public class Pojo implements InitializingBean {
    @Value("Galle Ijse")
    private String address;
   /* public Pojo() {
        System.out.println("Pojo Instantiate");
    }

    public Pojo(@Value("Hello Spring") String id){
        System.out.println("Pojo One Instantiate : "+id);
    }

    public Pojo(@Value("C001,C002,C003,C004,C005") String[] ids) {
        System.out.println("Pojo One Instantiate : ");
        for (String id : ids) {
            System.out.println(id);
        }
        System.out.println(this.address);
    }*/

    @Autowired(required = false)
    public Pojo(@Value("Chavindu") String name,@Value("Galle") String address,@Value("0704230389") String tp) {
        System.out.println("Constructor One");
    }

    @Autowired(required = false)
    public Pojo(@Value("Chavindu")String name, @Value("Galle")String address) {
        System.out.println("Constructor Two");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this.address);
    }
}
