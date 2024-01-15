package com.management.school.model;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @NotBlank(message = "City is required")
    private String city;

    @NotBlank(message = "State is required")
    private String state;

}
