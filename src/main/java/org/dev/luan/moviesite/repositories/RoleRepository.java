package org.dev.luan.moviesite.repositories;

import org.dev.luan.moviesite.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository <Role, Long> {
}
