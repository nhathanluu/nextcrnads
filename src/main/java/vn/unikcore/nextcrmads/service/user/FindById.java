package vn.unikcore.nextcrmads.service.user;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.unikcore.nextcrmads.common.interfaces.IFindService;
import vn.unikcore.nextcrmads.exception.NotFoundException;
import vn.unikcore.nextcrmads.model.postgres.User;
import vn.unikcore.nextcrmads.repository.postgres.UserRepository;

@Service
public class FindById implements IFindService<User, Long> {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User execute(Long id) {
        Optional<User> user = userRepository.findById(id);

        if (user != null) {
            User response = user.get();

            return response;
        }

        throw new NotFoundException("User not found.");
    }
}
