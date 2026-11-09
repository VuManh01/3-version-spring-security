package Spring.security.__version_cua_spring_security.service.User;

import Spring.security.__version_cua_spring_security.dtos.request.UserDTO;
import Spring.security.__version_cua_spring_security.entity.User;

public interface IUserService {
    User createUser(UserDTO userDTO);
}
