package com.myhr.api_sb.repository;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import lombok.Data;
@Configuration
@ConfigurationProperties(prefix = "com.myhr.apisb")
@Data
public class CustomProperties {
    private String apiUrl;
}
