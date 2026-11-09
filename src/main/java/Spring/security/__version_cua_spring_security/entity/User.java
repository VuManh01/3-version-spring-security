package Spring.security.__version_cua_spring_security.entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "user_name", nullable = false, unique = true)
    private String userName;

    @Column(name = "pass_word", nullable = false)
    private String passWord;
}
