package com.blueway.ekor.uit.elements;

import org.openqa.selenium.By;

/**
 * @author wujuan
 * 
 *         add dradate page
 * 
 */
public interface IDradatePage extends IHomePage {
	// 添加
	public static final By BNT_ADD = By.linkText("添加");// 添加按钮

	public static final By TXT_DRAWDATE = By.id("drawdate");// dradate输入框

	public static final By LN_PRE_MONTH = By
			.cssSelector("th.datemonth>span.dot>a.DayButtonup");// 上一月
	public static final By LN_NEXT_MONTH = By
			.cssSelector("th.datemonth>span.dot>a.DayButtondown"); // 下一月

	public static final By LN_PRE_YEAR = By
			.cssSelector("th.dateyear>span.dot>a.DayButtonup");// 上一年
	public static final By LN_NEXT_YEAR = By
			.cssSelector("th.dateyear>span.dot>a.DayButtondown");// 下一年

	public static final By BNT_MORE = By
			.xpath("//*[@id='content']/div[1]/dl/dt[2]/a");// 批量添加
	public static final By CH_ALL = By.id("selectAll");

	public static final By BNT_MORE_SURE = By.id("save_drawdates");// 批量选择确定按钮
	public static final By LN_MORE_OFF = By.cssSelector("off");// 批量选择确定按钮

	public static final By CH_DEFAULT = By.name("Checkbox1");// 默认值快捷输入
	public static final By BNT_SUTMIT = By.name("Submit1");// 提交
	public static final By BNT_CANCEL = By.name("back");// 取消

	// 列表
	public static final By TB_DRAWDATE = By
			.xpath("//*[@id='content']/div[2]/table");// ("tblist");
	public static final By LN_DEL = By.cssSelector("del");

}
