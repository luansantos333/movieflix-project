package org.dev.luan.moviesite.services;

import org.dev.luan.moviesite.dtos.MovieDTO;
import org.dev.luan.moviesite.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository repository;


    @Transactional (readOnly = true)
    public Page<MovieDTO> findAllMoviesO (Pageable p) {
        return repository.listAllMoviesPaged(p).map(MovieDTO::new);
    }



}
