package vn.unikcore.nextcrmads.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import vn.unikcore.nextcrmads.common.interfaces.*;
import vn.unikcore.nextcrmads.common.dto.user.CreateUserDto;
import vn.unikcore.nextcrmads.repository.postgres.UserRepository;

@Service
public class CreateUser implements ICreateService<Boolean, CreateUserDto> {
    @Autowired
    private UserRepository userRepository;
    // @Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(10);

    @Override
    public Boolean execute (CreateUserDto createUserDto) {
        String hashPassword = bCryptPasswordEncoder.encode(createUserDto.getPassword());

        userRepository.insertUser(createUserDto.getEmail(), createUserDto.getFullname(), hashPassword, -1);

        return true;
    }
}
