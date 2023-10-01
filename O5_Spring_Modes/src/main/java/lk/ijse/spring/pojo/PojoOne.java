package lk.ijse.spring.pojo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author : Chavindu
 * created : 10/1/2023-3:29 PM
 **/
@Component
public class PojoOne {

    public PojoOne(){
        System.out.println("Pojo 1 Instantiate");
    }

    /*Light mode*/

    @Bean
    public PojoTwo pojo2() {
//        Inter bean dependencies
//        Inter bean dependency invocation
        PojoThree pojo3 = pojo3();
        PojoThree pojo03 = pojo3();
        System.out.println(pojo3);
        System.out.println(pojo03);

        return new PojoTwo();
    }

    @Bean
    public PojoThree pojo3() {
        return new PojoThree();
    }
}
