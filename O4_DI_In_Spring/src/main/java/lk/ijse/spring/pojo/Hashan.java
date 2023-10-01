package lk.ijse.spring.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author : Chavindu
 * created : 9/18/2023-3:37 PM
 **/
@Component
public class Hashan {


    @Autowired
    @Qualifier("malki")
    GoodGirl girl;
   /* @Autowired
    GoodGirl malki;*/

    public Hashan() {
        System.out.println("Hashan Instantiated");
    }

    public void trying() {
        girl.chatting();
//        dinuki.chatting();
//        malki.chatting();
    }
}
