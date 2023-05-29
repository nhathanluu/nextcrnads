package vn.unikcore.nextcrmads.predicate.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class LoginDto {
    private String email;
    private String password;
}
