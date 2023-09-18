package beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Parrot {
    private String name;

    public String getName() {
        return name;
    }

    @PostConstruct
    public void init() {
        this.name = "Koko";
    }

    public void setName(String name) {
        this.name = name;
    }
}
