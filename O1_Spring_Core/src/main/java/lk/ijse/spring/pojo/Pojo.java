package lk.ijse.spring.pojo;

import org.springframework.stereotype.Component;

/**
 * @author : Chavindu
 * created : 9/24/2023-1:35 PM
 **/
@Component("pojo-bro")
public class Pojo {
    public Pojo() {
        System.out.println("Pojo Constructor");
    }

    public void PojoIsWorking(){
        System.out.println("PojoIsWorking Method");
    }
}
