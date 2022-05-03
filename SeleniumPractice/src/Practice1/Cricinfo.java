package Practice1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricinfo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.espncricinfo.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		if(driver.getTitle().equals("Live cricket scores, match schedules, latest cricket news, cricket videos")) {
			System.out.println("Home Page Open Sucessfully.");
		}else {
			System.out.println("Either Home page not open correclty or page title not found.");
		}
		
		List<WebElement> mainMenu=driver.findElements(By.cssSelector("div.ds-flex.ds-items-center.ds-justify-between.ds-flex-1>div>div>a"));
		System.out.println("Size Of main Menu:- "+mainMenu.size());
		for(int i=0;i<mainMenu.size();i++) {
			WebElement opt=mainMenu.get(i);
			System.out.println(opt.getText());
		}
	}

}
