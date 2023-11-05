package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepClass {
	WebDriver driver;
	@Given("^Open rediff application$")
	public void open_rediff_application() throws Throwable {
	 System.setProperty("Webdriver.chrome.driver","C:\\chrome driver\\chrome-win64\\chrome.exe");
	 ChromeOptions run = new ChromeOptions();
	 run.addArguments("--remote-allow-origins=*");
	 
	 driver = new ChromeDriver();
	 driver.get("https://www.rediff.com/");
	 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 driver.manage().window().maximize();
	 
	}
	@Then("^click signin$")
	public void click_signin() throws Throwable {
	 
		WebElement h = driver.findElement(By.xpath("//a[text()='Sign in']"));
		h.click();
		
		
	}

	@Then("^enter username$")
	public void enter_username() throws Throwable {
	 WebElement m = driver.findElement(By.id("login1"));
	 m.sendKeys("jkhlg");
	 Thread.sleep(2000);
	 
	}

	@Then("^click sign in$")
	public void click_sign_in() throws Throwable {
	  WebElement n = driver.findElement(By.name("proceed"));
	  n.click();
	  
	  driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		driver.close();
	}


}
