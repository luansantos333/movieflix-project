package org.dev.luan.moviesite.services;

import org.dev.luan.moviesite.dtos.RoleDTO;
import org.dev.luan.moviesite.dtos.UserDTO;
import org.dev.luan.moviesite.entities.Role;
import org.dev.luan.moviesite.entities.User;
import org.dev.luan.moviesite.repositories.RoleRepository;
import org.dev.luan.moviesite.repositories.UserRepository;
import org.dev.luan.moviesite.repositories.projections.UserDetailsProjection;
import org.dev.luan.moviesite.services.exceptions.DatabaseException;
import org.dev.luan.moviesite.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Transactional (propagation = Propagation.SUPPORTS)
    public void deleteUser (Long id) {

        if (!userRepository.existsById(id)) {

            throw new ResourceNotFoundException("O usuário informado não foi encontrado");

        }

        try {

            userRepository.deleteById(id);


        } catch (DataIntegrityViolationException e) {

            throw new DatabaseException("O recurso que você está tentando deletar está vinculado a outra tabela");

        }


    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        List<UserDetailsProjection> projections = userRepository.searchUserAndRolesByEmail(username);

        if (projections.isEmpty()) {

            throw new ResourceNotFoundException("Não foi encontrado nenhum usuário com o email informado");

        }

        User user = new User();
        user.setEmail(projections.get(0).getUsername());
        user.setPassword(projections.get(0).getPassword());

        for (UserDetailsProjection p : projections) {


            user.addNewRole(new Role(p.getRoleId(), p.getAuthority()));


        }


        return user;

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
