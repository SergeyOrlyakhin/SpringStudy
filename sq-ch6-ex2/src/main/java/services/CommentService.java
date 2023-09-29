package services;

import models.Comment;
import org.slf4j.Logger;
import org.slf4j.simple.SimpleLoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    private final Logger logger = new SimpleLoggerFactory().getLogger(CommentService.class.getSimpleName());


    public Boolean publishComment(Comment comment) {
        logger.info("Publishing comment: " + comment.getText());
        return true;
    }

}
