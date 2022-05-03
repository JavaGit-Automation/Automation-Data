package Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actiTime {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.actitime.com/");

		String pageTile = driver.getTitle();
		System.out.println("Application Page Titlee: " + pageTile);
		System.out.println("Page Title lenght : " + pageTile.length());

		String expectedLoginTitle = "actiTIME - Login";
		String actualLoginTitle = driver.getTitle();
		if (actualLoginTitle.equals(expectedLoginTitle)) {
			System.out.println("Login Page Open Sucessfully.");
		} else {
			System.out.println("Page title got changed or Login Page Error.");
		}

		WebElement usernameInputField = driver.findElement(By.id("username"));
		usernameInputField.clear();
		usernameInputField.sendKeys("admin");

		WebElement passwordInputField = driver.findElement(By.name("pwd"));
		passwordInputField.clear();
		passwordInputField.sendKeys("manager");

		WebElement loginButtonField = driver.findElement(By.id("loginButton"));
		loginButtonField.click();

		WebElement logoutButtonField = driver.findElement(By.id("logoutLink"));
		logoutButtonField.click();

		System.out.println("Home Page Title: " + driver.getTitle());
		System.out.println("Application Current URL: " + driver.getCurrentUrl());

		 driver.close();

	}

}
