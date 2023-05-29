package vn.unikcore.nextcrmads.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.transaction.Transactional;
import vn.unikcore.nextcrmads.common.helper.ApiResponse;
import vn.unikcore.nextcrmads.pojo.user.CreateUserDto;
import vn.unikcore.nextcrmads.service.user.CreateUser;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private CreateUser createUser;

    @PostMapping("")
    @Transactional
    public ResponseEntity<Object> create (@RequestBody CreateUserDto createUserDto) {
        createUser.execute(createUserDto);

        return ApiResponse.generateResponse(HttpStatus.OK, false, "ok", null);
    }
}
