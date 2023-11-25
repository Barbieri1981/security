package com.security.security.utils;

import com.security.security.dto.PetResponseDto;

import java.util.List;

public class PetData {
    private PetData(){}

    public static List<PetResponseDto> getPets() {
        return List.of(PetResponseDto.builder().name("Orejas").build(),
                PetResponseDto.builder().name("Puppy").build());
    }
}
