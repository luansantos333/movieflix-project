package org.dev.luan.moviesite.services;

import org.dev.luan.moviesite.dtos.MovieMinDTO;
import org.dev.luan.moviesite.dtos.MovieReviewDTO;
import org.dev.luan.moviesite.entities.Movie;
import org.dev.luan.moviesite.repositories.MovieRepository;
import org.dev.luan.moviesite.repositories.projections.MovieProjection;
import org.dev.luan.moviesite.repositories.projections.MovieReviewUserProjection;
import org.dev.luan.moviesite.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository repository;


    /*
    @Transactional (readOnly = true)
    public Page<MovieDTO> findAllMoviesO (Pageable p) {
        return repository.listAllMoviesPaged(p).map(MovieDTO::new);
    }
    */
    @Transactional (readOnly = true)
    public Page<MovieMinDTO> findAllMoviesSortedByNameAndOptionallyByGender(String genre, Pageable p) {

        Page<MovieProjection> movieProjections = repository.listAllMoviesPaged(genre, p);
        return movieProjections.map(MovieMinDTO::new);

    }

    @Transactional (readOnly = true)

    public MovieReviewDTO findMovieInfoPlusReviewsWithUsers (Long movieId) {


        List<Long> reviewIds = repository.searchReviewIdByMovieId(movieId);

        if (reviewIds.isEmpty()) {

            Movie movie = repository.findById(movieId).orElseThrow(() -> new ResourceNotFoundException("Não foi possível encontrar o filme"));
            return new MovieReviewDTO(movie);
        }


        List<MovieReviewUserProjection> movieReviewUserProjections = repository.listMovieInfoWithReviews(reviewIds);

        return new MovieReviewDTO(movieReviewUserProjections);

    }








}
