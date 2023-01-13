package com.dms.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests((auth) -> auth
                .anyRequest().authenticated()
            )
            .oauth2Login(); // This is setting the kind of authentication filter (OAuth2LoginAuthenticationFilter)
                            // to intercept the request and apply OAuth 2 authentication logic.

        return http.build();
    }

}
