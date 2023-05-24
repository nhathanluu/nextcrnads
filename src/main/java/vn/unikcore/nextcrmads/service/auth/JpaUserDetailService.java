package vn.unikcore.nextcrmads.service.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import vn.unikcore.nextcrmads.model.auth.UserSecurity;
import vn.unikcore.nextcrmads.repository.postgres.UserRepository;

@Service
public class JpaUserDetailService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return userRepository.findByEmail(email).map(UserSecurity::new).orElseThrow(() -> new UsernameNotFoundException("User Not Found!"));
    }
}
