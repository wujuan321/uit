package com.blueway.ekor.uit.testcase.login;

import java.util.Map;

import org.testng.annotations.Test;

import com.blueway.ekor.uit.base.BaseParpare;
import com.blueway.ekor.uit.pages.impl.LoginPage;

public class Login_002 extends BaseParpare {

	@Test(dataProvider = "testData")
	public void login(Map<String, String> data) {
		LoginPage.login(data.get("USERNAME"), data.get("PASSWORD"),
				data.get("CODE"));
		LoginPage.checkUserName(data.get("EXP_RESULT"));
	}

}
