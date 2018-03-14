package com.alligoric.alligoricserver.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alligoric.alligoricserver.model.Login;

@RestController
public class LoginController {
	@CrossOrigin
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ResponseEntity<Login> login(@RequestBody Login login) {
		System.out.println(login.getUsername());
		if(login.getUsername().equals(login.getPassword())) {
			 return new ResponseEntity<Login>(HttpStatus.OK);
		}
		 return new ResponseEntity<Login>(HttpStatus.CONFLICT);
	}

}
