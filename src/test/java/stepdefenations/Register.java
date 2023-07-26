package stepdefenations;

import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class Register {
	
	@Given("user navigates to registration page")
	public void user_navigates_to_registration_page() {
		System.out.println(">>");
	    
	}
	@When("user enters below details into the fields")
	public void user_enters_below_details_into_the_fields(DataTable dt) {
		Map<String, String> map = dt.asMap(String.class,String.class);
		System.out.println(">>"+map.get("firstname"));
		System.out.println(">>"+map.get("lastname"));
		System.out.println(">>"+map.get("email"));
		System.out.println(">>"+map.get("mobile number"));
		System.out.println(">>"+map.get("password"));
		System.out.println(">>"+map.get("confirm password"));
	}

//	@When("user enters firstname {string} into the firstname field")
//	public void user_enters_firstname_into_the_firstname_field(String string) {
//		System.out.println(">>"+string);
//	}

//	@When("enters lastname {string} into the last name field")
//	public void enters_lastname_into_the_last_name_field(String string) {
//		System.out.println(">>"+string);
//	}

//	@And("enters email {string} into the email field")
//	public void enters_email_into_the_email_field(String string) {
//		System.out.println(">>"+string);
//	}

//	@And("enter mobile number {string} into mobile number field")
//	public void enter_mobile_number_into_mobile_number_field(String string) {
//		System.out.println(">>"+string);
//	}

//	@And("enter password {string} into password field")
//	public void enter_password_into_password_field(String string) {
//		System.out.println(">>"+string);
//	}

//	@And("enter confirm password {string} into confirm password field")
//	public void enter_confirm_password_into_confirm_password_field(String string) {
//		System.out.println(">>"+string);
//	}

	@And("select privacy policy")
	public void select_privacy_policy() {
		System.out.println(">>");
	}

	@And("click continue button")
	public void click_continue_button() {
		System.out.println(">>");
	}

	@Then("Account should register successfully")
	public void account_should_register_successfully() {
		System.out.println(">>");
	}

	@When("select yes for NewsLetter")
	public void select_yes_for_news_letter() {
		System.out.println(">>");
	}

	@When("user doesnt enter details into any fields")
	public void user_doesnt_enter_details_into_any_fields() {
		System.out.println(">>");
	}

	@Then("Appropriate warning mssgs display under all mandatory fields")
	public void appropriate_warning_mssgs_display_under_all_mandatory_fields() {
		System.out.println(">>");
	}

	@Then("warning mssg displaying email is already existing")
	public void warning_mssg_displaying_email_is_already_existing() {
		System.out.println(">>");
	}

}
