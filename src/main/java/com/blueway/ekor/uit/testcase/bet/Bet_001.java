package com.blueway.ekor.uit.testcase.bet;

import java.util.Map;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.blueway.ekor.uit.base.BaseParpare;
import com.blueway.ekor.uit.pages.impl.BetPage;
import com.blueway.ekor.uit.pages.impl.HomePage;
import com.blueway.ekor.uit.pages.impl.LoginPage;
import com.blueway.ekor.uit.utils.LoggerUtils;

public class Bet_001 extends BaseParpare {

	@Test
	public void login() {
		LoginPage.login("10011003", "8888", "0000");
		HomePage.goToBet();
	}

	@Test(dataProvider = "testData", dependsOnMethods = { "login" })
	public void bet(Map<String, String> data) throws InterruptedException {
		BetPage.bet(data.get("USER"), data.get("DRAWDATE"), data.get("TYPE"),
				data.get("DRAW"), data.get("NUMBER"), data.get("BIG"),
				data.get("SMALL"), data.get("A"));

	}

}
