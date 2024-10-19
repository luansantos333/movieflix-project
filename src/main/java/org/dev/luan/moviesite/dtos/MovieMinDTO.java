package org.dev.luan.moviesite.dtos;


import org.dev.luan.moviesite.repositories.projections.MovieProjection;

public class MovieMinDTO {

    private String title;
    private String subTitle;
    private Integer movieYear;
    private String imgUrl;



    public MovieMinDTO(String title, String subTitle, Integer movieYear, String imgUrl) {
        this.title = title;
        this.subTitle = subTitle;
        this.movieYear = movieYear;
        this.imgUrl = imgUrl;
    }



    public MovieMinDTO (MovieProjection projection) {
        title = projection.getTitle();
        subTitle = projection.getSubTitle();
        movieYear = projection.getMovieYear();
        imgUrl = projection.getImgUrl();

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
}
