package org.dev.luan.moviesite.dtos;

import org.dev.luan.moviesite.entities.User;

import java.util.HashSet;
import java.util.Set;

public class UserDTO {

    private String name;
    private String email;
    private String password;
    private Set<RoleDTO> roles = new HashSet<>();


    public UserDTO(User entity) {

        name = entity.getName();
        email = entity.getUsername();
        password = entity.getPassword();
        entity.getUserRoles().forEach(x -> this.roles.add(new RoleDTO(x)));
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Set<RoleDTO> getRoles() {
        return roles;
    }
}
