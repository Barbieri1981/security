package com.security.security.service;

import com.security.security.dto.UserRequestDTO;
import com.security.security.dto.UserResponseDTO;

public interface UserService {
    UserResponseDTO create(final UserRequestDTO rq);
}
