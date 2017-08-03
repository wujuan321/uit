package com.blueway.ekor.uit.plugins;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.blueway.ekor.uit.utils.LoggerUtils;
import com.blueway.ekor.uit.utils.PropertiesUtils;

public class TestngRetry implements IRetryAnalyzer {

	private int retryCount = 1;
	private static int maxRetryCount;
	private static final String CONFIGFILE = "config/config.properties";

	static {

		maxRetryCount = Integer.parseInt(PropertiesUtils.getValue(CONFIGFILE,
				"retrycount"));
		LoggerUtils.info("RetryCount=" + maxRetryCount);
		LoggerUtils.info("SourceDir="
				+ PropertiesUtils.getValue(CONFIGFILE, "sourcecodedir"));
		LoggerUtils.info("SourceEncoding="
				+ PropertiesUtils.getValue(CONFIGFILE, "sourcecode"));
	}

	public boolean retry(ITestResult result) {
		if (retryCount <= maxRetryCount) {
			String message = "Retry for： [" + result.getName() + "] on class ["
					+ result.getTestClass().getName() + "] retry " + retryCount
					+ " times";
			LoggerUtils.info(message);
			Reporter.setCurrentTestResult(result);
			Reporter.log("RunCount=" + (retryCount + 1));
			retryCount++;
			return true;
		}
		return false;

	}

	public static int getMaxRetryCount() {
		return maxRetryCount;
	}

	public int getRetryCount() {
		return retryCount;
	}

}
