package com.UrbanLadder.Runner;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.UrbanLadder.PageObject.GiftCard;
import com.UrbanLadder.PageObject.Landingpage;
import com.UrbanLadder.PageObject.Navigationbar;
import com.UrbanLadder.ReusableComponents.reusablecomponent;
import com.UrbanLadder.ReusableComponents.reusablemethod;

public class NavigationTest extends  reusablecomponent{
	public static Logger log = LogManager.getLogger(reusablecomponent.class.getName());
	//private Header h;
	//private dataDriven d
	private reusablemethod r;
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		log.info("driver is setup");
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void NavigationValidate() throws IOException, InterruptedException {
		Navigationbar nb = new Navigationbar(driver);
		Landingpage l = new Landingpage(driver);
		l.getPopup().click();
		nb.getBedroom().click();
		Thread.sleep(1000l);
		nb.getBed().click();
		//Actions a = new Actions(driver);
		//a.moveToElement(nb.getBedroom());
		//a.moveToElement(nb.getBed());
		//a.moveToElement(nb.getDoublebed()).click().build().perform();
		//log.error("navigation bar error");
		
	}
}