package com.security.security.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PetOwner {
    @Id
    @GeneratedValue
    private Long id;
    @Column(unique=true)
    @NotBlank
    private String username;
    @NotBlank
    private String password;
}
