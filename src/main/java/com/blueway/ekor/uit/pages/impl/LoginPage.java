package com.blueway.ekor.uit.pages.impl;

import com.blueway.ekor.uit.elements.ILoginPage;

/**
 * 登录封装
 * 
 * @author wujuan
 * 
 */
public class LoginPage extends HomePage implements ILoginPage {

	/**
	 * 登录操作封装
	 * 
	 * @param username
	 * @param password
	 */
	public static void login(String username, String password, String code) {
		driver.type(TXT_USERNAME, username);
		driver.type(TXT_PASSWORD, password);
		driver.type(TXT_CODE, code);
		driver.click(BNT_LOGIN);

	}

	/**
	 * 检查预期结果与实际结果是否一致
	 * 
	 * @param excpet
	 * @param actual
	 */
	public static void checkUserName(String expected) {
		String actual = driver.getText(SPAN_MSG);
		driver.isTextCorrect(actual, expected);

	}

	//退出登录
	public static void logout() {
		driver.click(LN_QUIT);
	}

}
