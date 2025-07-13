package com.servicehub.backend

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.web.SecurityFilterChain

@Configuration
class SecurityConfig {

    @Bean
    fun filterChain(http: HttpSecurity): SecurityFilterChain {
        http
            .csrf { it.disable() }
            .authorizeHttpRequests {
                it.requestMatchers("/api/**").permitAll()  // allow public access to /api/*
                it.anyRequest().authenticated()           // everything else requires auth
            }
            .formLogin { it.disable() }                    // disable default login form
            .httpBasic { it.disable() }                    // disable basic auth

        return http.build()
    }
}
