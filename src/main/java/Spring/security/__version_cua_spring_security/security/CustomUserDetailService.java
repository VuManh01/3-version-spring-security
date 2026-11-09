package Spring.security.__version_cua_spring_security.security;

import Spring.security.__version_cua_spring_security.entity.User;
import Spring.security.__version_cua_spring_security.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@RequiredArgsConstructor
@Configuration
public class CustomUserDetailService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUserName(username).orElseThrow(
                () -> new RuntimeException("Can't find Information User with username: " + username)
        );

        return new CustomUserDetail(user); //build object CustomUserDetail từ User
    }
}
