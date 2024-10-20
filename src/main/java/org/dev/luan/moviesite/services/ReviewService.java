package org.dev.luan.moviesite.services;

import org.dev.luan.moviesite.dtos.MovieReviewDTO;
import org.dev.luan.moviesite.dtos.ReviewDTO;
import org.dev.luan.moviesite.entities.Review;
import org.dev.luan.moviesite.repositories.ReviewRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ReviewService {

    private final ReviewRepository repository;
    private final UserService userService;


    public ReviewService(ReviewRepository repository, UserService userService) {
        this.repository = repository;
        this.userService = userService;
    }

    @Transactional
    public MovieReviewDTO addNewReview (ReviewDTO dto, Long id) {

        Review review = new Review();
        copyDTOToEntity(dto, review);
        Review save = repository.save(review);


        return M

    }


    private void copyDTOToEntity (ReviewDTO dto, Review review) {

        review.
        review.setText(dto.getText());

    }


}
