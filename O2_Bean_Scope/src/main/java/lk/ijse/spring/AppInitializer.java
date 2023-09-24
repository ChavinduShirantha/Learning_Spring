package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.pojo.BasicDataSource;
import lk.ijse.spring.pojo.Pojo;
import lk.ijse.spring.pojo.Pojo2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : Chavindu
 * created : 9/24/2023-1:42 PM
 **/

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        Pojo bean = ctx.getBean(Pojo.class);
        bean.PojoIsWorking();
        System.out.println(bean);

        Pojo bean1 = ctx.getBean(Pojo.class);
        System.out.println(bean1);

        Pojo bean2 = (Pojo) ctx.getBean("pojo-bro");
        System.out.println(bean2);

        Pojo2 bean3 = (Pojo2) ctx.getBean("pojo2");
        System.out.println(bean3);

        BasicDataSource pool = ctx.getBean(BasicDataSource.class);
        System.out.println(pool);

        BasicDataSource pool1 = ctx.getBean(BasicDataSource.class);
        System.out.println(pool1);

        BasicDataSource pool2 = (BasicDataSource) ctx.getBean("basicDataSource");
        System.out.println(pool2);

    }
}

