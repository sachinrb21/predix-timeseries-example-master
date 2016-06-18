package com.components.pages;

import com.components.repository.SiteRepository;
import com.iwaf.framework.components.IReporter.LogType;
import com.iwaf.framework.components.Target;

public class LiveDataPage extends SitePage {
	
	public static final Target LIVE_DATA  = new Target("LiveData",".//*[@id='refAppTable']/px-card/div/div[1]/button",Target.XPATH);
	public static final Target PLAY_BUTTON  = new Target("Play_Button",".//*[@id='refAppLiveData']/px-card/div/div[2]/button[2]",Target.XPATH);
	
	public LiveDataPage(SiteRepository repository)
	{
		super(repository);
	}
	
	public LiveDataPage seeLiveData()
	{
		log("Clicking on See Live Data",LogType.STEP);
		getCommand().waitForTargetVisible(LIVE_DATA);
		getCommand().click(LIVE_DATA);
		getCommand().waitFor(15);
		log("Clicking on Play Button",LogType.STEP);
		getCommand().waitForTargetVisible(PLAY_BUTTON);
		getCommand().click(PLAY_BUTTON);
		getCommand().waitFor(25);
		return this;
	}
}
