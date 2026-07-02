package Models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class User {
    private Long id;
    private String fullName;
    private String email;
    private LocalDateTime createdAt;

    public User(String fullName, String email){
        this.fullName = fullName;
        this.email = email;
        this.createdAt = LocalDateTime.now();
    }

    // getters and setters

    public long  getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        return "User {\n" +
                "  id = " + id + ",\n" +
                "  fullName = '" + fullName + "',\n" +
                "  email = '" + email + "',\n" +
                "  createdAt = " + (createdAt != null ? createdAt.format(formatter) : null) + "\n" +
                "}";
    }
}
