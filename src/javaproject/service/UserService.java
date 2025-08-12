package javaproject.service;

public class UserService {
    // 리펙토링 : 서비스 레이어 분리
    public User createUser(String id, String password, String name, String email) {
        // User 객체 생성
        return new User(id, password, name, email);
    }
}
