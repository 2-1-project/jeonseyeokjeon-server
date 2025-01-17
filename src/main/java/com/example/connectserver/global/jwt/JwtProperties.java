package com.example.connectserver.global.jwt;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "jwt")
public class JwtProperties {
     String prefix;
     String header;
     String secret;
     Long expiration;
}
