
/**
 ********************************************************************************************************************************************
 ********************************************************************************************************************************************
 *																																		   	*
 * 2011-2012 Infosys Limited, Banglore, India. All Rights Reserved																			*
 * Version: 2.0																																*
 * 																																			*
 * Except for any free or open source software components embedded in this Infosys proprietary software program ("Program"),				*
 * this Program is protected by copyright laws, international treaties and other pending or existing intellectual property rights in India, *
 * the United States and other countries. Except as expressly permitted, any unautorized reproduction, storage, transmission 				*
 * in any form or by any means (including without limitation electronic, mechanical, printing, photocopying, recording or otherwise), 		*
 * or any distribution of this Program, or any portion of it, may result in severe civil and criminal penalties, 							*
 * and will be prosecuted to the maximum extent possible under the law 																		*
 *																																			*
 ********************************************************************************************************************************************
 ********************************************************************************************************************************************
 **/
package com.components.pages;

import com.components.repository.SiteRepository;
import com.iwaf.framework.components.IReporter.LogType;
import com.iwaf.framework.components.Target;





public class LoginPage extends SitePage{

	/* Defining the locators on the Page */ 
	
	public static final Target txt_UserName = new Target("UserName",".//input[@name='username']",Target.XPATH);
	public static final Target txt_Password = new Target("Passwd",".//input[@name='password']",Target.XPATH);
	public static final Target btn_SignIn = new Target("signIn",".//input[@value='Sign in']",Target.XPATH);
	public static final Target btn_login = new Target("Login","html/body/div/div/px-app-nav/px-login/div/button[2]",Target.XPATH);
	
	
	public LoginPage(SiteRepository repository)
	{
		super(repository);
	}

	/* Functions on the Page are defined below */
	
	
	public LoginPage loginToApplication(String UserName,String Password)
	{
		getCommand().waitForTargetPresent(txt_UserName);
		if (getCommand().isTargetPresent(txt_UserName))
		{
			
			getCommand().sendKeys(txt_UserName, UserName);
			log("Enter User Name",LogType.STEP);	
									
		}
		
				
		
		getCommand().waitForTargetPresent(txt_Password);
		if (getCommand().isTargetPresent(txt_Password))
		{
			
			getCommand().sendKeys(txt_Password, Password);
			log("Enter Password",LogType.STEP);	

		}
		
		if (getCommand().isTargetPresent(btn_SignIn))
		{
				
			getCommand().click(btn_SignIn);
			log("Click on Sing In Button",LogType.STEP);
			log("User Logged In",LogType.STEP);	
		}		
		
		return this;
	}
	
	
	
	public LoginPage closeBrowser()
	{
	log("Close Browser",LogType.STEP);
	getCommand().closeCurrentWindow();
	return this;
	}
	
}
