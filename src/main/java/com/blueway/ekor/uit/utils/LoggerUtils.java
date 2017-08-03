package com.blueway.ekor.uit.utils;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * 日志类封装
 * 
 * @author wujuan
 * 
 */
public class LoggerUtils {
	private static LoggerUtils instance = null;

	static {
		PropertyConfigurator.configure("config/log4j.properties");
	}

	public static LoggerUtils getInstance() {
		synchronized (LoggerUtils.class) {
			if (instance == null) {
				instance = new LoggerUtils();
			}
		}
		return instance;
	}

	public static void debug(String msg) {
		StackTraceElement stack[] = (new Throwable()).getStackTrace();
		Logger logger = Logger.getLogger(stack[1].getClassName());
		logger.debug(msg);
	}

	public static void debug(String msg, Exception e) {
		StackTraceElement stack[] = (new Throwable()).getStackTrace();
		Logger logger = Logger.getLogger(stack[1].getClassName());
		logger.debug(msg, e);
	}

	public static void error(String msg) {
		StackTraceElement stack[] = (new Throwable()).getStackTrace();
		Logger logger = Logger.getLogger(stack[1].getClassName());
		logger.error(msg);
	}

	public static void error(String msg, Exception e) {
		StackTraceElement stack[] = (new Throwable()).getStackTrace();
		Logger logger = Logger.getLogger(stack[1].getClassName());
		logger.error(msg, e);
	}

	public static void info(String msg) {
		StackTraceElement stack[] = (new Throwable()).getStackTrace();
		Logger logger = Logger.getLogger(stack[1].getClassName());
		logger.info(msg);
	}

	public static void info(String msg, Exception e) {
		StackTraceElement stack[] = (new Throwable()).getStackTrace();
		Logger logger = Logger.getLogger(stack[1].getClassName());
		logger.info(msg, e);
	}

	public static void warn(String msg) {
		StackTraceElement stack[] = (new Throwable()).getStackTrace();
		Logger logger = Logger.getLogger(stack[1].getClassName());
		logger.warn(msg);
	}

	public static void warn(String msg, Exception e) {
		StackTraceElement stack[] = (new Throwable()).getStackTrace();
		Logger logger = Logger.getLogger(stack[1].getClassName());
		logger.warn(msg, e);
	}

}
