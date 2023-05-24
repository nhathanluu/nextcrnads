package vn.unikcore.nextcrmads.model.postgres;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;

@Entity
@Table(name = "crm_users")
public class User extends BaseModel{
    @Column
    @Email
    private String email;

    @Column
    private String password;
    
    @Column
    private String fullname;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
}
