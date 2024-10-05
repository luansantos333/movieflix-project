package org.dev.luan.moviesite.crontrollers;

import org.dev.luan.moviesite.dtos.GenreDTO;
import org.dev.luan.moviesite.services.GenreService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/genres")
public class GenreController {

    private final GenreService service;

    public GenreController(GenreService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<GenreDTO>> findAllGenres () {

        List<GenreDTO> allGenres = service.findAllGenres();

        return ResponseEntity.ok(allGenres);

    }



}
