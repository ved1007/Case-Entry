package vProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CM_FolderView_Standard_Content {
	private static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.ie.driver", "C:\\Users\\vedant.jagani\\Desktop\\Automation Driver\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		
		// WebDriver driver=new FirefoxDriver();
		driver.get("https://wvm2012webapp4/CM.hqqs_Irmsweb/Login/Login.aspx");
		Thread.sleep(2000); // Need to wait 2 second for web site to load.

		driver.findElement(By.id("moreInfoContainer")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("overridelink")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("txtUserName")).clear();
		driver.findElement(By.id("txtUserName")).sendKeys("*Vedant1");
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("txtPassword")).clear();
		driver.findElement(By.id("txtPassword")).sendKeys("Welcome01");
		Thread.sleep(2000);
		
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(4000);
		
		
		
		
		driver.findElement(By.id("ctl00_LogoutLinkBtn")).click();
		driver.close();
		
		
	//	WebElement LogOutLink = driver.findElement(By.linkText("Log Out")); //Log Out
	//	LogOutLink.click(); 
	}
}
