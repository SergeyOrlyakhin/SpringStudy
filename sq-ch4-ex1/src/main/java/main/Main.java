package main;

import models.Comment;
import proxies.EmailCommentNotificationProxy;
import repositories.DBCommentRepository;
import services.CoommentService;

public class Main {
    public static void main(String[] args) {
        var emailCommentNotificationProxy = new EmailCommentNotificationProxy();
        var dBCommentRepository = new DBCommentRepository();

        Comment comment = new Comment();
        comment.setAuthor("Lola");
        comment.setText("Hello spring");

        CoommentService coommentService = new CoommentService(emailCommentNotificationProxy, dBCommentRepository);
        coommentService.publishComment(comment);
    }
}
