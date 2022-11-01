package com.mobiloitte.com.serviceimpl;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mobiloitte.com.dao.UserRepository;
import com.mobiloitte.com.dto.UserDto;
import com.mobiloitte.com.model.ApplicationModel;
import com.mobiloitte.com.service.ApplicationInterface;

@Service
public class Appplication implements ApplicationInterface {

	@Autowired
	private UserRepository userRepository;
	@Override
	public ResponseEntity<String> signup(UserDto userDto) {
			ApplicationModel applicationModel=new ApplicationModel();
			applicationModel.setUserName(userDto.getUserName());
		applicationModel.setDOB(userDto.getDOB());
		applicationModel.setEmail(userDto.getEmail());
		applicationModel.setFirstName(userDto.getFirstName());
		applicationModel.setLastName(userDto.getLastName());
		applicationModel.setMobileNumber(userDto.getMobileNumber());
		applicationModel.setPassword(userDto.getPassword());
		userRepository.save(applicationModel);
		return new ResponseEntity<>("200 successfully registered",HttpStatus.OK);
	}
	@Override
	public ResponseEntity<String> signup1(UserDto userDto) {
		Optional<ApplicationModel> optional=userRepository.findById(userDto.getUserId());
		if(!optional.isPresent()) {
			ApplicationModel applicationModel=new ApplicationModel();
			applicationModel.setUserName(userDto.getUserName());
		applicationModel.setDOB(userDto.getDOB());
		applicationModel.setEmail(userDto.getEmail());
		applicationModel.setFirstName(userDto.getFirstName());
		applicationModel.setLastName(userDto.getLastName());
		applicationModel.setMobileNumber(userDto.getMobileNumber());
		applicationModel.setPassword(userDto.getPassword());
		userRepository.save(applicationModel);
		return new ResponseEntity<>("200 SUCCESSFUL REGISTERED", HttpStatus.OK);
		
		}
		return new ResponseEntity<>("200 successfully not registered",HttpStatus.OK);
	}
}
