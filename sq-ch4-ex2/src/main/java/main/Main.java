package main;

import configurations.ProjectConfig;
import models.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Comment comment = new Comment();
        comment.setAuthor("Lola");
        comment.setText("Hello spring");

        CommentService service = context.getBean(CommentService.class);
        service.publishComment(comment);
    }
}
