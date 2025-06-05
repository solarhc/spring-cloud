package com.welab.backend_alim.event.consumer.message.post;

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
}
