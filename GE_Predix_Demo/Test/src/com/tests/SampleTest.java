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
package com.tests;

import org.testng.annotations.Test;

import com.components.entities.Start;
import com.iwaf.framework.Initiator;
import com.components.yaml.LoginData;

public class SampleTest extends Initiator{

	@Test(groups={"Test_Script"}, description = "Log in to Target and Search")
	public void Login() {	
		
		LoginData loginData =LoginData.fetch("LoginData");	
		Start.asTester
			.goToHomepage()
			.atHomePage()
			.verifyHomePage()
			._atLoginPage()
			.loginToApplication(loginData.UserName, loginData.Password)
			._GoToSearchResultPage()
			.selectCategory()
			.calendarpickitem()
			._GoToLiveData()
			.seeLiveData()
		    ;
	}
	
	

}
