package com.components.yaml;

import com.iwaf.framework.BasePage;

public class LoginData {
	
	public String UserName;
	public String Password;
	
	public static LoginData fetch(String key){
		BasePage pageObj = new BasePage();
		LoginData obj = pageObj.getCommand().loadYaml(key, "data-pool/Login_Data.yaml");
		return obj;
	}
}

