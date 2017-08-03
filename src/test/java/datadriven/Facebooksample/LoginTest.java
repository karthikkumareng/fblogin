package datadriven.Facebooksample;


import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import utility.Base;

public class LoginTest extends Base {
	static WebDriver driver;
	LoginPage loginPage;
	Base base = new Base();

	@BeforeClass
	public static void launchBrowser() {
		driver = getDriver();

	}

	@Test
	public void verifyLoginDetails() {
		loginPage = new LoginPage();
	//	Assert.assertTrue(elementFound(driver, 10, loginPage.getImgHomePageLogo()));
		getScreenShot("facebookPage");
		setText(loginPage.getTxtFirstName(), readValueFromExcelSheet().get(1)
				.get("firstname"));
		getScreenShot("firstname");
		setText(loginPage.getTxtSurName(), readValueFromExcelSheet().get(1)
				.get("surname"));
		getScreenShot("lastname");
		setText(loginPage.getTxtEmailAddress(), readValueFromExcelSheet().get(1)
				.get("emailid"));
		getScreenShot("emailid");
		setText(loginPage.getTxtRenterEmailAddress(), readValueFromExcelSheet().get(1)
				.get("renteremailid"));
		getScreenShot("renteremailid");
		setText(loginPage.getTxtPassword(), readValueFromExcelSheet().get(1)
				.get("password"));
		getScreenShot("password");
		
		dropDownSelect(loginPage.getDrpDwnDay(),"13");
		dropDownSelect(loginPage.getDrpDwnMonth(),"Jan");
		dropDownSelect(loginPage.getDrpDwnYear(), "1995");
		clickBtn(loginPage.getBtnMale());
		clickBtn(loginPage.getBtnSignup());	
		System.out.println("program run Success");
}
	@AfterClass
	public static void closeBrowser() {
		driver.quit();

	}

}
