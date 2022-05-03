package Practice1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartCategoriesWithFindElements {

	public static void main(String[] args) {
		
		String driverPath = System.getProperty("user.dir") + "\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");

		if(driver.getTitle().equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!")) {
			System.out.println("Home Page Open Sucessfully.");
		}else {
			System.out.println("Either Home page not open correclty or page title not found.");
		}
		
		List<WebElement> categories = driver.findElements(By.cssSelector("._37M3Pb>div>a>div>div>img"));
		System.out.println("Option count is: " + categories.size());
		for (int i = 0; i < categories.size(); i++) {
			WebElement cat = categories.get(i);
			System.out.println("Element of List: " + cat.getAttribute("alt"));

		}
	}
}
