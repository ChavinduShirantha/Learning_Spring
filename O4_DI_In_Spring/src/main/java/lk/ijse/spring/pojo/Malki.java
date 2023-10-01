package lk.ijse.spring.pojo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author : Chavindu
 * created : 9/18/2023-3:47 PM
 **/
@Component
@Primary
public class Malki implements GoodGirl {

    public Malki() {
        System.out.println("Malki Instantiated හලෝ");
    }

    @Override
    public void chatting() {
        System.out.println("Malki Chatting");
    }
}
