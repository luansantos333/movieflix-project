package org.dev.luan.moviesite.services;

import org.dev.luan.moviesite.dtos.GenreDTO;
import org.dev.luan.moviesite.entities.Genre;
import org.dev.luan.moviesite.repositories.GenreRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GenreService {

    private final GenreRepository repository;


    public GenreService(GenreRepository repository) {
        this.repository = repository;
    }

    public List<GenreDTO> findAllGenres () {

        List<Genre> genres = repository.listAllGenresPagedOrderedAlphabetically();

        return genres.stream().map(GenreDTO::new).collect(Collectors.toList());

    }


}
