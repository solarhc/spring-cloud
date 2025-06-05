package com.welab.backend_post.domain.event;

import com.welab.backend_post.domain.Post;
import com.welab.backend_post.domain.PostComment;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostCommentEvent {
    public static final String Topic = "post-comment";

    private String action;

    private String userId;

    private String comment;

    @Getter
    @Setter
    public static class TargetPost {
        private String userId;

        private String title;

        private String content;
    }

    private TargetPost targetPost;

    public static PostCommentEvent fromEntity(String action, PostComment postComment) {
        PostCommentEvent event = new PostCommentEvent();

        event.action = action;

        event.userId = postComment.getUserId();
        event.comment = postComment.getComment();

        Post post = postComment.getPost();
        if (post != null) {
            event.targetPost = new TargetPost();

            event.targetPost.userId = post.getUserId();
            event.targetPost.title = post.getTitle();
            event.targetPost.content = post.getContent();
        }

        return event;
    }
}
