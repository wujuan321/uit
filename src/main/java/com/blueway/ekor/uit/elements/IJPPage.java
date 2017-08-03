package com.blueway.ekor.uit.elements;

import org.openqa.selenium.By;

public interface IJPPage {
	public static final By LN_ADD = By.cssSelector("a.add");
	public static final By LN_EDIT = By.cssSelector("a.edit");

	public static final By TB_JP = By.cssSelector("table.tblist");

	public static final By TXT_TYPE = By.id("type");
	public static final By TXT_NAME = By.id("name");
	public static final By TXT_LIMIT = By.id("jplimit");
	public static final By TXT_COMM = By.id("jpwincomm");

	public static final By TXT_1ST = By.id("st1");
	public static final By TXT_BEFOR_2ND = By.id("beforeNd2");
	public static final By TXT_AFTER_2ND = By.id("afterNd2");
	public static final By TXT_BEFOR_3RD = By.id("beforeRd3");
	public static final By TXT_AFTER_3RD = By.id("afterRd3");
	public static final By TXT_BEFOR_4TH = By.id("beforeTh4");
	public static final By TXT_AFTER_4TH = By.id("afterTh4");
	public static final By TXT_BEFOR_5TH = By.id("beforeTh5");
	public static final By TXT_AFTER_5TH = By.id("afterTh5");

	public static final By BNT_SUBMIT = By
			.cssSelector("input.bnt bnt_priceconfig_add");//提交
	public static final By BNT_CANCEL = By
			.cssSelector("input.bnt bnt_priceconfig_back");// 取消

}
