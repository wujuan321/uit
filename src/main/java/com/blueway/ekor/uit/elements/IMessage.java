package com.blueway.ekor.uit.elements;

import org.openqa.selenium.By;

public interface IMessage {
	public static final By BNT_ADD = By.cssSelector("input.bnt_red");//查找按钮
	public static final By BNT_SEARCH = By.cssSelector("input.bnt_green");//添加按钮

	public static final By TXT_TITLE = By.id("title");
	public static final By TXT_CONTENT = By.id("messageContent");
	public static final By CH_STATUS = By.id("state");

	public static final By BNT_SUBMIT = By.id("submit");
	public static final By BNT_CALCEL = By.id("cancle");

	public static final By TB_MESSAGE = By.cssSelector("table.tblist");

}
