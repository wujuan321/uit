package com.blueway.ekor.uit.testcase.login;

import java.util.Map;

import org.testng.annotations.Test;

import com.blueway.ekor.uit.base.BaseParpare;
import com.blueway.ekor.uit.pages.impl.LoginPage;

public class Login_001 extends BaseParpare {

	@Test(dataProvider = "testData")
	public void login(Map<String, String> data) {
		System.out.println(data.get("USERNAME")
				+ "=============================");
		LoginPage.login(data.get("USERNAME"), data.get("PASSWORD"),
				data.get("CODE"));
	}

}
