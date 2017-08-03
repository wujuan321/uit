package com.blueway.ekor.uit.elements;

import org.openqa.selenium.By;

/**
 * 
 * @author wujuan
 * 
 *         main page
 */
public interface IHomePage extends IPage {
	// 修改密码链接
	public static final By LN_CHANGE_PASSWORD = By.linkText("[修改密码]");

	public static final By TXT_ADMIN_PWD = By.id("adminPwd");// Bet时提示输入admin密码
	public static final By BNT_PWD = By.id("toBet");// admin密码确定按钮

	public static final By LN_OPEN_MENU = By.id("openMenu");// 左导航，打开菜单位链接

	// 右导航一级链接
	public static final By LN_INDEX = By.cssSelector("a.home");// 首页
	public static final By LN_BET = By.cssSelector("a.bet");// 投注
	public static final By LN_TOP = By.cssSelector("a.top");// 龙虎榜
	public static final By LN_CONFIG = By.cssSelector("h4.config");// 设置
	public static final By LN_ACCOUNT = By.cssSelector("h4.account");// 账目
	public static final By LN_USERS = By.cssSelector("h4.users");// 管理用户
	public static final By LN_OTHER = By.cssSelector("h4.other");// 开彩计算
	public static final By LN_EXIT = By.linkText("[退出]");// 退出链接

	// 右导航二级链接
	public static final By LN_DRAWDATE = By
			.xpath("//*[@id='level1']/li[4]/ul/li[1]/a[1]");// 5.1开彩日期
	public static final By LN_REDNO = By
			.xpath("//*[@id='level1']/li[4]/ul/li[2]/a");// 5.2红字
	public static final By LN_PRICEPACK = By
			.xpath("//*[@id='level1']/li[4]/ul/li[3]/a");// 5.3价钱配套
	public static final By LN_JP = By
			.xpath("//*[@id='level1']/li[4]/ul/li[4]/a");// 5.4赠送配套
	public static final By LN_CLEAR = By
			.xpath("//*[@id='level1']/li[4]/ul/li[5]/a");// 5.5账户清算
	public static final By LN_MESSAGE = By
			.xpath("//*[@id='level1']/li[4]/ul/li[6]/a");// 5.6通告

	public static final By LN_ADDUSER = By
			.xpath("//*[@id='level1']/li[6]/ul/li[1]/a");// 7.1添加用户
	public static final By LN_SEARCH = By.cssSelector("h4.users >ul>a[2]");// 7.2通告查找/编辑用户

	public static final By LN_RESULT = By
			.xpath("//*[@id='level1']/li[7]/ul/li[1]/a");// 9.1设置成绩
	public static final By LN_CALCULTE = By.cssSelector("h4.other >ul>a[2]");// 9.2计算

}
