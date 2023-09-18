package configurations;

import beans.Parrot;
import beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Person person(){
        Person p = new Person();
        p.setName("Lola");
        p.setParrot(parrot()); // Здесь не создается новый объект, а берется из контекста уже существующий
        //т.к. спринг отслеживает вызовы методов и при необходимости применяет определенную логику
        return p;
    }

    @Bean
    Parrot parrot(){
        Parrot p = new Parrot();
        p.setName("Kiki");
        return p;
    }
}
