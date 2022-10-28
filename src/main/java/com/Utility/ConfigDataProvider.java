package com.Utility;

import java.io.FileInputStream;
import java.util.Properties;


public class ConfigDataProvider {
	Properties pro;

	public ConfigDataProvider() throws Exception {
		String filepath="C:\\Users\\vidya\\eclipse-workspace\\Framework\\Config\\Config.Properties";
		FileInputStream fis=new FileInputStream(filepath);
		pro=new Properties();
		pro.load(fis);
	}
	public String getBaseUrl()
	{
		return pro.getProperty("BaseUrl");
	}
}
