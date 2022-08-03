package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTapsLogin{
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();

	String text=driver.findElement(By.tagName("h2")).getText();
	System.out.println(text);

	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nila");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("B M");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("nilabalasundaram@gmail.com");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("nnnnnnnnnnn");
	
	WebElement generalStateProvinceGeoId = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	Select dd6=new Select(generalStateProvinceGeoId);
	dd6.selectByVisibleText("New York");
	
	
	WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
	Select dd1=new Select(source);
	dd1.selectByVisibleText("Employee");
	
	driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("demo");
	WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
	Select dd2=new Select(industry);
	dd2.selectByVisibleText("Computer Software");
	WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	Select dd3=new Select(ownership);
	dd3.selectByVisibleText("Partnership");
	WebElement MarketingCampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	Select dd4=new Select(MarketingCampaign);
	dd4.selectByVisibleText("Automobile");
	driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("0001");
	driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("80000");
    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software Testing");
    driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("200");
	
	driver.findElement(By.className("smallSubmit")).click();
	
	
	 String title="View Lead | opentaps CRM";
	    String title2=driver.getTitle();
	   
	    if(title.contains(title2)) {
		System.out.println("CreatedLead is Created Successful");		
	}
	else {
		System.out.println("CreatedLead is Not Created Successful");
	}
}
}
 