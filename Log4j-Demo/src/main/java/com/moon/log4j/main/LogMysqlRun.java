package com.moon.log4j.main;

import org.apache.log4j.Logger;

/**
  * 将日志信息插入到数据库表中。
 * 
 * @author moon  2019/05/13  10:03  
 *
 */
public class LogMysqlRun {
	
	private static Logger log = Logger.getLogger(LogMysqlRun.class); 
	
	public static void main(String[] args) {
		
		log.debug("This is logger debug message.");
		log.info("This is logger info message.");
		
		System.out.println("---------------------- log4j-1.Xjar包测试完成 ----------------------");
	}
	
}
