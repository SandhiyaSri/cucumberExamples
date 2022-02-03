package step;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;

public class EditLead extends BaseClass{

	@Then("Update companyname as {string}")
	public void updateCompanyName(String companyName)
	{
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(companyName);
	}
}
