package vn.unikcore.nextcrmads.repository.postgres;

import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import vn.unikcore.nextcrmads.model.postgres.User;

@Service
public interface UserRepository extends CrudRepository<User, Long> {
    @Modifying
    @Query(value = "insert into crm_users (email, fullname, password, created_by) values (:email, :fullname, :password, :created_by)", nativeQuery = true)
    void insertUser(@Param("email") String email, @Param("fullname") String fullname,
            @Param("password") String password, @Param("created_by") Integer created_by);
    
    Optional<User> findByEmail(String email);
}
