package com.components.pages;

import com.components.repository.SiteRepository;
import com.iwaf.framework.BasePage;



public class SitePage extends BasePage
{
	protected SiteRepository repository;
	
	SitePage(SiteRepository repository)
	{
		this.repository=repository;
		
	}

	public LoginPage _atLoginPage() 
	{
		return this.repository.loginPage();
	}
	public HomePage _GoToHomePage() 
	{
		return this.repository.homePage();
		
	}
	public SearchResultPage _GoToSearchResultPage() 
	{
		return this.repository.searchResultPage();
	}
	
	public LiveDataPage _GoToLiveData() 
	{
		return this.repository.liveData();
		
	}
	
}
	
	