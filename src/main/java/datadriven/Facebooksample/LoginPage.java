package datadriven.Facebooksample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Base;
public class LoginPage {
	@FindBy(id="u_0_2")
	private WebElement txtFirstName;
	@FindBy(id="u_0_4")
	private WebElement txtSurName;
	@FindBy(id="u_0_7")
	private WebElement txtEmailAddress;
	@FindBy(id="u_0_a")
	private WebElement txtRenterEmailAddress;
	@FindBy(id="u_0_e")
	private WebElement txtPassword;
	@FindBy(id="day")
	private WebElement drpDwnDay;
	@FindBy(id="month")
	private WebElement drpDwnMonth ;
	@FindBy(id="year")
	private WebElement drpDwnYear;
	@FindBy(id="u_0_i")
	private WebElement btnMale;
	@FindBy(id="u_0_m")
	private WebElement btnSignup;
	@FindBy(xpath = "//*[text()='Home']")
	private WebElement imgHomePageLogo;
	public WebElement getImgHomePageLogo() {
		return imgHomePageLogo;
	}
	public WebElement getTxtFirstName() {
		return txtFirstName;
	}
	public WebElement getTxtSurName() {
		return txtSurName;
	}
	public WebElement getTxtEmailAddress() {
		return txtEmailAddress;
	}
	public WebElement getDrpDwnDay() {
		return drpDwnDay;
	}
	public WebElement getDrpDwnMonth() {
		return drpDwnMonth;
	}
	public WebElement getDrpDwnYear() {
		return drpDwnYear;
	}
	public WebElement getBtnMale() {
		return btnMale;
	}
	public WebElement getTxtPassword() {
		return txtPassword;
	}
	public WebElement getTxtRenterEmailAddress() {
		return txtRenterEmailAddress;
	}
	public WebElement getBtnSignup() {
		return btnSignup;
	}
	public LoginPage() {
		PageFactory.initElements(Base.driver, this);

}
}
	