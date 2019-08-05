package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageBean.Register;

public class LoginStepDefinition {
	WebDriver driver;
	private Register register;
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Users\\sbigasia\\Desktop\\chromedriver_win32\\chromedriver.exe" );
		
		driver= new ChromeDriver();		
	}
	@Given("^User is on User Registration Page$")
	public void user_is_on_User_Registration_Page() throws Throwable {
	    driver.get("D:\\Subhanshu\\Spring Boot Sps 3.9\\WorkingWithForms_WebDriver\\HTML Files\\WorkingWithForms.html");
	    register=new Register(driver);
	}

	@When("^User enters invalid User Name$")
	public void user_enters_invalid_User_Name() throws Throwable {
	    register.setUname("");
	    Thread.sleep(2000);
	}

	@Then("^The User Name  field is invalid$")
	public void the_User_Name_field_is_invalid() throws Throwable {
		register.setSubmit();
		String expected="* Please enter UserName.";
		String actual=register.getUserErrMsg1().getText();
		Assert.assertEquals(expected, actual);
	    
	}

	@When("^User enters valid User Name but invalid password$")
	public void user_enters_valid_User_Name_but_invalid_password() throws Throwable {
	    register.setUname("subbu");
	    register.setPassword("");
	    Thread.sleep(2000);
	}

	@Then("^The Password field is invalid$")
	public void the_Password_field_is_invalid() throws Throwable {
		register.setSubmit();
		String expected="* Please enter Password.";
		String actual=register.getUserErrMsg2().getText();
		Assert.assertEquals(expected, actual);
	}

	@When("^User enters valid User Name and Password but enters invalid data in Confirm Password field$")
	public void user_enters_valid_User_Name_and_Password_but_enters_invalid_data_in_Confirm_Password_field() throws Throwable {
		register.setUname("subbu");
	    register.setPassword("subbu");
	    register.setConfpass("");
	    Thread.sleep(2000);
	}

	@Then("^The Confirm Password  field is invalid$")
	public void the_Confirm_Password_field_is_invalid() throws Throwable {
		register.setSubmit();
		String expected="* Password Donot Match.";
		String actual=register.getUserErrMsg3().getText();
		Assert.assertEquals(expected, actual);
	}

	@When("^User enters valid data in User Name,Password and Confirm Password field but invalid data in First Name field$")
	public void user_enters_valid_data_in_User_Name_Password_and_Confirm_Password_field_but_invalid_data_in_First_Name_field() throws Throwable {
		register.setUname("subbu");
	    register.setPassword("subbu");
	    register.setConfpass("subbu");
	    register.setFirstName("");
	    Thread.sleep(2000);
	}

	@Then("^The First Name  field is invalid$")
	public void the_First_Name_field_is_invalid() throws Throwable {
		register.setSubmit();
		String expected="* Please enter FirstName.";
		String actual=register.getUserErrMsg4().getText();
		Assert.assertEquals(expected, actual);
	}

	@When("^User enters valid data in User Name,Password and Confirm Password field but invalid data in Last Name field$")
	public void user_enters_valid_data_in_User_Name_Password_and_Confirm_Password_field_but_invalid_data_in_Last_Name_field() throws Throwable {
		register.setUname("subbu");
	    register.setPassword("subbu");
	    register.setConfpass("subbu");
	    register.setFirstName("Subhanshu");
	    register.setLastName("");
	    Thread.sleep(2000);
	}

	@Then("^The Last Name  field is invalid$")
	public void the_Last_Name_field_is_invalid() throws Throwable {
		register.setSubmit();
		String expected="* Please enter LastName.";
		String actual=register.getUserErrMsg5().getText();
		Assert.assertEquals(expected, actual);
	}

	@When("^User selects Male radio button$")
	public void user_selects_Male_radio_button() throws Throwable {
		register.setUname("subbu");
	    register.setPassword("subbu");
	    register.setConfpass("subbu");
	    register.setFirstName("Subhanshu");
	    register.setLastName("");
	    Thread.sleep(2000);
	}

	@Then("^Male should be send as Gender value$")
	public void male_should_be_send_as_Gender_value() throws Throwable {
		register.setUname("subbu");
	    register.setPassword("subbu");
	    register.setConfpass("subbu");
	    register.setFirstName("Subhanshu");
	    register.setLastName("");
	    Thread.sleep(2000);
	}

	@When("^User selects Female radio button$")
	public void user_selects_Female_radio_button() throws Throwable {
		register.setUname("subbu");
	    register.setPassword("subbu");
	    register.setConfpass("subbu");
	    register.setFirstName("Subhanshu");
	    register.setLastName("");
	    Thread.sleep(2000);
	}

	@Then("^Female should be send as Gender value$")
	public void female_should_be_send_as_Gender_value() throws Throwable {
		register.setUname("subbu");
	    register.setPassword("subbu");
	    register.setConfpass("subbu");
	    register.setFirstName("Subhanshu");
	    register.setLastName("");
	    Thread.sleep(2000);
	}

	@When("^User enters valid data in User Name,Password,Confirm Password and Last Name field but invalid data in Date of Birth field$")
	public void user_enters_valid_data_in_User_Name_Password_Confirm_Password_and_Last_Name_field_but_invalid_data_in_Date_of_Birth_field() throws Throwable {
		register.setUname("subbu");
	    register.setPassword("subbu");
	    register.setConfpass("subbu");
	    register.setFirstName("Subhanshu");
	    register.setLastName("Bigasia");
	    Thread.sleep(2000);
	}

	@Then("^The Date Of Birth field is invalid$")
	public void the_Date_Of_Birth_field_is_invalid() throws Throwable {
		register.setUname("subbu");
	    register.setPassword("subbu");
	    register.setConfpass("subbu");
	    register.setFirstName("Subhanshu");
	    register.setLastName("Bigasia");
	    Thread.sleep(2000);
	}

	@When("^User enters valid data in User Name,Password,Confirm Password,Last Name and Date of birth field but invalid data in Email Id field$")
	public void user_enters_valid_data_in_User_Name_Password_Confirm_Password_Last_Name_and_Date_of_birth_field_but_invalid_data_in_Email_Id_field() throws Throwable {
		register.setUname("subbu");
	    register.setPassword("subbu");
	    register.setConfpass("subbu");
	    register.setFirstName("Subhanshu");
	    register.setLastName("Bigasia");
	    register.setEmail("");
	    Thread.sleep(2000);
	}

	@Then("^The Email Id\" field is invalid$")
	public void the_Email_Id_field_is_invalid() throws Throwable {
		register.setSubmit();
		String expected="* Please enter Email.";
		String actual=register.getUserErrMsg6().getText();
		Assert.assertEquals(expected, actual);
	}

	@When("^User enters valid data in User Name,Password,Confirm Password,Last Name,Date of birth and Email Id field but invalid data in Address field$")
	public void user_enters_valid_data_in_User_Name_Password_Confirm_Password_Last_Name_Date_of_birth_and_Email_Id_field_but_invalid_data_in_Address_field() throws Throwable {
		register.setUname("subbu");
	    register.setPassword("subbu");
	    register.setConfpass("subbu");
	    register.setFirstName("Subhanshu");
	    register.setLastName("Bigasia");
	    register.setEmail("example@domain.com");
	    register.setAddress("");
	    Thread.sleep(2000);
	}

	@Then("^The Address  field is invalid$")
	public void the_Address_field_is_invalid() throws Throwable {
		register.setSubmit();
		String expected="* Please enter Address.";
		String actual=register.getUserErrMsg7().getText();
		Assert.assertEquals(expected, actual);
	}

	@When("^User selects Mumbai$")
	public void user_selects_Mumbai() throws Throwable {
		register.setUname("subbu");
	    register.setPassword("subbu");
	    register.setConfpass("subbu");
	    register.setFirstName("Subhanshu");
	    register.setLastName("Bigasia");
	    register.setEmail("example@domain.com");
	    register.setAddress("");
	    Thread.sleep(2000);
	}

	@Then("^Mumbai should be send$")
	public void mumbai_should_be_send() throws Throwable {
		register.setUname("subbu");
	    register.setPassword("subbu");
	    register.setConfpass("subbu");
	    register.setFirstName("Subhanshu");
	    register.setLastName("Bigasia");
	    register.setEmail("example@domain.com");
	    register.setAddress("");
	    Thread.sleep(2000);
	}

	@When("^User selects Pune$")
	public void user_selects_Pune() throws Throwable {
		register.setUname("subbu");
	    register.setPassword("subbu");
	    register.setConfpass("subbu");
	    register.setFirstName("Subhanshu");
	    register.setLastName("Bigasia");
	    register.setEmail("example@domain.com");
	    register.setAddress("");
	    Thread.sleep(2000);
	}

	@Then("^Pune should be send$")
	public void pune_should_be_send() throws Throwable {
		register.setUname("subbu");
	    register.setPassword("subbu");
	    register.setConfpass("subbu");
	    register.setFirstName("Subhanshu");
	    register.setLastName("Bigasia");
	    register.setEmail("example@domain.com");
	    register.setAddress("");
	    Thread.sleep(2000);
	}

	@When("^User selects Bangalore$")
	public void user_selects_Bangalore() throws Throwable {
		register.setUname("subbu");
	    register.setPassword("subbu");
	    register.setConfpass("subbu");
	    register.setFirstName("Subhanshu");
	    register.setLastName("Bigasia");
	    register.setEmail("example@domain.com");
	    register.setAddress("");
	    Thread.sleep(2000);
	}

	@Then("^Bangalore should be send$")
	public void bangalore_should_be_send() throws Throwable {
		register.setUname("subbu");
	    register.setPassword("subbu");
	    register.setConfpass("subbu");
	    register.setFirstName("Subhanshu");
	    register.setLastName("Bigasia");
	    register.setEmail("example@domain.com");
	    register.setAddress("");
	    Thread.sleep(2000);
	}

	@When("^User selects Chennai$")
	public void user_selects_Chennai() throws Throwable {
		register.setUname("subbu");
	    register.setPassword("subbu");
	    register.setConfpass("subbu");
	    register.setFirstName("Subhanshu");
	    register.setLastName("Bigasia");
	    register.setEmail("example@domain.com");
	    register.setAddress("");
	    Thread.sleep(2000);
	}

	@Then("^Chennai should be send$")
	public void chennai_should_be_send() throws Throwable {
		register.setUname("subbu");
	    register.setPassword("subbu");
	    register.setConfpass("subbu");
	    register.setFirstName("Subhanshu");
	    register.setLastName("Bigasia");
	    register.setEmail("example@domain.com");
	    register.setAddress("");
	    Thread.sleep(2000);
	}

	@When("^User enters valid data in User Name,Password,Confirm Password,Last Name,Date of birth,Email Id and Address field but invalid data in Phone field$")
	public void user_enters_valid_data_in_User_Name_Password_Confirm_Password_Last_Name_Date_of_birth_Email_Id_and_Address_field_but_invalid_data_in_Phone_field() throws Throwable {
		register.setUname("subbu");
	    register.setPassword("subbu");
	    register.setConfpass("subbu");
	    register.setFirstName("Subhanshu");
	    register.setLastName("Bigasia");
	    register.setEmail("example@domain.com");
	    register.setAddress("Pune");
	    register.setPhone("");
	    Thread.sleep(2000);
	}

	@Then("^The Phone field is invalid$")
	public void the_Phone_field_is_invalid() throws Throwable {
		register.setSubmit();
		String expected="* Please enter Phone Number.";
		String actual=register.getUserErrMsg8().getText();
		Assert.assertEquals(expected, actual);
	}

	@When("^User selects Music$")
	public void user_selects_Music() throws Throwable {
		register.setUname("subbu");
	    register.setPassword("subbu");
	    register.setConfpass("subbu");
	    register.setFirstName("Subhanshu");
	    register.setLastName("Bigasia");
	    register.setEmail("example@domain.com");
	    register.setAddress("Pune");
	    register.setPhone("");
	    Thread.sleep(2000);
	}

	@Then("^Music should be send$")
	public void music_should_be_send() throws Throwable {
		register.setUname("subbu");
	    register.setPassword("subbu");
	    register.setConfpass("subbu");
	    register.setFirstName("Subhanshu");
	    register.setLastName("Bigasia");
	    register.setEmail("example@domain.com");
	    register.setAddress("Pune");
	    register.setPhone("");
	    Thread.sleep(2000);
	}

	@When("^User selects Reading$")
	public void user_selects_Reading() throws Throwable {
		register.setUname("subbu");
	    register.setPassword("subbu");
	    register.setConfpass("subbu");
	    register.setFirstName("Subhanshu");
	    register.setLastName("Bigasia");
	    register.setEmail("example@domain.com");
	    register.setAddress("Pune");
	    register.setPhone("");
	    Thread.sleep(2000);
	}

	@Then("^Reading should be send$")
	public void reading_should_be_send() throws Throwable {
		register.setUname("subbu");
	    register.setPassword("subbu");
	    register.setConfpass("subbu");
	    register.setFirstName("Subhanshu");
	    register.setLastName("Bigasia");
	    register.setEmail("example@domain.com");
	    register.setAddress("Pune");
	    register.setPhone("");
	    Thread.sleep(2000);
	}

	@When("^User selects Movies$")
	public void user_selects_Movies() throws Throwable {
		register.setUname("subbu");
	    register.setPassword("subbu");
	    register.setConfpass("subbu");
	    register.setFirstName("Subhanshu");
	    register.setLastName("Bigasia");
	    register.setEmail("example@domain.com");
	    register.setAddress("Pune");
	    register.setPhone("");
	    Thread.sleep(2000);
	}

	@Then("^Movies should be send$")
	public void movies_should_be_send() throws Throwable {
		register.setUname("subbu");
	    register.setPassword("subbu");
	    register.setConfpass("subbu");
	    register.setFirstName("Subhanshu");
	    register.setLastName("Bigasia");
	    register.setEmail("example@domain.com");
	    register.setAddress("Pune");
	    register.setPhone("");
	    Thread.sleep(2000);
	}

	@When("^User clicks on Submit button with valid inputs$")
	public void user_clicks_on_Submit_button_with_valid_inputs() throws Throwable {
		register.setUname("subbu");
	    register.setPassword("subbu");
	    register.setConfpass("subbu");
	    register.setFirstName("Subhanshu");
	    register.setLastName("Bigasia");
	    register.setEmail("example@domain.com");
	    register.setAddress("Pune");
	    register.setPhone("898998899898");
	   register.setSubmit();
	}

	@Then("^Redirected to Success Page$")
	public void redirected_to_Success_Page() throws Throwable {
//	    driver.get("D:\\Users\\sbigasia\\Desktop\\success.html");
	}

	@When("^User clicks on Reset button$")
	public void user_clicks_on_Reset_button() throws Throwable {
	    register.setReset();
	}

	@Then("^All fields in forms should be set to blank$")
	public void all_fields_in_forms_should_be_set_to_blank() throws Throwable {
		register.setUname("");
	    register.setPassword("");
	    register.setConfpass("");
	    register.setFirstName("");
	    register.setLastName("");
	    register.setEmail("");
	    register.setAddress("");
	    register.setPhone("");
	    Thread.sleep(2000);
	}

}
