package com.hk.userservice.dto;

import jakarta.persistence.Embeddable;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable

public class Comment {
    private int commentId;
    private String commentDetails;
}
