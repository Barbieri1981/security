package com.security.security.controller;

import com.security.security.dto.PetResponseDto;
import com.security.security.utils.PetData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class PetController {

    @GetMapping("/pet")
    public List<PetResponseDto> retrievePets() {
        return PetData.getPets();
    }
}
