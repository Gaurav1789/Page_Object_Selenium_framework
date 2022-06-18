package com.orangeHRM.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_SignInPage {
private WebDriver driver;
	
	@FindBy(xpath = "//b[contains(text(),'Dashboard')]")
	WebElement lnDashboard;
	
	@FindBy(xpath = "//img[@alt='OrangeHRM']")
	WebElement divLogo_img;

	public OrangeHRM_SignInPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public boolean validateLogo() {
		divLogo_img.isDisplayed();
		return true;
	}
	
	public boolean verifySignInPageURL() {
		String pageURL = driver.getCurrentUrl();
		String expectedPageURL = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		return pageURL.contains(expectedPageURL);
	}

	public boolean verifySignInPageText() {
		String pageText = lnDashboard.getText();
		String expectedPageText = "Dashboard";
		return pageText.contains(expectedPageText);
	}

}
