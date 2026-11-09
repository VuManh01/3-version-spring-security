package Spring.security.__version_cua_spring_security.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;

@RequiredArgsConstructor
@Configuration
public class AuthenticationManagerConfig {

    private final DaoAuthenticationProvider daoAuthenticationProvider;

    public AuthenticationManager authenticationManager(){
        return new ProviderManager(daoAuthenticationProvider);
    }

}
