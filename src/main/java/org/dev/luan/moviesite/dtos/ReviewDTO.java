package org.dev.luan.moviesite.dtos;

import org.dev.luan.moviesite.repositories.projections.MovieReviewUserProjection;

public class ReviewDTO {

    private String text;
    private String username;

    public ReviewDTO (MovieReviewUserProjection p) {
        username = p.getUsername();
        text = p.getText();
    }


    public String getText() {
        return text;
    }

    public String getUsername() {
        return username;
    }
}
