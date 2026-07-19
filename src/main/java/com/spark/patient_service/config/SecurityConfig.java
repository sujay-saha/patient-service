package com.spark.patient_service.config;
/* 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity

public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            // 1. Authorize access to the H2 console path
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/h2-console","/h2-console/**").permitAll()
                .anyRequest().authenticated()
            )
            
            // 2. Disable CSRF protection specifically for the H2 console
            .csrf(csrf -> csrf
                .ignoringRequestMatchers("/**","/h2-console","/h2-console/**")
            )
            
            // 3. Allow frames from the same origin so the H2 UI can render
            .headers(headers -> headers
                .frameOptions(frame -> frame.sameOrigin())
            );

        return http.build();
    }
}
    */