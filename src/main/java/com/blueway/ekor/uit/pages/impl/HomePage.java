package com.blueway.ekor.uit.pages.impl;

import com.blueway.ekor.uit.elements.IHomePage;

/**
 * 主页页面跳转功能
 * 
 * @author wujuan
 * 
 */
public class HomePage extends Page implements IHomePage {

	// 跳回主窗口
	public static void switchToDefault() {
		driver.switchToDefault();
	}

	// 点击open menu
	private static void openMenu() {
		driver.click(LN_OPEN_MENU);
	}

	// 点击Bet
	public static void goToBet() {
		openMenu();
		driver.click(LN_BET);
		if (driver.isPresent(TXT_ADMIN_PWD)) {
			driver.type(TXT_ADMIN_PWD, "8888");
			driver.click(BNT_PWD);
		}
	}

	// 点击设置
	public static void openSet() {
		openMenu();
		driver.click(LN_CONFIG);

	}

	// 点击报表
	public static void openReport() {
		openMenu();
		driver.click(LN_ACCOUNT);
	}

	// 点击管理用户
	private static void openUser() {
		openMenu();
		driver.click(LN_USERS);
	}

	// 点击计算管理
	public static void openOther() {
		openMenu();
		driver.click(LN_OTHER);
	}

	// 点击退出
	public static void clickExit() {
		openMenu();
		driver.click(LN_EXIT);
	}

	// 进入开彩日期页页
	public static void goToDrawDate() {
		openSet();
		driver.click(LN_DRAWDATE);
	}

	// 进入红字
	public static void goToRedNo() {
		openSet();
		driver.click(LN_REDNO);
	}

	// 进入价格配套
	public static void goToPricePackage() {
		openSet();
		driver.click(LN_PRICEPACK);
	}

	// 进入jp
	public static void goToJP() {
		openSet();
		driver.click(LN_JP);
	}

	// 进入清理账户页面
	public static void goToClear() {
		openSet();
		driver.click(LN_CLEAR);
	}

	// 进入 message界面
	public static void goToMessage() {
		openSet();
		driver.click(LN_MESSAGE);
	}

	// 进入添加用户界面
	public static void goToAddUser() {
		openUser();
		driver.click(LN_ADDUSER);
	}

	// 进入查找用户界面
	public static void goToSearch() {
		openUser();
		driver.click(LN_SEARCH);
	}

	// 进入结果设置界面
	public static void goToResult() {
		openOther();
		driver.click(LN_RESULT);
	}

	// 进入计算界面
	public static void goToCalculate() {
		openOther();
		driver.click(LN_CALCULTE);
	}
}
