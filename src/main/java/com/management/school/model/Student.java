package com.management.school.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private Long id;

    @NotBlank(message = "Name is required")
    @Size(min = 3, message = "Name should have minimum 3 characters")
    private String name;

    @NotNull(message = "Age is required")
    @Min(value = 3, message = "Age should be a MINIMUM 3")
    private Long age;

    private String degree;

    private String branch;

    @Valid
    @NotNull(message = "Address is required")
    private Address address;

    @Min(value = 0, message = "Class in charge should be a positive number")
    private int classInCharge;

}
