package org.dev.luan.moviesite.dtos;

import org.dev.luan.moviesite.entities.Movie;
import org.dev.luan.moviesite.repositories.projections.MovieReviewUserProjection;

import java.util.ArrayList;
import java.util.List;

public class MovieReviewDTO {

    private String title;
    private String subTitle;
    private Integer movieYear;
    private String imgUrl;
    private String synopsis;
    private List<ReviewDTO> reviews = new ArrayList<>();


    public MovieReviewDTO() {
    }


    public MovieReviewDTO(Long id, String title, String subTitle, Integer movieYear, String imgUrl, String synopsis, List<ReviewDTO> reviews) {
        this.title = title;
        this.subTitle = subTitle;
        this.movieYear = movieYear;
        this.imgUrl = imgUrl;
        this.synopsis = synopsis;
        this.reviews = reviews;
    }

    public MovieReviewDTO (List<MovieReviewUserProjection> projections) {

        title = projections.get(0).getTitle();
        subTitle = projections.get(0).getSubTitle();
        movieYear = projections.get(0).getMovieYear();
        imgUrl = projections.get(0).getImgUrl();
        synopsis = projections.get(0).getSynopsis();


        for (MovieReviewUserProjection p : projections) {

            reviews.add(new ReviewDTO(p));
        }



    }

    public MovieReviewDTO(Movie entity) {
        title = entity.getTitle();
        subTitle = entity.getSubTitle();
        imgUrl = entity.getImgUrl();
        movieYear = entity.getMovieYear();
        synopsis = entity.getSynopsis();
    }


    public String getTitle() {
        return title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public Integer getMovieYear() {
        return movieYear;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public List<ReviewDTO> getReviews() {
        return reviews;
    }
}
