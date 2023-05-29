package vn.unikcore.nextcrmads.common.helper;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import vn.unikcore.nextcrmads.model.auth.UserSecurity;
import vn.unikcore.nextcrmads.model.postgres.User;

@Service
public class AuthHelper {
    public User getUserLogin (Authentication authentication) {
        UserSecurity userSecurity = UserSecurity.class.cast(authentication.getPrincipal());

        return userSecurity.getUser();
    }
}
