package org.dev.luan.moviesite.services;

import org.dev.luan.moviesite.dtos.RoleDTO;
import org.dev.luan.moviesite.dtos.UserDTO;
import org.dev.luan.moviesite.entities.Role;
import org.dev.luan.moviesite.entities.User;
import org.dev.luan.moviesite.repositories.RoleRepository;
import org.dev.luan.moviesite.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;


    public UserDTO insertNewUser(UserDTO userDTO) {
        User entity = new User();
        copyDTOToEntity(userDTO, entity);
        entity = userRepository.save(entity);
        return new UserDTO(entity);
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }


    private void copyDTOToEntity(UserDTO dto, User entity) {

        entity.setName(dto.getName());
        entity.setEmail(dto.getEmail());
        entity.setPassword(passwordEncoder.encode(dto.getPassword()));

        entity.getUserRoles().clear();

        for (RoleDTO roleDto : dto.getRoles()) {
            Role role = roleRepository.getReferenceById(roleDto.getId());
            entity.getUserRoles().add(role);
        }

    }


}
