package com.blueway.ekor.uit.elements;

import org.openqa.selenium.By;

public interface IPricePackagePage {
	public static final By LN_ADD = By.cssSelector("a.add");
	public static final By LN_EDIT = By.cssSelector("a.edit");

	public static final By BNT_SUBMIT = By
			.cssSelector("#editPPForm > div.column > input:nth-child(1)");
	public static final By BNT_CANCEL = By
			.name("#editPPForm > div.column > input:nth-child(2)");

	public static final By TXT_TYPE = By.id("packtype");
	public static final By TXT_NAME = By.id("prizeName");

	public static final By TXT_4D_M = By.name("md4");
	public static final By TXT_4D_K = By.name("kd4");
	public static final By TXT_4D_T = By.name("td4");
	public static final By TXT_4D_S = By.name("sd4");

	public static final By TXT_4D_IBOX = By.name("d4ibox");
	public static final By TXT_4D_IBOX_DEFAULT = By.name("Checkbox1");

	public static final By TXT_T5_IBOX = By.name("t5ibox");

	public static final By TXT_3D = By.name("d3");

	public static final By TXT_T5 = By.name("t5");

	public static final By TXT_T6 = By.name("t6");

	
	public static final By TB_PRICE = By.cssSelector("table.tblist");//price表格

}
