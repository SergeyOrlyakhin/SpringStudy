package main;

import beans.Parrot;
import configurations.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var context = new  AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot parrot = new Parrot();
        parrot.setName("Kiki");
        Supplier<Parrot> supplier = () -> parrot;
        context.registerBean("Kiki", Parrot.class, supplier);

        Parrot p = (Parrot) context.getBean("Kiki");
        System.out.println(p.getName());
    }
}
