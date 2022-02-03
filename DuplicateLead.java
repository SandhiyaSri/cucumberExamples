package step;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;

public class DuplicateLead extends BaseClass {

	@Then("Click submit button")
	public void submitButton()
	{
		driver.findElement(By.name("submitButton")).click();
	}
}
