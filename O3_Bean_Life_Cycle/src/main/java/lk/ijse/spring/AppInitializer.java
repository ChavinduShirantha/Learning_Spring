package lk.ijse.spring;

import lk.ijse.spring.beans.BeanA;
import lk.ijse.spring.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : Chavindu
 * created : 9/28/2023-9:41 AM
 **/

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

        /*Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("This is the method before shutdown JVM");
                ctx.close();
            }
        }));*/

        BeanA bean1 = ctx.getBean(BeanA.class);
        System.out.println(bean1);

        BeanA bean2 = ctx.getBean(BeanA.class);
        System.out.println(bean2);
    }
}
