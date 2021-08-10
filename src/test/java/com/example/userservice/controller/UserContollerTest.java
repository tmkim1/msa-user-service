package com.example.userservice.controller;

import com.example.userservice.dto.UserDto;
import com.example.userservice.jpa.UserRepository;
import com.example.userservice.service.UserService;
import com.example.userservice.vo.RequestUser;
import com.example.userservice.vo.ResponseUser;
import feign.Response;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

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
        UserDto userDto = new UserDto();
        userDto.setEmail("xxoals10216@naver.com");
        userDto.setName("taemin");
        userDto.setPwd("1234");
        RestTemplate restTemplate = new RestTemplate();

        //when
        String url = "http://127.0.0.1:8000/user-service/users";

        //ResponseEntity<ResponseUser> responseEntity = userContoller.createUser(user);
        HttpEntity<UserDto> requestEntity = new HttpEntity<>(userDto);
        ResponseEntity<ResponseUser> responseEntity = restTemplate.exchange(url, HttpMethod.POST, requestEntity, ResponseUser.class);

        //then
        responseEntity.getStatusCode();

        //assert
        assertEquals(HttpStatus.CREATED, responseEntity.getStatusCode());

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