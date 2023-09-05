package DTO;

import enums.Role;
import org.mindrot.jbcrypt.BCrypt;

public class UserDTO {
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private Role role;
    private String password; // New field for the password

    // Private constructor, use the builder to create instances.
    private UserDTO(Long id, String firstname, String lastname, String email, Role role, String password) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.role = role;
        this.password = password;
    }

    // Static builder method
    public static Builder builder() {
        return new Builder();
    }

    // Builder class with setter methods
    public static class Builder {
        private Long id;
        private String firstname;
        private String lastname;
        private String email;
        private Role role;
        private String password;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder firstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public Builder lastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder role(Role role) {
            this.role = role;
            return this;
        }

        public Builder password(String password) {
            // You should hash or encrypt the password here before setting it.
            this.password = BCrypt.hashpw(password, BCrypt.gensalt());
            return this;
        }

        public UserDTO build() {
            // Validate fields here if necessary
            return new UserDTO(id, firstname, lastname, email, role, password);
        }
    }

    // Getters for all fields
    public Long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public Role getRole() {
        return role;
    }

    public String getPassword() {
        return password;
    }
}
