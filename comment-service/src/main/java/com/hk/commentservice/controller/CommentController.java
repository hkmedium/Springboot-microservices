package com.hk.commentservice.controller;


import com.hk.commentservice.dto.Comment;
import com.hk.commentservice.entity.Department;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/comment/v1")
@Slf4j
public class CommentController {
    @GetMapping("/comments/{commentId}")
    public Comment getCommentById(@PathVariable int commentId) {
        Comment comment = new Comment(commentId, "We love microservice Id: " + commentId);
        return comment;
    }
}
