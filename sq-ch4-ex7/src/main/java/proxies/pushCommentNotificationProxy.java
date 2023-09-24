package proxies;

import models.Comment;
import org.springframework.stereotype.Component;

@Component("push")
public class pushCommentNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Pushing notification for comment: " + comment.getText());
    }
}
