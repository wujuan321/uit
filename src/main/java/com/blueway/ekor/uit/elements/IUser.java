package com.blueway.ekor.uit.elements;

import org.openqa.selenium.By;

public interface IUser {
	public static final By BNT_ADD = By.name("button");

	public static final By SLE_MASTET = By.id("master_select");
	public static final By SLE_SENIOR = By.id("senior_select");
	public static final By SLE_AGENT = By.id("agent_select");

	public static final By TXT_USERNAME = By.id("uName");
	public static final By TXT_PWD = By.id("password");
	public static final By TXT_CON_PWD = By.id("confirmPwd");
	public static final By TXT_TRUE_NAME = By.id("trueName");
	public static final By TXT_PHONE = By.id("phone");
	public static final By TXT_EMAIL = By.id("email");
	public static final By TXT_POSTCODE = By.id("postcode");
	public static final By TXT_CREDIT_LIMIT = By.id("creditLimit");
	public static final By TXT_FLIGHT = By.id("fight");
	public static final By TXT_BETCOMM = By.id("betComm");
	public static final By TXT_WINWOMM = By.id("winComm");
	public static final By SEL_MY_PACKAGE = By.id("myPackage");
	public static final By SEL_JP_PACKAGE = By.id("jpPackageID");
	public static final By SEL_DOWN_PACKAGE = By.id("downPackage");
	public static final By CHK_DOWN_PP = By.name("downpp");
	public static final By CHK_DOWN_JPPP = By.name("downjppp");
	public static final By TXT_MAX_LIMIT = By.name("maxKlimit");
	public static final By TXT_MAX_M = By.name("maxMlimit");
	public static final By TXT_MAX_K = By.name("maxKlimit");
	public static final By TXT_MAX_T = By.name("maxTlimit");
	public static final By TXT_MAX_S = By.name("maxSlimit");
	public static final By TXT_MAX_T5 = By.name("maxT5limit");
	public static final By TXT_MAX_T6 = By.name("maxT6limit");

	public static final By TXT_MAX_IBOX_M = By.name("maxMibox");
	public static final By TXT_MAX_IBOX_K = By.name("maxKibox");
	public static final By TXT_MAX_IBOX_T = By.name("maxTibox");
	public static final By TXT_MAX_IBOX_S = By.name("maxSibox");
	public static final By TXT_MAX_IBOX_T5 = By.name("maxT5ibox");
	
	public static final By SPAN_WIN_COMM=By.cssSelector("tip tip_comm");

	public static final By BNT_SUBMIT = By.name("editUser");

}
