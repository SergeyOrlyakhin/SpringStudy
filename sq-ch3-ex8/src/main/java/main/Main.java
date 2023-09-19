package main;

import beans.Person;
import configurations.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);

        System.out.println("Person's name is : " + person.getName());
        System.out.println("Person's parrot is : " + person.getParrot());
    }
}
