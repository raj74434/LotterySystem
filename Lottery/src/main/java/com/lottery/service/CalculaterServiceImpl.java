package com.lottery.service;

import java.util.HashMap;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class CalculaterServiceImpl implements CalculaterService {

	@Autowired
	private WinnerServiceImpl wsi;
	
	@Override
	 @Scheduled(cron = "0 0 0 * * *")
	 public String add() {
		 Random rand = new Random();
	      int randomNumber = rand.nextInt(9901) + 100; // Generates a random number between 100 and 10000
	      System.out.println(randomNumber);
	      wsi.putDatabase(1, randomNumber);
	   
	      return "Lottery Number added";
	 }
	
	
	
	
	
}
