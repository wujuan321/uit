package com.blueway.ekor.uit.elements;

import org.openqa.selenium.By;

/**
 * @author wujuan
 * 
 *         login page
 * 
 */
public interface IBetPage extends IHomePage {

	public static final By SEL_M = By.id("master");// 选择Master
	public static final By SEL_SA = By.id("superAgent");// 选择SuperAgent
	public static final By SEL_A = By.id("agent");// 选择Agent
	public static final By SEL_R = By.id("runner");// 选择Runner

	public static final By CH_JP = By.id("jackpot");// 赠送复选框

	public static final By BNT_BK = By.id("Y");// 属性按钮BK
	public static final By BNT_R = By.id("R");// 属性按钮R
	public static final By BNT_X = By.id("X");// 属性按钮X
	public static final By BNT_B = By.id("B");// 属性按钮B
	public static final By BNT_RADOM = By.id("radom");// 随机数

	public static final By BNT_M = By.id("M");// M按钮
	public static final By BNT_K = By.id("K");// K按钮
	public static final By BNT_T = By.id("T");// T按钮
	public static final By BNT_S = By.id("S");// s按钮

	public static final By TXT_DRAWDATE = By.id("dateTag");// dradate选择框
	
	public static final By RADIO_3D=By.xpath("(//input[@name='draw'])[1]");// draw选择，3D，4D，T5，T6
	public static final By RADIO_4D=By.xpath("(//input[@name='draw'])[2]");// draw选择，3D，4D，T5，T6
	public static final By RADIO_T5=By.xpath("(//input[@name='draw'])[3]");// draw选择，3D，4D，T5，T6
	public static final By RADIO_T6=By.xpath("(//input[@name='draw'])[4]");// draw选择，3D，4D，T5，T6
	
	public static final By RADIO_DRAW = By.name("draw");// draw选择，3D，4D，T5，T6
	public static final By TXT_TYPE = By.id("type");// 边输入框
	
	public static final By SPAN_MSG = By.id("dates");//drawdate天数选择提示框

	public static final By TXT_NUMBER = By.id("number");// number输入框

	public static final By TXT_BIG = By.id("big");// 大小A输入框
	public static final By TXT_SMALL = By.id("small");
	public static final By TXT_A = By.id("a");

	public static final By BNT_LOCAK = By.id("lock");// 锁定大小A输入框按钮

	public static final By BNT_BET = By.name("Button1");// 投注按钮

	public static final By BNT_SEND = By.id("send");// 发送按钮

	public static final By TXT_SEL_DRAWDATE = By.id("sdd");// 开彩日期（查詢）
	public static final By TXT_SEL_ITEMNO = By
			.xpath("(//input[@name='Text1'])[3]");// item number （查询）
	public static final By BNT_IMPORT = By.id("query");// 导入
	public static final By BNT_IMPORT_DEL = By.id("del");// 导入删除

	public static final By BNT_DEL_ALL = By.name("delAll");// 删除全部按钮
	
	public static final By DIV_BET_WAIT=By.xpath("//*[@id='tip']/div[2]");

}