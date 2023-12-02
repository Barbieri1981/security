package com.security.security.mapper;

import com.security.security.dto.UserRequestDTO;
import com.security.security.dto.UserResponseDTO;
import com.security.security.entity.PetOwner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UserMapper {
    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public static PetOwner toEntity(final UserRequestDTO dto) {
        return PetOwner.builder()
                .username(dto.getUsername())
                .password(encoder.encode(dto.getPassword()))
                .build();
    }

    public static UserResponseDTO toResponse(final PetOwner entity) {
        return UserResponseDTO.builder()
                .username(entity.getUsername())
                .build();
    }
}
