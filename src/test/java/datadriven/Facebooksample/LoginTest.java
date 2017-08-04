package datadriven.Facebooksample;


import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import utility.Base;
import utility.JUnitTestReport;

public class LoginTest extends JUnitTestReport  {
	static WebDriver driver;
	LoginPage loginPage;
	static Base base = new Base();

	@BeforeClass
	public static void launchBrowser() {
		driver =base.getDriver();

	}

	@Test
	public void verifyLoginDetails() {
		loginPage = new LoginPage();
	//	Assert.assertTrue(elementFound(driver, 10, loginPage.getImgHomePageLogo()));
	base.getScreenShot("facebookPage");
	base.setText(loginPage.getTxtFirstName(), base.readValueFromExcelSheet().get(1)
				.get("firstname"));
	base.getScreenShot("firstname");
	base.setText(loginPage.getTxtSurName(), base.readValueFromExcelSheet().get(1)
				.get("surname"));
	base.getScreenShot("lastname");
	base.setText(loginPage.getTxtEmailAddress(),base.readValueFromExcelSheet().get(1)
			.get("emailid"));
	base.getScreenShot("emailid");
	base.setText(loginPage.getTxtRenterEmailAddress(),base. readValueFromExcelSheet().get(1)
				.get("renteremailid"));
	base.getScreenShot("renteremailid");
	base.setText(loginPage.getTxtPassword(), base.readValueFromExcelSheet().get(1)
				.get("password"));
	base.getScreenShot("password");
		
	base.dropDownSelect(loginPage.getDrpDwnDay(),"13");
	base.dropDownSelect(loginPage.getDrpDwnMonth(),"Jan");
	base.dropDownSelect(loginPage.getDrpDwnYear(), "1995");
	base.clickBtn(loginPage.getBtnMale());
	base.clickBtn(loginPage.getBtnSignup());	
	System.out.println("program run Success");
}
	@AfterClass
	public static void closeBrowser() {
		driver.quit();

	}

}
