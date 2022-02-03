package step;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteLead extends BaseClass { 
	String leadID;
	/*@When("Click {string} Link")
	public void clickLink(String link)
	{
		driver.findElement(By.linkText(link)).click();
	}*/
	@Then("Redirect to  {string} page")
	public void redirectToPage(String page)
	{
		boolean displayed = driver.findElement(By.linkText(page)).isDisplayed();
		Assert.assertTrue(displayed);
	}
	@When("Click {string} tab")
	public void clickPhoneTab()
	{
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}
	@Then("Provide PhoneNumber {string}")
	public void providePhoneNumber(String phoneNumber)
	{
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNumber);
	}
	@When("Click {string} button")
	public void clickButton(String button)
	{
		driver.findElement(By.xpath(button)).click();
	}
	@Given("Click first lead")
	public void clickFirstLead() 
	{
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
	}
	@Given("Give FirstLeadid in leadId textbox")
	public void provideLeadId()
	{
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
	}
	@Then("Get RecordsText and check")
	public void getNoRecordsDisplay()
	{
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
		
	}

}
