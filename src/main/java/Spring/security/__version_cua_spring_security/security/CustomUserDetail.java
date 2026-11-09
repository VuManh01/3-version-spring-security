package Spring.security.__version_cua_spring_security.security;

import Spring.security.__version_cua_spring_security.entity.User;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.jspecify.annotations.Nullable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;


public class CustomUserDetail implements UserDetails {
    //UserDetails sẽ cần thông tn từ entity User => phải cắm User vào
    private final User user;

    public CustomUserDetail(User user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(
                new SimpleGrantedAuthority("ROLE_USER")
        );
    }

    @Override
    public @Nullable String getPassword() {
        return user.getPassWord();
    }

    @Override
    public String getUsername() {
        return user.getUserName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() { //tài khoản bị khóa => trả về false => cho nên để tk không khóa set thành true
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true; // tk thông tin xác thực (authen..) không còn hạn => trả false
    }

    @Override
    public boolean isEnabled() { // tài khoản chưa kích họat => trả về false
        return true; //chuyển thành true để tài khoản này được phép sử dụng(được kích hoạt)
    }
}
