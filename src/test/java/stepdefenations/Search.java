package stepdefenations;

import io.cucumber.java.en.*;

public class Search {
	
	@Given("user opens the application")
	public void user_opens_the_application() {
		System.out.println(">>");
	    
	}

	@When("enter valid product into search field")
	public void enter_valid_product_into_search_field() {
		System.out.println(">>");
	}

	@And("click on search button")
	public void click_on_search_button() {
		System.out.println(">>");
	}

	@Then("valid product should get displayed in search results")
	public void valid_product_should_get_displayed_in_search_results() {
		System.out.println(">>");
	}

	@When("enter INvalid product into search field")
	public void enter_i_nvalid_product_into_search_field() {
		System.out.println(">>");
	}

	@Then("proper text display no product matching should display")
	public void proper_text_display_no_product_matching_should_display() {
		System.out.println(">>");
	}

	@When("user doesnt enter any product name into search field")
	public void user_doesnt_enter_any_product_name_into_search_field() {
		System.out.println(">>");
		
	}

}
