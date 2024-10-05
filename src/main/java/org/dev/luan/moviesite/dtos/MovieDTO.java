package org.dev.luan.moviesite.dtos;

import org.dev.luan.moviesite.entities.Movie;

public class MovieDTO {

    private Long id;
    private String title;
    private String subTitle;
    private Integer movieYear;
    private String imgUrl;


    public MovieDTO () {


    }

    public MovieDTO(Long id, String title, String subTitle, Integer movieYear, String imgUrl, String synopsis) {
        this.id = id;
        this.title = title;
        this.subTitle = subTitle;
        this.movieYear = movieYear;
        this.imgUrl = imgUrl;
    }


    public MovieDTO (Movie entity) {

        id = entity.getId();
        title = entity.getTitle();
        subTitle = entity.getSubTitle();
        movieYear = entity.getMovieYear();
        imgUrl = entity.getImgUrl();

    }


    public Long getId() {
        return id;
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
