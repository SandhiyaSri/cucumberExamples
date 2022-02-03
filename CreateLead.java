package step;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends BaseClass {
	/*@Given("Click crmsfa Link")
	public void clickCrmSfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}*/

	@When("Click {string} Link")
	public void clickLink(String link)
	{
		driver.findElement(By.linkText(link)).click();
	}
	
	@Then("Go to {string} page")
	public void checkPage(String page)
	{
		boolean displayed = driver.findElement(By.linkText(page)).isDisplayed();
		Assert.assertTrue(displayed);
	}
	/*@Given("Click Leads link")
	public void clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
	}

	@Given("Click CreateLead Link")
	public void clickCreateLeadLink() {
		driver.findElement(By.linkText("Create Lead")).click();
	}*/

	@Given("Enter CompanyName as {string}")
	public void enterCompanyName(String companyName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
	}

	@Given("Enter FirstName as {string}")
	public void enterFirstName(String firstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
	}

	@Given("Enter LastName as {string}")
	public void enterLastName(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
	}
	@Given("Enter PhoneNumber as {string}")
	public void enterPhoneNumberAs(String phoneNumber)
	{
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phoneNumber);
	}

	@When("Click CreateLead Button")
	public void clickCreateLead() {
		driver.findElement(By.name("submitButton")).click();
	}

	@Given("Check view lead page")
	public void checkTitle() {
		if (driver.getTitle().contains("View")) {
			System.out.println("Success");
		} else {
			System.out.println("Failure");
		}
		
		//Assert.assertTrue(false);

	}
}
