package step;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends BaseClass {
	
//public ChromeDriver driver;
	
	/*@Given("Launch the browser")
	public void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		
	}
	
	@Given("Load the application url")
	public void loadURL()
	{
		driver.get("https://leaftaps.com/opentaps");
	}*/
	
	@Given("Enter username as {string}")
	public void enterUserName(String uName)
	{
		driver.findElement(By.id("username")).sendKeys(uName);
	}
	
	@Given("Enter Password as {string}")
	public void enterPassword(String password)
	{
		driver.findElement(By.id("password")).sendKeys(password);
	}
	
	@When("Click on login button")
	public void clickLogin()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Then("Homepage should be displayed")
	public void verifyHomePage()
	{
		String title=driver.getTitle();
		if(title.contains("TestLeaf"))
		{
			System.out.println("Login is Succesful");
		}
		else
		{
			System.out.println("Login is Unsuccessful");
		}
	}
		}
	






