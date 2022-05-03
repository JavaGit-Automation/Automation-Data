package Practice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class vTigerLoginLogout {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		if(driver.getTitle().equals("vtiger")){
			System.out.println("Login Sucessfully.");
		}else {
			System.out.println("Either Login not done or Page title not found.");
		}
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("admin");
		
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("Test@123");
		
		driver.findElement(By.className("button")).click();
		
		if(driver.getTitle().equals("Dashboard")) {
			System.out.println("HomePage open Sucessfully.");
		}else {
			System.out.println("Either Homepage not open or HomepagePage title not found.");
		}
		
		driver.findElement(By.className("userName")).click();
		driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
		
	}

}
