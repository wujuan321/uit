package com.blueway.ekor.uit.elements;

import org.openqa.selenium.By;

public interface IPdfReport {

	public static final By TXT_DRAWDATE = By.id("drawdate");
	public static final By RAD_REPORT_TYPE_1 = By
			.xpath("//input[@type='radio'and @name='reportType' and @value='1']");
	public static final By RAD_REPORT_TYPE_2 = By
			.xpath("//input[@type='radio'and @name='reportType' and @value='1']");
	public static final By BNT_SUBMIT=By.name("Submit1");
}
