package org.dev.luan.moviesite.dtos;

import org.dev.luan.moviesite.entities.Genre;

public class GenreDTO {

    private Long id;
    private String name;

    public GenreDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }


    public GenreDTO() {
    }


    public GenreDTO(Genre genre) {

        id = genre.getId();
        name = genre.getName();

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
