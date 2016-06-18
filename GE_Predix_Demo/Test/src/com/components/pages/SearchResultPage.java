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
import com.iwaf.framework.components.Target;
import com.iwaf.framework.components.IReporter.LogType;

public class SearchResultPage extends SitePage {
	
	/* Defining the locators on the Page */
	
	public static final Target SELECT_CONTEXT = new Target("Select_Context_Dropdown","//header[@id='selectContext']/div[2]/h1/i",Target.XPATH);
	public static final Target PREDIX_ENERGY = new Target("predix_energy",".//*[@id='/group/enterprise-predix']/span[1]",Target.XPATH);
	public static final Target RICHMOND = new Target("Richmond",".//*[@id='/group/site-richmond']/span[1]",Target.XPATH);
	public static final Target REFINERY = new Target("Refinery",".//*[@id='/group/plant-richmond-refinery']/span[1]",Target.XPATH);
	public static final Target BENTLEY_COMPRESSOR = new Target("Bentley_compressor",".//*[@id='/asset/compressor-2015']/span[1]",Target.XPATH);
	public static final Target BENTLEY_COMPRESSOR_OPEN = new Target("Bentley_compressor_button",".//*[@id='/asset/compressor-2015']/button",Target.XPATH);
	public static final Target FROM_DATE = new Target("From_date",".//*[@id='fromDate']/div/label/input",Target.XPATH);
	public static final Target TO_DATE = new Target("To_date",".//*[@id='toDate']/div/label/input",Target.XPATH);
	public static final Target CLOSE_BUTTON = new Target("Close_Button",".//*[@id='rangepickerModal']/div[2]/button",Target.XPATH);
	public static final Target UPDATE_BUTTON = new Target("Update",".//*[@id='rangeFields']/div/button",Target.XPATH);
	
	
	
	public SearchResultPage(SiteRepository repository)
	{
		super(repository);
	}
	
	/* Functions on the Page are defined below */
	
	public SearchResultPage selectCategory()
	{
		
		getCommand().waitForTargetPresent(SELECT_CONTEXT);
		log("Browsing through the category list to pick an item",LogType.STEP);
		getCommand().click(SELECT_CONTEXT);
		
		
		
		
		
		getCommand().waitForTargetPresent(PREDIX_ENERGY);
		log("Selecting Predix Energy",LogType.STEP);
		getCommand().click(PREDIX_ENERGY);
		
		getCommand().waitForTargetPresent(RICHMOND);
		log("Selecting Richmod",LogType.STEP);
		getCommand().click(RICHMOND);
		
		getCommand().waitForTargetPresent(REFINERY);
		log("Selecting Refinery",LogType.STEP);
		getCommand().click(REFINERY);
		
		
		getCommand().waitForTargetPresent(BENTLEY_COMPRESSOR);
		log("Selecting Bentley Compressor",LogType.STEP);
		getCommand().click(BENTLEY_COMPRESSOR);
		
		getCommand().waitForTargetPresent(BENTLEY_COMPRESSOR_OPEN);
		log("Clicking on Bentley Compressor Button",LogType.STEP);
		getCommand().click(BENTLEY_COMPRESSOR_OPEN);
		
		return this;
		
	}
	public SearchResultPage calendarpickitem()
	{
		
		getCommand().waitFor(5);
		log("Enter From Date on Calendar",LogType.STEP);
		getCommand().waitForTargetVisible(FROM_DATE);
		getCommand().click(FROM_DATE);
		getCommand().clear(FROM_DATE);
		getCommand().sendKeys(FROM_DATE, "03/17/2016");
		getCommand().waitForTargetVisible(CLOSE_BUTTON);
		log("Click on Close Button",LogType.STEP);
		getCommand().click(CLOSE_BUTTON);
		getCommand().waitFor(5);
		log("Enter To Date on Calendar",LogType.STEP);
		getCommand().waitForTargetVisible(TO_DATE);
		getCommand().click(TO_DATE);
		getCommand().clear(TO_DATE);
		getCommand().sendKeys(TO_DATE, "03/23/2016");
		getCommand().waitForTargetVisible(CLOSE_BUTTON);
		log("Click on Close Button",LogType.STEP);
		getCommand().click(CLOSE_BUTTON);
		getCommand().waitFor(5);
		getCommand().waitForTargetVisible(UPDATE_BUTTON);
		log("Click on Update Button",LogType.STEP);
		getCommand().click(UPDATE_BUTTON);
		getCommand().waitFor(5);
		
		return this;
	}
	
	
	
	
	
	
	}		