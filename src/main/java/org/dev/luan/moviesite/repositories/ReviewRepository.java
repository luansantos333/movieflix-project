package org.dev.luan.moviesite.repositories;

import org.dev.luan.moviesite.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository <Review, Long> {




}
