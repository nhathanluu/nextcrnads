package vn.unikcore.nextcrmads.model.auth;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.hibernate.mapping.List;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import vn.unikcore.nextcrmads.model.postgres.User;

public class UserSecurity implements UserDetails {
    private final User user;


    public UserSecurity(User user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<? extends GrantedAuthority> role = new ArrayList<>();
        
        return role;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
    
}
