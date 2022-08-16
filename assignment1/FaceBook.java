package assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	driver.findElement(By.name("firstname")).sendKeys("Nila");
	driver.findElement(By.name("lastname")).sendKeys("balasundarm");
	driver.findElement(By.name("reg_email__")).sendKeys("nilabalasundaram@gmail.com");
	driver.findElement(By.name("reg_email_confirmation__")).sendKeys("nilabalasundaram@gmail.com");
	driver.findElement(By.name("reg_passwd__")).sendKeys("555555");
	WebElement day = driver.findElement(By.name("birthday_day"));
	Select dd1=new Select(day);
	dd1.selectByVisibleText("5");
	WebElement month= driver.findElement(By.name("birthday_month"));
	Select dd2=new Select(month);
	dd2.selectByVisibleText("Oct");
	WebElement year= driver.findElement(By.name("birthday_year"));
	Select dd3=new Select(year);
	dd3.selectByVisibleText("2000");
	driver.findElement(By.name("sex")).click();
}
}
