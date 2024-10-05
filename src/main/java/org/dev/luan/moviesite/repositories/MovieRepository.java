package org.dev.luan.moviesite.repositories;

import org.dev.luan.moviesite.entities.Movie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository <Movie, Long> {

    @Query(value = "SELECT obj FROM org.dev.luan.moviesite.entities.Movie obj ORDER BY obj.title")
    Page<Movie> listAllMoviesPaged(Pageable p);



}
