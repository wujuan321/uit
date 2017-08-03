package com.blueway.ekor.uit.pages.impl;

import com.blueway.ekor.uit.elements.IUser;

/**
 * 封装用户模块业务逻辑
 * 
 * @author wujuan
 * 
 */
public class UserPage extends HomePage implements IUser {
	
	public void selectRole(String senior, String agent) {
		driver.selectByVisibleText(SLE_MASTET, "1");
		driver.selectByVisibleText(SLE_SENIOR, senior);
		driver.selectByVisibleText(SLE_AGENT, agent);

	}

	public void addUser(String username, String truename, String limit,
			String betComm, String winComm, String[] myPackage,
			String jpPackage, String downPackage, String maxlimit) {
		driver.type(TXT_USERNAME, username);
		driver.type(TXT_PWD, "8888");
		
		driver.type(TXT_CON_PWD, "8888");

		driver.type(TXT_TRUE_NAME, truename);

		driver.type(TXT_CREDIT_LIMIT, limit);

		driver.type(TXT_BETCOMM, betComm);
		driver.type(TXT_WINWOMM, winComm);
//		driver.selectByIndex(SEL_MY_PACKAGE, 1);

		// driver.selectByVisibleText(SEL_MY_PACKAGE, myPackage);
		// driver.selectByVisibleText(SEL_JP_PACKAGE, jpPackage);

		// driver.checkByValue(CHK_DOWN_JPPP, "3604");// 1KYO
		// driver.checkByValue(CHK_DOWN_JPPP, "3600");// 1MAA
		// driver.checkByValue(CHK_DOWN_JPPP, "3603");// 1MAB
		//
		// driver.checkByValue(CHK_DOWN_PP, "2");

		// driver.type(TXT_MAX_M, maxlimit);
		// driver.type(TXT_MAX_K, maxlimit);
		// driver.type(TXT_MAX_T, maxlimit);
		// driver.input(TXT_MAX_S, maxlimit);
		// driver.input(TXT_MAX_T5, maxlimit);
		// driver.input(TXT_MAX_T6, maxlimit);
		//
		// driver.input(TXT_MAX_IBOX_M, maxlimit);
		// driver.input(TXT_MAX_IBOX_K, maxlimit);
		// driver.input(TXT_MAX_IBOX_T, maxlimit);
		// driver.input(TXT_MAX_IBOX_S, maxlimit);
		// driver.input(TXT_MAX_IBOX_T5, maxlimit);

		driver.click(BNT_SUBMIT);

	}

}
