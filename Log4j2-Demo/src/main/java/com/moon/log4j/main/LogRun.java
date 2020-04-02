package com.moon.log4j.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogRun {
	
	private static Logger log = LogManager.getLogger(LogRun.class);
	
	public static void main(String[] args) {
		
		log.debug("这是一个测试，log.debug(...)");
		log.info("这是一个测试，log.info(...)");
		log.info("这是一个测试，log.info(...)");
		
		System.out.println("----------------------- 测试完毕 ----------------------- ");
	}
	
}
