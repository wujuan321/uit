package com.blueway.ekor.uit.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtils {
	public static String getValue(String filename, String key) {
		if (filename == null || filename == "" || key == "") {
			LoggerUtils.error("文件名称为空或者参数错误");
			return null;
		}

		Properties prop = new Properties();
		FileInputStream fis = null;
		String value = "";
		try {
			fis = new FileInputStream(filename);
			prop.load(fis);
		} catch (FileNotFoundException e) {
			LoggerUtils.error("配置文件没有找到，" + filename, e);
		} catch (IOException e) {
			LoggerUtils.error("加载配置文件失败，" + filename, e);
		}

		value = prop.getProperty(key);
		return value;

	}
	
	public static void main(String[] args) {
		String filename = "config/config1.properties";
		String key = "iedriver";
		System.out.println(PropertiesUtils.getValue(filename, key));
	}
}
