package Practice1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gsmarena {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gsmarena.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		if (driver.getTitle().equals("GSMArena.com - mobile phone reviews, news, specifications and more...")) {
			System.out.println("Home Page Open Sucessfully.");
		} else {
			System.out.println("Either Home page not open correclty or page title not found.");
		}

		List<WebElement> mobileOpt = driver.findElements(By.cssSelector("div.brandmenu-v2.light.l-box.clearfix>ul>li"));
		System.out.println("Size Of main Menu:- " + mobileOpt.size());
		for (int i = 0; i < mobileOpt.size(); i++) {
			WebElement opt = mobileOpt.get(i);
			System.out.println(opt.getText());
		}

	}

}
