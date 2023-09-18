package main;

import beans.Parrot;
import beans.Person;
import configurations.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var context = new  AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot parrot = context.getBean(Parrot.class);
        Person person = context.getBean(Person.class);

        System.out.println("Person's name is : " + person.getName());
        System.out.println("Person's parrot is : " + person.getParrot());
        System.out.println("Parrot's name is : " + parrot.getName());
    }
}
