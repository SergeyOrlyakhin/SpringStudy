package multithread;

import configurations.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class MultiThread implements Runnable  {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);


    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            var bean1 = context.getBean(CommentService.class);
            var bean2 = context.getBean(CommentService.class);
            System.out.println(bean1 == bean2);
        }
    }
}
