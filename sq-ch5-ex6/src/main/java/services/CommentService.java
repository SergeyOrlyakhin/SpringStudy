package services;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE) // при обращении к бину в контексте будет создаваться новый бин
public class CommentService {

    private static int counter;

    public CommentService() {
        counter++;
        System.out.println("Bean CommentService №" + counter + " is created: " + Thread.currentThread().getName());
    }

}
