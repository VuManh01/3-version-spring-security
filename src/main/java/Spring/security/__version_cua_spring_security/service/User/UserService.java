package Spring.security.__version_cua_spring_security.service.User;

import Spring.security.__version_cua_spring_security.config.PasswordEncoderConfig;
import Spring.security.__version_cua_spring_security.dtos.request.UserDTO;
import Spring.security.__version_cua_spring_security.entity.User;
import Spring.security.__version_cua_spring_security.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService implements IUserService{

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
//    private final PasswordEncoderConfig passwordEncoder;

    @Override
    public User createUser(UserDTO userDTO) {
        User user1 = User.builder()
                .userName(userDTO.getUserName())
                .passWord(passwordEncoder.encode(userDTO.getPassWord()))
//                .passWord(passwordEncoder.passwordEncoder().encode(userDTO.getPassWord()))
                .build();
        userRepository.save(user1);
        return user1;
    }
}
