package com.security.security.service.impl;

import com.security.security.dto.UserRequestDTO;
import com.security.security.dto.UserResponseDTO;
import com.security.security.entity.PetOwner;
import com.security.security.mapper.UserMapper;
import com.security.security.service.UserService;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import com.security.security.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Override
    public UserResponseDTO create(final UserRequestDTO rq) {
        final PetOwner petOwner = UserMapper.toEntity(rq);
        final PetOwner result = this.repository.save(petOwner);
        return UserMapper.toResponse(result);
    }
}
