package com.blueway.ekor.uit.base;

import java.io.IOException;
import java.util.Iterator;

import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import com.blueway.ekor.uit.utils.ExcelDataProvider;
import com.blueway.ekor.uit.utils.SeleniumUtils;

/**
 * case 父类 主要用于打开、关闭浏览器 初始化测试数据
 * page子类获取SeleniumUtils工具类
 * @author wujuan
 * 
 */
public class BaseParpare {
	protected ITestContext testContext = null;
	protected String webUrl = "";
	protected int timeOut = 0;
	protected int sleepTime = 0;
	protected int waitMillisecondsForAlert = 0;
	protected static SeleniumUtils driver = null;

	@BeforeClass
	public void startTest(ITestContext context) {
	System.out.println("我进来了");

		this.testContext = context;
		String browserName = context.getCurrentXmlTest().getParameter(
				"browserName");
		driver = new SeleniumUtils();
		timeOut = Integer.parseInt(context.getCurrentXmlTest().getParameter(
				"timeOut"));
		sleepTime = Integer.valueOf(context.getCurrentXmlTest().getParameter(
				"sleepTime"));
		waitMillisecondsForAlert = Integer.valueOf(context.getCurrentXmlTest()
				.getParameter("waitMillisecondsForAlert"));
		webUrl = context.getCurrentXmlTest().getParameter("testurl");
		driver.openBrowser(browserName, webUrl, timeOut);

	}

	/**
	 * 测试数据提供者 - 方法
	 * */
	@DataProvider(name = "testData")
	public Iterator<Object[]> dataFortestMethod() throws IOException {
		String moduleName = null; // 模块的名字
		String caseNum = null; // 用例编号
		String className = this.getClass().getName();
		int dotIndexNum = className.indexOf("."); // 取得第一个.的index
		int underlineIndexNum = className.indexOf("_"); // 取得第一个_的index

		if (dotIndexNum > 0) {
			String packagename = className.substring(0,
					className.lastIndexOf("."));// 得到整个包名
			moduleName = packagename
					.substring(packagename.lastIndexOf(".") + 1);
			; // 取到模块的名称
		}

		if (underlineIndexNum > 0) {
			String caseName = className
					.substring(className.lastIndexOf(".") + 1);// 得到类名
			caseNum = caseName.substring(caseName.indexOf("_") + 1,
					caseName.indexOf("_") + 4); // 取到用例编号
		}
		// 将模块名称和用例的编号传给 ExcelDataProvider ，然后进行读取excel数据
		return new ExcelDataProvider(moduleName, caseNum);
	}

	@AfterClass
	public void endTest() {
		System.out.println("我出去了");
		driver.quit();

	}
}
