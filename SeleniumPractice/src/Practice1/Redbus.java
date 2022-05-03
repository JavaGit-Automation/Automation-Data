package Practice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbus {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		
		WebElement fromCity=driver.findElement(By.cssSelector("input[data-message='Please enter a source city']"));
		fromCity.sendKeys("Pune");
		driver.findElement(By.cssSelector("div.fl.search-box.clearfix>div>ul>li:nth-of-type(2)")).click();
		
		WebElement toCity=driver.findElement(By.cssSelector("input[data-message='Please enter a destination city']"));
		toCity.sendKeys("Goa");
		driver.findElement(By.cssSelector("section[id='search']>div>div:nth-of-type(2)>div>ul>li:nth-of-type(4)")).click();
		
		WebElement calender=driver.findElement(By.cssSelector("div.fl.search-box.date-box.gtm-onwardCalendar>div>input"));
		calender.click();
		
		driver.findElement(By.cssSelector("table[class='rb-monthTable first last']>tbody>tr>td:nth-of-type(3)>button")).click();
		WebElement selectDate=driver.findElement(By.cssSelector("table[class='rb-monthTable first last']>tbody>tr:nth-of-type(5)>td:first-child"));
		selectDate.click();
		
		WebElement searchBus=driver.findElement(By.cssSelector("button[id='search_btn']"));
		searchBus.click();
		
		WebElement departureTime=driver.findElement(By.cssSelector("ul.dept-time.dt-time-filter>li:nth-of-type(4)"));
		departureTime.click();
		
//		driver.findElement(By.xpath("(//i[@class='icon icon-right'])[2]"));
//		driver.findElement(By.xpath("//i[@class='icon icon-close']"));
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);
		
//		WebElement busType=driver.findElement(By.cssSelector(".list-chkbox>li:nth-child(3)>label"));
//		busType.click();
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement bus=driver.findElement(By.cssSelector(".list-chkbox>li:nth-child(3)>label"));
		wait.until(ExpectedConditions.elementToBeClickable(bus));
		bus.click();
		
		
		
		
		
		
		
		
		
		
		
		
//		WebElement busType1=driver.findElement(By.cssSelector("ul.list-chkbox>li:nth-child(3)>label.cbox-label"));
//		WebElement busType2=driver.findElement(By.cssSelector("ul.list-chkbox>li:nth-child(3)"));
//		WebElement busType3=driver.findElement(By.cssSelector("ul.list-chkbox>li:nth-child(3)>label:nth-of-type(2)"));
//		
//		System.out.println(busType.isSelected());
//		System.out.println(busType1.isSelected());
//		System.out.println(busType2.isSelected());
//		System.out.println(busType3.isSelected());
//		
//		busType.click();
//		busType1.click();
//		busType2.click();

		
		
//		System.out.println(driver.findElement(By.cssSelector("div.clearfix.bus-item>div>div>div>div")).getText());
		
	}

}
