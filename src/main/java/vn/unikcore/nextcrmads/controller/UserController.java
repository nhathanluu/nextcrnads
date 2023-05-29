package vn.unikcore.nextcrmads.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.transaction.Transactional;
import vn.unikcore.nextcrmads.common.helper.ApiResponse;
import vn.unikcore.nextcrmads.common.helper.AuthHelper;
import vn.unikcore.nextcrmads.model.auth.UserSecurity;
import vn.unikcore.nextcrmads.model.postgres.User;
import vn.unikcore.nextcrmads.predicate.user.CreateUserDto;
import vn.unikcore.nextcrmads.predicate.user.LoginDto;
import vn.unikcore.nextcrmads.security.JwtUtils;
import vn.unikcore.nextcrmads.service.user.CreateUser;
import vn.unikcore.nextcrmads.service.user.FindByEmail;
import vn.unikcore.nextcrmads.service.user.FindById;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private CreateUser createUser;

    @Autowired
    private AuthHelper authHelper;

    @PostMapping("")
    @Transactional
    public ResponseEntity<Object> create (@RequestBody CreateUserDto createUserDto) {
        createUser.execute(createUserDto);

        return ApiResponse.generateResponse(HttpStatus.OK, false, "ok", null);
    }

    @Autowired
    private FindByEmail findByEmail;

    @Autowired 
    private JwtUtils jwtUtils;

    @PostMapping("/token")
    public ResponseEntity<Object> token (@RequestBody LoginDto loginData) {
        User user = findByEmail.execute(loginData);
        String token = jwtUtils.generateToken(user);

        return ApiResponse.generateResponse(HttpStatus.OK, false, "ok", token);
    }

    @Autowired
    private FindById findById;

    @PreAuthorize("hasPermission( #id, 'USER', 'VIEW')")
    @GetMapping("/{userId}")
    public ResponseEntity<Object> profile (@PathVariable(name = "userId") Long userId) {
        User user = findById.execute(userId);
        user.setPassword("");

        return ApiResponse.generateResponse(HttpStatus.OK, false, "ok", user);
    }

    @GetMapping("/my-profile")
    public ResponseEntity<Object> profile (Authentication authentication) {
        User user = authHelper.getUserLogin(authentication);
        user.setPassword("");

        return ApiResponse.generateResponse(HttpStatus.OK, false, "ok", user);
    }
}
