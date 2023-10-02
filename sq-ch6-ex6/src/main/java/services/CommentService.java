package services;

import annotations.ToLog;
import models.Comment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.simple.SimpleLoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    private final Logger logger = LoggerFactory.getLogger(CommentService.class);

    @ToLog
    public Object publishComment(Comment comment) {
        logger.info("Publishing comment: " + comment.getText());
        return "SUCCESS";
    }


    public void deleteComment(Comment comment) {
        logger.info("Deleting comment: " + comment.getText());
    }

}
