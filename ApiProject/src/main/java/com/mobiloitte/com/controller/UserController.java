package com.mobiloitte.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mobiloitte.com.dto.UserDto;
import com.mobiloitte.com.service.ApplicationInterface;

@RestController
public class UserController {
	
@Autowired
ApplicationInterface applicationinterface;




@PostMapping("/save")
private ResponseEntity<String>saveUser(@RequestBody UserDto userDto)
{
	return applicationinterface.signup(userDto);
}



@PostMapping("/User")
private ResponseEntity<String> checkUser(@RequestBody UserDto userDto){
	return applicationinterface.signup1(userDto);
	
}

}
 