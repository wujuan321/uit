package com.blueway.ekor.uit.utils;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * 初始化浏览器
 * 
 * @author wujuan
 * 
 */
public class DriverUtils {
	public static WebDriver InitBrowser(String browser) {
		WebDriver driver = null;
		Properties prop = System.getProperties();
		String os = prop.getProperty("os.name"); // 操作系统名称;
		LoggerUtils.info("当前系统为：" + os);
		LoggerUtils.info("当前浏览器为：" + browser);

		/** 声明好驱动的路径 */
		String driverPath = "config/config.properties";
		String chromedriver_win = PropertiesUtils.getValue(driverPath, "chromedriver_win");
		String chromedriver_linux = PropertiesUtils.getValue(driverPath, "chromedriver_linux");
		String iedriver = PropertiesUtils.getValue(driverPath, "iedriver");
		try {

			if (os.toLowerCase().contains("win")) {
				if (browser.equalsIgnoreCase("chrome")) {
					System.setProperty("webdriver.chrome.driver", chromedriver_win);
					ChromeOptions options = new ChromeOptions();
					driver = new ChromeDriver(options);
				} else if (browser.equalsIgnoreCase("ie")) {
					System.setProperty("webdriver.ie.driver", iedriver);
					// DesiredCapabilities ieCapabilities = DesiredCapabilities
					// .internetExplorer();
					// ieCapabilities
					// .setCapability(
					// InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
					// true);
					// 返回ie浏览器对象ieCapabilities
					driver = new InternetExplorerDriver();
				} else if (browser.equalsIgnoreCase("firefox")) {
					driver = new FirefoxDriver();
				} else {
					LoggerUtils.error("请选择启动浏览器");
				}
			} else if (os.toLowerCase().contains("linux")) {
				if (browser.equalsIgnoreCase("chrome")) {
					System.setProperty("webdriver.chrome.driver", chromedriver_linux);
					driver = new ChromeDriver();
				} else if (browser.equalsIgnoreCase("ie")) {
					System.setProperty("webdriver.ie.driver", iedriver);
					// DesiredCapabilities ieCapabilities =
					// DesiredCapabilities.internetExplorer();
					// ieCapabilities.setCapability(
					// InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
					// true);
					// 返回ie浏览器对象ieCapabilities
					driver = new InternetExplorerDriver();
				} else if (browser.equalsIgnoreCase("firefox")) {
					driver = new FirefoxDriver();
				} else {
					LoggerUtils.error("请选择启动浏览器");
				}
			}
		} catch (Exception e) {
			LoggerUtils.error("启动浏览器异常,异常信息：", e);

		}
		return driver;
	}

	public static void main(String[] args) {
		WebDriver driver = null;
		driver = new FirefoxDriver();
		// try {
		// String driverPath = "config/config.properties";
		// String iedriver = PropertiesUtils.getValue(driverPath,
		// "chromedriver_win");
		// System.setProperty("webdriver.chrome.driver", iedriver);
		// driver = new ChromeDriver();
		// driver.get("https://www.baid.com");
		//
		// try {
		// Thread.sleep(3000);
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }
		// driver.quit();
		// } catch (Exception e) {
		// driver.quit();
		// }
	}
}
