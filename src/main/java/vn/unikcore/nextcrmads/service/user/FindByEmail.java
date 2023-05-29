package vn.unikcore.nextcrmads.service.user;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.unikcore.nextcrmads.common.interfaces.IFindService;
import vn.unikcore.nextcrmads.exception.UnAuthorized;
import vn.unikcore.nextcrmads.model.postgres.User;
import vn.unikcore.nextcrmads.predicate.user.LoginDto;
import vn.unikcore.nextcrmads.repository.postgres.UserRepository;

@Service
public class FindByEmail implements IFindService<User, LoginDto> {

    @Autowired
    private UserRepository userRepository;
    @Override
    public User execute(LoginDto data) {
        String email = data.getEmail();
        Optional<User> user = userRepository.findByEmail(email);

        if (user != null) {
            User response = user.get();

            return response;
        }

        throw new UnAuthorized("UNAUTHORIZED");
    }
    
}
