package com.lottery.controllers;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.lottery.service.CallerService;

@Controller
public class Caller {

	@Autowired
	private CallerService callerService;
	
	@GetMapping("/checkNumber/{num}")
	 public ResponseEntity< Boolean > checkNumber(@PathVariable("num") Integer num){
		 boolean ans=false;
		try {
			ans = callerService.checkNumber(num);
			 
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return new ResponseEntity<>(ans ,HttpStatus.OK);
		
	 }
	
	
}
