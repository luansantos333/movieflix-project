package org.dev.luan.moviesite.repositories;

import org.dev.luan.moviesite.entities.Movie;
import org.dev.luan.moviesite.repositories.projections.MovieProjection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository <Movie, Long> {



    @Query(nativeQuery = true, value = "SELECT * FROM (SELECT movie.title, movie.sub_title AS subTitle, movie.img_url AS imgUrl, movie.movie_year AS movieYear FROM tb_movie " +
            "AS movie ORDER BY title)", countQuery = "SELECT COUNT(*) FROM (SELECT movie.title, movie.sub_title AS subTitle, movie.img_url AS imgUrl, movie.movie_year AS movieYear FROM tb_movie  " +
            "AS movie ORDER BY title) AS result")
    Page<MovieProjection> listAllMoviesPaged(Pageable p);



}
