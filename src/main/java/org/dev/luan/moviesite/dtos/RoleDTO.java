package org.dev.luan.moviesite.dtos;

import org.dev.luan.moviesite.entities.Role;

public class RoleDTO {
    private Long id;
    private String authority;


    public RoleDTO (Role entity) {

        id = entity.getId();
        authority = entity.getAuthority();

    }


    public Long getId() {
        return id;
    }

    public String getAuthority() {
        return authority;
    }
}
