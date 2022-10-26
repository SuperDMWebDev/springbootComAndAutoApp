package com.example.springbootComAndAuto;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@Component
@PropertySource("minh.yml")
@ConfigurationProperties(prefix="config")
public class AppProperties {
    private String email;
    public String getEmail()
    {
        return email;
    }
}
