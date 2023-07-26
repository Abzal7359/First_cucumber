package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Myhooks {
	@Before
	public void Setup(Scenario sc) {
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"+sc.getName());
	}
	
	@After
	public void TearDown(Scenario sc) {
		System.out.println("--------------------------------------------------------------------------------------"+sc.getName());
	}

}
