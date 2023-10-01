package lk.ijse.spring.pojo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author : Chavindu
 * created : 9/18/2023-3:47 PM
 **/
@Component
@Primary
public class Dinuki implements GoodGirl{

    public Dinuki() {
        System.out.println("Dinuki Instantiated");
    }
    @Override
    public void chatting() {
        System.out.println("Dinuki Chatting");
    }
}
