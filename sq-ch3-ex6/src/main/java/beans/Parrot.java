package beans;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name = "Kiki";

    public Parrot() {
        System.out.println("Parrot created");
    }

    @Override
    public String toString() {
        return "Parrot : " + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
