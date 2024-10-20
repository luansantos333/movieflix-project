package org.dev.luan.moviesite.repositories;

import org.dev.luan.moviesite.entities.Genre;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GenreRepository extends JpaRepository <Genre, Long> {

    // listagem de todos os gênereros de filme

    @Query("SELECT obj FROM org.dev.luan.moviesite.entities.Genre obj ORDER BY obj.name")
    public List<Genre> listAllGenresPagedOrderedAlphabetically();


}
