package org.dev.luan.moviesite.repositories;

import org.dev.luan.moviesite.entities.Movie;
import org.dev.luan.moviesite.repositories.projections.MovieProjection;
import org.dev.luan.moviesite.repositories.projections.MovieReviewUserProjection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository <Movie, Long> {



    @Query(nativeQuery = true, value = "SELECT * FROM (SELECT movie.title, movie.sub_title AS subTitle, movie.img_url AS imgUrl, movie.movie_year AS movieYear FROM tb_movie " +
            "AS movie INNER JOIN tb_genre AS genre ON movie.genre_id = genre.id WHERE UPPER(genre.name) LIKE UPPER(CONCAT('%', :genre, '%')) ORDER BY movie.title)", countQuery = "SELECT COUNT(*) FROM (SELECT movie.title, movie.sub_title AS subTitle, movie.img_url AS imgUrl, movie.movie_year AS movieYear FROM tb_movie  " +
            "AS movie INNER JOIN tb_genre AS genre ON movie.genre_id = genre.id WHERE UPPER(genre.name) LIKE UPPER(CONCAT('%', :genre, '%')) ORDER BY movie.title) AS result")
    Page<MovieProjection> listAllMoviesPaged(String genre, Pageable p);

    @Query(nativeQuery = true, value = "SELECT review.id FROM tb_review AS review WHERE review.movie_id = :id")
    List<Long> searchReviewIdByMovieId(Long id);

    @Query (nativeQuery = true, value = "SELECT movie.title, movie.sub_title AS subTitle, movie.img_url AS imgUrl, movie.movie_year AS movieYear, movie.synopsis, review.text, user_review.name AS username" +
    " FROM tb_movie AS movie INNER JOIN tb_review AS review ON movie.id = review.movie_id INNER JOIN tb_user AS user_review ON review.user_id = user_review.id " +
            "WHERE review.id IN (:reviewIds)")
    List<MovieReviewUserProjection> listMovieInfoWithReviews (List<Long> reviewIds);






}
