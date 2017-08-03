package com.blueway.ekor.uit.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import sun.security.ec.ECDHKeyAgreement;

public class SeleniumUtils {
	public WebDriver driver = null;
	private WebDriverWait wait = null;

	// 启动浏览器关打开页面
	public void openBrowser(String browserName, String webUrl, int timeOut) {
		driver = DriverUtils.InitBrowser(browserName);
		wait = new WebDriverWait(driver, Property.TIMEOUT_INTERVAL, Property.POLLING_INTERVAL);
		// TestResultListener.driver = driver;
		LoggerUtils.info("打开【" + browserName + "】浏览器");
		try {
			maxWindow();
			WaitForPageToLoading(timeOut);
			get(webUrl);
		} catch (Exception e) {

		}
	}

	// 最大化浏览器
	public void maxWindow() {
		driver.manage().window().maximize();
		LoggerUtils.info("最大化浏览器");

	}

	// 打开网址
	public void get(String url) {
		driver.get(url);
		LoggerUtils.info("打开网址【" + url + "】");
	}

	// 等待页面加载
	public void WaitForPageToLoading(int pageLoadTime) {
		driver.manage().timeouts().pageLoadTimeout(pageLoadTime, TimeUnit.SECONDS);
		LoggerUtils.info("等待页面加载……");
	}

	public WebElement findElementBy(By by) {
		WebElement element = null;

		try {
			// element = wait.until(ExpectedConditions
			// .presenceOfElementLocated(by));
			element = wait.until(new ExpectedCondition<WebElement>() {
				@Override
				public WebElement apply(WebDriver d) {
					return d.findElement(by);
				}
			});
		} catch (Exception e) {
			LoggerUtils.error(" 查找 元素【" + by + "】失败");
		}
		return element;
	}

	public void type(By by, String text) {

		WebElement element = findElementBy(by);
		element.sendKeys(text);

	}

	public void click(By by) {
		findElementBy(by).click();

	}

	public void clear(By by) {
		findElementBy(by).clear();

	}

	// 跳入frame框架中
	public void swithToFrame(By by) {
		try {
			driver.switchTo().frame(findElementBy(by));
		} catch (Exception e) {
			LoggerUtils.error("切入frame【" + by + "】失败");
		}
	}

	// 跳回主页面
	public void switchToDefault() {
		try {
			driver.switchTo().defaultContent();
		} catch (Exception e) {
			LoggerUtils.error("跳回主窗口失败！");
		}
	}

	// 判断元素是否存在
	public boolean isPresent(By by) {
		// waitDocumentReady();
		Boolean flag = false;
		try {
			driver.findElement(by);
			flag = true;
		} catch (NoSuchElementException | StaleElementReferenceException e) {
		}
		return flag;
	}

	public void selectByVisibleText(final By by, final String text) {
		LoggerUtils.debug("Try to select text " + text + " on " + by.toString());
		new Select(findElementBy(by)).selectByVisibleText(text);
	}

	// 获取元素的文本值
	public String getText(By by) {
		String value = findElementBy(by).getText();
		return value;
	}

	public void quit() {
		if (driver != null) {
			driver.quit();
		}
	}

	public void close() {
		if (driver != null) {
			driver.close();
		}
	}

	public boolean isSelected(By by) {
		boolean flag = findElementBy(by).isSelected();
		return flag;

	}

	/** 跳出frame */
	public void outFrame() {
		driver.switchTo().defaultContent();
	}

	// public void onActions(By by) {
	// Actions action = new Actions(driver);
	// action.moveToElement(findElementBy(by)).click().perform();
	// }

	/**
	 * 判断文本是不是和需求要求的文本一致
	 **/
	public void isTextCorrect(String actual, String expected) {
		try {
			Assert.assertEquals(actual, expected);
		} catch (AssertionError e) {
			LoggerUtils.error("预期的文字是 【" + expected + "】 ，实际结果 【" + actual + "】");
			Assert.fail("预期的文字是 【" + expected + "】 ，实际结果 【" + actual + "】");

		}
		LoggerUtils.info("成功，预期结果与实际结果一致！");

	}

	/**
	 * wait until page is loaded completely
	 */
	private void waitDocumentReady() {
		final long t = System.currentTimeMillis();
		try {
			wait.until(new ExpectedCondition<Boolean>() {	
				public Boolean apply(WebDriver driver) {
					if (System.currentTimeMillis() - t > Property.TIMEOUT_DOCUMENT_COMPLETE * 100)
						throw new TimeoutException("Timed out after " + Property.TIMEOUT_DOCUMENT_COMPLETE
								+ " seconds waiting for document to be ready");
					return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
				}
			});
		} catch (WebDriverException e) {
			LoggerUtils.error("等待加载页面失败");
		}
	}

	// 元素是否可见
	public boolean isDisplay(By by) {
		boolean flag = findElementBy(by).isDisplayed();
		return flag;
	}

	public boolean waitForDisplayed(final By by) {
		// 创建一个新的ExpectedCondition接口，实现apply方法
		boolean flag = wait.until(new ExpectedCondition<Boolean>() {

			@Override
			public Boolean apply(WebDriver d) {
				if (d.findElement(by).isDisplayed()) {
					return false;
				} else {
					return true;
				}
			}
		});

		return flag;
	}
}
