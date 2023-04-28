package com.lottery.service;

import java.util.HashMap;
import java.util.Random;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class WinnerServiceImpl implements WinnerService {

	private HashMap<Integer,Integer> database=new HashMap<Integer,Integer>();

	public HashMap<Integer, Integer> getDatabase() {
		return database;
	}

	public void setDatabase(HashMap<Integer, Integer> database) {
		this.database = database;
	}
	
	public void putDatabase(Integer index,Integer num) {
		this.database.put(index, num);
	}
	
	public Integer getWinner() {
		if(database.containsKey(1))return this.database.get(1);
		else return 0;
	}
	
	
	
}
