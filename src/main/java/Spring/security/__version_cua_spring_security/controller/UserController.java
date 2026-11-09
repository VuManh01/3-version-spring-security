package Spring.security.__version_cua_spring_security.controller;

import Spring.security.__version_cua_spring_security.dtos.request.UserDTO;
import Spring.security.__version_cua_spring_security.dtos.request.UserLoginDTO;
import Spring.security.__version_cua_spring_security.service.User.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    private final IUserService iUserService;

    @PostMapping("/")
    public ResponseEntity<String> createUser(
            @RequestBody UserDTO userDTO
    ) {
        iUserService.createUser(userDTO);
        return ResponseEntity.ok("User created successfully");
    }
}
