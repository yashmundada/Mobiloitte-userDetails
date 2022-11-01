package com.mobiloitte.com.service;

import org.springframework.http.ResponseEntity;

import com.mobiloitte.com.dto.UserDto;

public interface ApplicationInterface {
ResponseEntity<String> signup(UserDto userDto);

ResponseEntity<String> signup1(UserDto userDto);

}
