package stepdefenations;

import io.cucumber.java.en.*;

public class Login {
	
	
	@Given("user navigates to login page")
	public void user_navigates_to_login_page() {
		System.out.println(">>Entered to login page ");
	   
	}
	
	@When("^user enters valid email address (.+)$")
	public void user_enters_valid_email_address(String string) {
		System.out.println(">>Entered mail"+string);
	}
	
	@When("^user enters valid password (.+)$")
	public void user_enters_valid_password(String string) {
		System.out.println(">>Entered password"+string);
	}
	
	@And("clicks login button")
	public void clicks_login_button() {
		System.out.println(">>Clicked login");
	}
	
	@Then("user should login succesfully")
	public void user_should_login_succesfully() {
		System.out.println(">>Login success");
	}
	
	@When("user enters INvalid email address {string}")
	public void user_enters_i_nvalid_email_address(String string) {
		System.out.println(">>Entered Ivalid mail"+string);
	}
	
	@When("user enters INvalid password {string}")
	public void user_enters_i_nvalid_password(String string) {
		System.out.println(">>Entered invalid password"+string);
	}
	
	@Then("user should get proper warning message")
	public void user_should_get_proper_warning_message() {
		System.out.println(">>Warning");
	}
	
	@When("user doesnt enter any credintials")
	public void user_doesnt_enter_any_credintials() {
		System.out.println(">>NO credinatials");
	}


}
