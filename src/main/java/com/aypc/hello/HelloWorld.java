package com.aypc.hello;

//import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloWorld {

	private static org.apache.logging.log4j.Logger log4j2 = LogManager.getLogger(HelloWorld.class);
	private static org.slf4j.Logger slf4j = org.slf4j.LoggerFactory.getLogger(HelloWorld.class);
	private static org.apache.commons.logging.Log jcl = LogFactory.getLog(HelloWorld.class);			
	private static java.util.logging.Logger jul = java.util.logging.Logger.getLogger(Thread.currentThread().getStackTrace()[0].getClassName());
	
	public static void main(String[] args) {
		
		log4j2.info("log4j2 -- info level hellow start");
		slf4j.info("slf4j over log4j2 via log4j-1.2-api -- info level hellow start");
		jcl.info("common-loggging via log4j-1.2-api -- info level hellow start");
		jul.info("java-util-loggging via log4j-1.2-api -- info level hellow start");
		System.out.println("Good Drive git game, go ahead");
		
		log4j2.debug("log4j2 -- debug level hellow start");
		slf4j.debug("slf4j over log4j2 via log4j-1.2-api -- debug level hellow start");
		jcl.debug("common-loggging via log4j-1.2-api -- debug level hellow start");
		jul.fine("java-util-loggging via log4j-1.2-api -- fine level hellow start");
		jul.finer("java-util-loggging via log4j-1.2-api -- finer level hellow start");
		System.out.println("Good Drive git game, go ahead");
		
		log4j2.warn("log4j2 -- warn level hellow start");
		slf4j.warn("slf4j over log4j2 via log4j-1.2-api -- warn level hellow start");
		jcl.warn("common-loggging via log4j-1.2-api -- warn level hellow start");
		jul.warning("java-util-loggging via log4j-1.2-api -- warning level hellow start");
		System.out.println("Good Drive git game, go ahead");
		
		log4j2.trace("log4j2 -- trace level hellow start");
		slf4j.trace("slf4j over log4j2 via log4j-1.2-api -- trace level hellow start");
		jcl.trace("common-loggging via log4j-1.2-api -- trace level hellow start");		
		jul.finest("java-util-loggging via log4j-1.2-api -- finest level hellow start");
		System.out.println("Good Drive git game, go ahead");
		
		log4j2.fatal("log4j2 -- fatal level hellow start");
		//slf4j.fatal("slf4j over log4j2 via log4j-1.2-api -- fatal level hellow start");		
		jcl.fatal("common-loggging via log4j-1.2-api -- fatal level hellow start");
		//jul.fatal("java-util-loggging via log4j-1.2-api -- fatal level hellow start");
		System.out.println("Good Drive git game, go ahead");
		
	}

}