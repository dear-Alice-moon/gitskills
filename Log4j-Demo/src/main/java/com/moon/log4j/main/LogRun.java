package com.moon.log4j.main;

import org.apache.log4j.Logger;

public class LogRun {
	
	private static Logger log = Logger.getLogger(LogRun.class);
	
	
	public static void main(String[] args) {
		
		log.info("------------------------------------------------------");
		
		log.trace("Trace Message!");
		log.debug("Debug Message!");
		log.info("Info Message!");
		log.warn("Warn Message!");
		log.error("Error Message!");
		log.fatal("Fatal Message!");
		
		
		System.out.println("---------------------- log4j-1.Xjar包测试完成 ----------------------");
	}
	
}
