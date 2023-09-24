package lk.ijse.spring.pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author : Chavindu
 * created : 9/24/2023-1:41 PM
 **/

@Component
@Scope("prototype")
public class Pojo2 {
    public Pojo2() {
        System.out.println("Pojo 2 Constructor");
    }
}
