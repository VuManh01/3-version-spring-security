package Spring.security.__version_cua_spring_security.config;

import Spring.security.__version_cua_spring_security.security.CustomUserDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;

@RequiredArgsConstructor
@Configuration
public class DaoAuthenticationProviderConfig {

    private final PasswordEncoderConfig passwordEncoder;
    private final CustomUserDetailService userDetailsService;

    @Bean
    public DaoAuthenticationProvider daoAuthenticationProvider() {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider(userDetailsService);
        provider.setPasswordEncoder(passwordEncoder.passwordEncoder());
        return provider;
    }
}
