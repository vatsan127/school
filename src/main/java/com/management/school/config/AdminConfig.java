package com.management.school.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "admin")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AdminConfig {
    private String userName;
    private String password;
}
