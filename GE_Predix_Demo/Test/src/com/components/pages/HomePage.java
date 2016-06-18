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


public class HomePage extends SitePage{

	/* Defining the locators on the Page */ 
	
	public static final Target LOGO = new Target("Predix-logo","html/body/div[1]/div[2]/div",Target.XPATH);
		
	
	
	public HomePage(SiteRepository repository)
	{
		super(repository);;
	}

	/* Functions on the Page are defined below */
	
	public HomePage atHomePage()
	{
		
		log("Launched Predix Site",LogType.STEP);
		return this;
		
	}

	
	public HomePage verifyHomePage()
	{
		getCommand().waitForTargetPresent(LOGO);
		log("Verify the Predix Logo",LogType.STEP);
		return this;
	}
		
		
	
	
}