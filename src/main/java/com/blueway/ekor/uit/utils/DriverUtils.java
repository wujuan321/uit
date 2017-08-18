package com.blueway.ekor.uit.utils;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

/**
 * 初始化浏览器
 * 
 * @author wujuan
 * 
 */
public class DriverUtils {
	public static WebDriver InitBrowser(String browser) {
		WebDriver driver = null;
		if (browser == null || browser.equals("")) {
			driver = initAppiumDriver();
		}
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

	public static WebDriver initAppiumDriver() {
		WebDriver driver = null;
		String apkName = "524d.apk"; // 安卓的安装包，被测软件
		String platformVersion = "23";// 安卓模拟器的版本
		String serverURL = "http://127.0.0.1:4723/wd/hub";// appium测试服务的地址
		// ==============================================================================================
		File classpathRoot = new File(System.getProperty("user.dir"));// 获得项目路径
		File appDir = new File(classpathRoot, "apps");// 获得APK所在文件夹名称
		File app = new File(appDir, apkName);// 获得APK文件

		DesiredCapabilities capabilities = new DesiredCapabilities(); /*
																		 * 新建一个DesiredCapabilities对象
																		 * ，
																		 * 是import
																		 * org.
																		 * openqa
																		 * .
																		 * selenium
																		 * .
																		 * remote
																		 * .
																		 * DesiredCapabilities
																		 * ;
																		 * 作者个人赶脚是用来收集驱动初始化信息用的；
																		 */
		capabilities.setCapability(CapabilityType.BROWSER_NAME, ""); // 指定浏览器的名字，我们测试的是APK所以没有浏览器，故而为空；
		capabilities.setCapability("platformName", "Android"); // 指定平台，为安卓
		capabilities.setCapability("deviceName", "android Emulator"); // 指定设备，"Android
																		// Emulator"这个属性作者认为是“安卓设备即可”
		capabilities.setCapability("platformVersion", platformVersion); // 指定版本，作者的模拟器是4.4.2的
		System.out.println(app.getAbsolutePath());
		capabilities.setCapability("app", app.getAbsolutePath()); // 指定需要测试的APK，也就是需要安装的APK文件；
		// 核心关键步骤，创建驱动，指定服务地址，和初始化信息；
		try {
			driver = new AndroidDriver(new URL(serverURL), capabilities);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return driver;

	}
}
