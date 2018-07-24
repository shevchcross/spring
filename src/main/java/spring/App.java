package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Aleksey on 16.07.2018.
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

       ApplicationContext context1 = new ClassPathXmlApplicationContext("beansAutowired.xml");
       Reader reader=(Reader) context1.getBean("ReaderBean");
       System.out.println(reader);

        ApplicationContext java = new AnnotationConfigApplicationContext(JavaApplicatContext.class);
        Library library=java.getBean(Library.class);
        System.out.println(library);
    }

}
