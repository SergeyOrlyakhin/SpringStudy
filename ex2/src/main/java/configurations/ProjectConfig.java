package configurations;

import beans.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean(name = "koko")
    @Primary
    Parrot parrot1() {
        Parrot parrot = new Parrot();
        parrot.setName("Koko");
        return parrot;
    }
    @Bean(name = "dave")
    Parrot parrot2() {
        Parrot parrot = new Parrot();
        parrot.setName("Dave");
        return parrot;
    }


    @Bean
    String hello() {
        return "hello";
    }
    @Bean
    String by() {
        return "by";
    }

    @Bean
    Integer one() {
        return 1;
    }
}
