package com.management.school.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "admin")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Admin {
    private String username;
    private String password;

}
