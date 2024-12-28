package com.hk.commentservice.dto;

import lombok.*;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Comment {
    private int commentId;
    private String commentDetails;
}
