package org.dev.luan.moviesite.crontrollers;

import org.dev.luan.moviesite.dtos.MovieDTO;
import org.dev.luan.moviesite.dtos.MovieMinDTO;
import org.dev.luan.moviesite.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/movies")
public class MovieController {

    private final MovieService service;

    @Autowired
    public MovieController(MovieService service) {
        this.service = service;
    }



    @GetMapping
    public ResponseEntity<Page<MovieMinDTO>> findAllMoviesSortedByName (Pageable p) {

        Page<MovieMinDTO> movies = service.findAllMoviesSortedByName(p);
        return ResponseEntity.ok(movies);

    }


}
