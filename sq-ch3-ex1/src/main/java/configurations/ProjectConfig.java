package configurations;

import beans.Parrot;
import beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Parrot parrot(){
        Parrot p = new Parrot();
        p.setName("Kiki");
        return p;
    }

    @Bean
    Person person(){
        Person p = new Person();
        p.setName("Lola");
        return p;
    }


}
