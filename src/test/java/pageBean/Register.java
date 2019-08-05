package pageBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
	WebDriver driver;
	@FindBy(name = "txtUName")
	@CacheLookup
	WebElement uname;
	
	@FindBy(name = "txtPwd")
	@CacheLookup
	WebElement password;

	@FindBy(id = "txtConfPassword")
	@CacheLookup
	WebElement confpass;
	
	@FindBy(name = "txtFN")
	@CacheLookup
	WebElement firstName;
	
	
	@FindBy(name = "txtLN")
	@CacheLookup
	WebElement lastName;
	
	@FindBy(name = "Email")
	@CacheLookup
	WebElement email;
	
	@FindBy(name = "Address")
	@CacheLookup
	WebElement address;
	
	@FindBy(name = "Phone")
	@CacheLookup
	WebElement phone;
	
	@FindBy(name = "submit")
	@CacheLookup
	WebElement submit;
	
	@FindBy(name = "reset")
	@CacheLookup
	WebElement reset;
	
	@FindBy(id="userErrMsg1")
	WebElement userErrMsg1;
	
	@FindBy(id="userErrMsg2")
	WebElement userErrMsg2;
	
	@FindBy(id="userErrMsg3")
	WebElement userErrMsg3;
	
	@FindBy(id="userErrMsg4")
	WebElement userErrMsg4;
	
	@FindBy(id="userErrMsg5")
	WebElement userErrMsg5;
	
	@FindBy(id="userErrMsg6")
	WebElement userErrMsg6;
	
	@FindBy(id="userErrMsg7")
	WebElement userErrMsg7;
	
	@FindBy(id="userErrMsg8")
	WebElement userErrMsg8;

	public WebElement getUserErrMsg1() {
		System.out.println(userErrMsg1.getText());
		return userErrMsg1;
	}
	public void setUserErrMsg1(WebElement userErrMsg1) {
		this.userErrMsg1 = userErrMsg1;
	}
	public WebElement getUserErrMsg2() {
		return userErrMsg2;
	}
	public void setUserErrMsg2(WebElement userErrMsg2) {
		this.userErrMsg2 = userErrMsg2;
	}
	public WebElement getUserErrMsg3() {
		return userErrMsg3;
	}
	public void setUserErrMsg3(WebElement userErrMsg3) {
		this.userErrMsg3 = userErrMsg3;
	}
	public WebElement getUserErrMsg4() {
		return userErrMsg4;
	}
	public void setUserErrMsg4(WebElement userErrMsg4) {
		this.userErrMsg4 = userErrMsg4;
	}
	public WebElement getUserErrMsg5() {
		return userErrMsg5;
	}
	public void setUserErrMsg5(WebElement userErrMsg5) {
		this.userErrMsg5 = userErrMsg5;
	}
	public WebElement getUserErrMsg6() {
		return userErrMsg6;
	}
	public void setUserErrMsg6(WebElement userErrMsg6) {
		this.userErrMsg6 = userErrMsg6;
	}
	public WebElement getUserErrMsg7() {
		return userErrMsg7;
	}
	public void setUserErrMsg7(WebElement userErrMsg7) {
		this.userErrMsg7 = userErrMsg7;
	}
	public WebElement getUserErrMsg8() {
		return userErrMsg8;
	}
	public void setUserErrMsg8(WebElement userErrMsg8) {
		this.userErrMsg8 = userErrMsg8;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname.sendKeys(uname);
	}
	public WebElement getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password.sendKeys(password);
	}
	public WebElement getConfpass() {
		return confpass;
	}
	public void setConfpass(String confpass) {
		this.confpass.sendKeys(confpass);
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName.sendKeys(firstName);
	}
	public WebElement getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName.sendKeys(lastName);
	}
	public WebElement getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email.sendKeys(email);
	}
	public WebElement getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address.sendKeys(address);
	}
	public WebElement getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone.sendKeys(phone);
	}
	public WebElement getSubmit() {
		return submit;
	}
	public void setSubmit() {
		this.submit.click();
	}
	public WebElement getReset() {
		return reset;
	}
	public void setReset() {
		this.reset.click();
	}
	public Register(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
}
