package com.blueway.ekor.uit.elements;

import org.openqa.selenium.By;

/**
 * @author wujuan
 * 
 *         login page
 * 
 */
public interface ILoginPage extends IHomePage {
	// 登录用户名
	public static final By TXT_USERNAME = By.name("userid");
	// 登录密码输入框
	public static final By TXT_PASSWORD = By.name("pwd");

	// 登录验证码输入框
	public static final By TXT_CODE = By.name("validate");

	// 登录按钮
	public static final By BNT_LOGIN = By.name("Submit1");

	// 错误提示信息
	public static final By SPAN_MSG = By.cssSelector("dd.error > span.tip");

	// 错误提示信息
	public static final By LN_QUIT = By.xpath("//a[@class='quit']");
}
