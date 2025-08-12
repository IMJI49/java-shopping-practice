package javaproject.domain;

public class User {
    private String id;
    private String password;
    private String name;
    private String email;

    public User(String id, String password, String name, String email) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.email = email;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    // 유효성 검증 메소드 추가
    public boolean isValid() {
        return id != null && !id.isEmpty() &&
               password != null && !password.isEmpty() &&
               name != null && !name.isEmpty() &&
               email != null && !email.isEmpty()
               && password.length() >= 6; // 비밀번호는 최소 6자 이상
    }
}