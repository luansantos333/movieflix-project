package org.dev.luan.moviesite.repositories;

import org.dev.luan.moviesite.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {


}
