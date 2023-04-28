package com.lottery.service;

import java.time.LocalTime;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class CallerServiceImpl implements CallerService{

	
	@Autowired
	private WinnerServiceImpl wsi;
	
	@Override
	public boolean checkNumber(@PathVariable("num") Integer num) throws Exception{
		  LocalTime currentTime = LocalTime.now();
		  Integer hour=currentTime.getHour();
		  Integer minut=currentTime.getMinute();
		  
		 
		 Integer winner =wsi.getWinner();
		 
		 if(hour != 6 || hour==6 && minut >10) {
			 
		 if(winner.equals(num)) return true;
		 else return false;
		 }
		 else throw new Exception("Server is not available between 6 am to 6:10 am. Please try again later");
		 
	 }
	
	
}
