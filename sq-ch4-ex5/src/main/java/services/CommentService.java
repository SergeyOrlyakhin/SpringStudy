package services;

import models.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import proxies.CommentNotificationProxy;
import repositories.CommentRepository;

@Component
public class CommentService {
    private final CommentNotificationProxy notificationProxy;
    private final CommentRepository commentRepository;

    @Autowired
    public CommentService(@Qualifier(value = "push") CommentNotificationProxy notificationProxy, CommentRepository commentRepository) {
        this.notificationProxy = notificationProxy;
        this.commentRepository = commentRepository;
    }

    public void publishComment(Comment comment) {
        notificationProxy.sendComment(comment);
        commentRepository.storeComment(comment);
    }
}
