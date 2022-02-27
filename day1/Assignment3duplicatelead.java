package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3duplicatelead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Omnex software solution");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Meena");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("praveenraj");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("v");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("he process of determining which potential customers are most likely to make an actual purchase.");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("meenavenkat8@gmail.com");
		Select state= new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		state.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println("Page title is : " + driver.getTitle());
		driver.findElement(By.linkText("Duplicate Lead")).click();
		WebElement dlead=driver.findElement(By.id("createLeadForm_companyName"));
		dlead.clear();
		dlead.sendKeys("NTT Data");
		WebElement FN=driver.findElement(By.id("createLeadForm_firstName"));
		FN.clear();
		FN.click();
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println("Page title is : " + driver.getTitle());
	


	
	}

}
