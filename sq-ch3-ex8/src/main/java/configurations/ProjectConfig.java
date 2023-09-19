package configurations;

import beans.Parrot;
import beans.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Parrot parrot1() {
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    Parrot parrot2() {
        Parrot p = new Parrot();
        p.setName("Kiki");
        return p;
    }

    @Bean
    Person person(
            @Qualifier("parrot2") Parrot parrot) {
        Person p = new Person(parrot);
        p.setName("Lola");
        return p;
    }
}
