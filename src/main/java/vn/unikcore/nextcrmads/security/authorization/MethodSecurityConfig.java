package vn.unikcore.nextcrmads.security.authorization;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import lombok.RequiredArgsConstructor;
import vn.unikcore.nextcrmads.exception.*;

@Configuration
@EnableMethodSecurity(prePostEnabled = true)
@RequiredArgsConstructor
public class MethodSecurityConfig {
    @Bean
    @Primary
    static CustomAuthorizeHanler expressionHandler() {
        var expressionHandler = new CustomAuthorizeHanler();
        return expressionHandler;
    }
}