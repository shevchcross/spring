package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ${Aleksey} on 24.07.2018.
 */
@Configuration
public class JavaApplicatContext {
   @Bean()
  public Library library (){
       Library l =new Library();
       l.setAutor("Autor");
       l.setKind("kind");
       l.setYear(1234567);
       return l;
   }
}
