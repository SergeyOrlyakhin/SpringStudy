package services;

import models.Comment;
import proxies.CommentNotificationProxy;
import repositories.CommentRepository;

public class CommentService {
    private final CommentNotificationProxy notificationProxy;
    private final CommentRepository commentRepository;

    public CommentService(CommentNotificationProxy notificationProxy, CommentRepository commentRepository) {
        this.notificationProxy = notificationProxy;
        this.commentRepository = commentRepository;
    }

    public void publishComment(Comment comment) {
        notificationProxy.sendComment(comment);
        commentRepository.storeComment(comment);
    }
}
