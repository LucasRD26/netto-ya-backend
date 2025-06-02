package com.nettoya.config;

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
            .csrf(csrf -> csrf.disable()) // Desactiva CSRF (opcional, útil para APIs REST)
            .authorizeHttpRequests(auth -> auth
                .requestMatchers(
                    "/api/auth/**",
                    "/swagger-ui/**",
                    "/v3/api-docs/**"
                ).permitAll() // Endpoints públicos
                .anyRequest().authenticated() // Todo lo demás requiere autenticación
            )
            .formLogin(form -> form.permitAll()) // Habilita login por formulario
            .httpBasic(basic -> {}); // Habilita autenticación HTTP Basic (útil para Postman, etc.)

        return http.build();
    }
}


