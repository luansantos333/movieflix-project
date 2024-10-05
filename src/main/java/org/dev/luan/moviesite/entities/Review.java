package org.dev.luan.moviesite.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity (name = "tb_review")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;
    @ManyToOne
    @JoinColumn (name = "user_id")
    User user;
    @ManyToOne
    @JoinColumn(name = "movie_id")
    Movie movie;


    public Review(Long id, String text) {
        this.id = id;
        this.text = text;
    }

    public Review() {
    }


    public User getUser() {
        return user;
    }

    public Movie getMovie() {
        return movie;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Review review = (Review) o;
        return Objects.equals(id, review.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
