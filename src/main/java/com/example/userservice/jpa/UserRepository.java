package com.example.userservice.jpa;

import org.springframework.data.repository.CrudRepository;

// <>: 제네릭 인자 요소 <데이터베이스 연동할 엔티티 클래스, 기본키에 해당하는 타입>
public interface UserRepository extends CrudRepository<UserEntity, Long> {

}

