package org.dev.luan.moviesite.crontrollers;

import org.dev.luan.moviesite.dtos.MovieMinDTO;
import org.dev.luan.moviesite.dtos.MovieReviewDTO;
import org.dev.luan.moviesite.dtos.ReviewDTO;
import org.dev.luan.moviesite.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/movies")
public class MovieController {

    private final MovieService service;

    @Autowired
    public MovieController(MovieService service) {
        this.service = service;
    }



    @GetMapping
    public ResponseEntity<Page<MovieMinDTO>> findAllMoviesSortedByName (@RequestParam(name = "genre", required = true, defaultValue = "") String genre, Pageable p) {

        Page<MovieMinDTO> movies = service.findAllMoviesSortedByNameAndOptionallyByGender(genre, p);
        return ResponseEntity.ok(movies);

    }

    @GetMapping ("/{id}")
    public ResponseEntity<MovieReviewDTO> searchMovieInformationAndReviewByMovieId (@PathVariable (name = "id") Long id) {

        MovieReviewDTO movieInfoPlusReviewsWithUsers = service.findMovieInfoPlusReviewsWithUsers(id);

        return ResponseEntity.ok(movieInfoPlusReviewsWithUsers);

    }

    @PostMapping ("{id}")
    public ResponseEntity<MovieReviewDTO> addNewReview (@RequestBody ReviewDTO review, @PathVariable (name = "movie") Long movieId ) {



    }




}
