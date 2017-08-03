package com.blueway.ekor.uit.pages.impl;

import com.blueway.ekor.uit.elements.IBetPage;
import com.blueway.ekor.uit.utils.LoggerUtils;

/**
 * @author wujuan
 * 
 */
public final class BetPage extends HomePage implements IBetPage {

	/**
	 * 一個完整的投注流程如下
	 * 
	 * 1.选择用户
	 * 
	 * 2.是否JP
	 * 
	 * 3.开彩日期
	 * 
	 * 4.种类：3D，4D，T5，T6
	 * 
	 * 5.边：mkts 6.字
	 * 
	 * 7.数量：big,small,a
	 * 
	 * 8.投注
	 * 
	 * 9.发送
	 * 
	 * @throws InterruptedException
	 */

	// Bet
	public static void bet(String user, String drawdate, String type, String draw, String number, String big,
			String small, String a) throws InterruptedException {
		// chooseUser(user);
		// 如果投注等待条是显示的，則等待
		// driver.waitForDisplayed(DIV_BET_WAIT);
		chooseType(type);
		if (type.equals("3D") || type.equals("4D"))
			chooseDraw(draw);
		inputNo(number);
		driver.type(TXT_BIG, big);
		if (type.equals("4D") || type.equals("3D")) {
			driver.type(TXT_SMALL, small);
		}
		if (type.equals("4D")) {
			driver.type(TXT_A, a);
		}
		driver.click(BNT_BET);
		driver.click(BNT_SEND);

		// Thread.sleep(1000);
	}

	// 选择Runner
	public void chooseUser(String runner) {
		String M = runner.substring(0, 1);
		String SA = runner.substring(0, 4);
		String A = runner.substring(0, 5);
		if (driver.isPresent(SEL_M)) {
			driver.selectByVisibleText(SEL_M, M);
		}
		if (driver.isPresent(SEL_SA)) {
			driver.selectByVisibleText(SEL_SA, SA);
		}
		if (driver.isPresent(SEL_A)) {
			driver.selectByVisibleText(SEL_A, A);
		}
		if (driver.isPresent(SEL_R)) {
			driver.selectByVisibleText(SEL_R, runner);
		}
	}

	// 3D，4D,T5,T6选择
	public static void chooseType(String type) {
		try {
			if (type.equals("3D")) {
				if (driver.isSelected(RADIO_3D) == false)
					driver.click(RADIO_3D);
			} else if (type.equals("4D")) {
				if (driver.isSelected(RADIO_4D) == false)
					driver.click(RADIO_4D);
			} else if (type.equals("T5")) {
				if (driver.isSelected(RADIO_T5) == false)
					driver.click(RADIO_T5);
			} else if (type.equals("T6")) {
				if (driver.isSelected(RADIO_T6) == false)
					driver.click(RADIO_T6);
			}
		} catch (Exception e) {
			LoggerUtils.error("点击type失败");
		}

	}

	// M，K，T，S，T
	public static void chooseDraw(String draw) {
		try {
			driver.clear(TXT_TYPE);

			if (draw.contains("M")) {
				driver.click(BNT_M);
			}
			if (draw.contains("K")) {
				driver.click(BNT_K);
			}
			if (draw.contains("T")) {
				driver.click(BNT_T);
			}
			if (draw.contains("S")) {
				driver.click(BNT_S);
			}
		} catch (Exception e) {
			LoggerUtils.error("点击draw失败");
		}
	}

	// 输入number
	public static void inputNo(String number) {
		if (number != null || number != "") {
			if (number.contains(".")) {
				number = number.split(".")[0];
			}
			char[] chars = number.toUpperCase().toCharArray();
			for (int i = 0; i < chars.length; i++) {
				String str = String.valueOf(chars[i]);
				if (str.equals("R")) {
					driver.click(BNT_R);
				} else if (str.equals("B")) {
					driver.click(BNT_B);
				} else if (str.equals("X")) {
					driver.click(BNT_X);
				} else {
					driver.type(TXT_NUMBER, str);
				}
			}

		} else
			driver.click(BNT_RADOM);

	}

	public static void quit() {
		driver.quit();
	}

	// 选择Drawdate
	public void chooseDrawDate(String drawdate) {

	}

}
