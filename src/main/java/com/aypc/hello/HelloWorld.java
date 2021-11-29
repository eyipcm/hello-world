package com.aypc.hello;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloWorld {

	private static Logger log = LogManager.getLogger(HelloWorld.class);
	
	public static void main(String[] args) {
		
		log.info("hellow start");
		System.out.println("Good Drive git game, go ahead");
		log.info("hellow end");
	}

}