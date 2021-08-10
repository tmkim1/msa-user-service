package com.example.userservice.controller;

import com.example.userservice.jpa.UserRepository;
import com.example.userservice.service.UserService;
import com.example.userservice.vo.RequestUser;
import com.example.userservice.vo.ResponseUser;
import feign.Response;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest
class UserContollerTest {

    @MockBean
    UserContoller userContoller;

    @MockBean
    UserService userService;

    @MockBean
    UserRepository userRepository;

    @MockBean
    ModelMapper mapper;

    @Test
    void status() {
        //given

        //when

        //then
        String status = userContoller.status();

        //assert
    }

    @Test
    void welcome() {
    }

    @Test
    void createUser() {

        //given
        RequestUser user = new RequestUser();
        user.setEmail("xxoals10212@naver.com");
        user.setName("taemin");
        user.setPwd("1234");

        //when
        ResponseEntity<ResponseUser> responseEntity = userContoller.createUser(user);

        //then
        responseEntity.getStatusCode();

        //assert
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());

    }

    @Test
    void getUsers() {
    }

    @Test
    void testGetUsers() {
    }

    @Test
    void login() {

    }
}