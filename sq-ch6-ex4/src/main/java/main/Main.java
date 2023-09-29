package main;

import configurations.ProjectConfig;
import models.Comment;
import org.slf4j.Logger;
import org.slf4j.simple.SimpleLoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class Main {
    private static final Logger logger = new SimpleLoggerFactory().getLogger(Main.class.getSimpleName());

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Comment comment = new Comment();
        comment.setText("Hello spring");

        var commentService = context.getBean(CommentService.class);

        var returnedValue = commentService.publishComment(comment);
        logger.info("Returned value: " + returnedValue);

        commentService.deleteComment(comment);
    }
}
