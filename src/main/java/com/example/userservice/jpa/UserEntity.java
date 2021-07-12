package com.example.userservice.jpa;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity //DATABASE에 만들어져야 할 요소이기 때문에 @Entity 명시
@Table(name="users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 50, unique = true)
    private String email;
    @Column(nullable = false, length = 50)
    private String name;
    @Column(nullable = false, unique = true)
    private String userId;
    @Column(nullable = false, length = 100, unique = true)
    private String encryptedPwd;
}
