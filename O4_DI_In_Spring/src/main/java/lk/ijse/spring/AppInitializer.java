package lk.ijse.spring;


import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.pojo.Hashan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : Chavindu
 * created : 9/28/2023-10:26 AM
 **/

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

        Hashan bean = ctx.getBean(Hashan.class);
        bean.trying();
    }
}
