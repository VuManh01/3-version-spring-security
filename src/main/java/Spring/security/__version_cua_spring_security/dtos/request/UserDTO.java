package Spring.security.__version_cua_spring_security.dtos.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class UserDTO {
    @JsonProperty("user_name")
    private String userName;

    @JsonProperty("pass_word")
    private String passWord;
}
