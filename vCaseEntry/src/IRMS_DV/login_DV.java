package IRMS_DV;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.ie.InternetExplorerDriver;

import vProject1.WebDriver;

	public class login_DV {
		private static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.ie.driver", "C:\\Users\\vedant.jagani\\Desktop\\Automation Driver\\IEDriverServer.exe");
			InternetExplorerDriver driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			
			// WebDriver driver=new FirefoxDriver();
			driver.get("https://obahqqs.irmsweb.net/DV.HQQSQA/Forms/Login.aspx");
			Thread.sleep(5000); // Need to wait 2 second for web site to load.
	
			
			driver.findElementByName("User Name").sendKeys("vedant");
			
/*			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("email")).sendKeys("Vedant");
			Thread.sleep(2000);
			
/*			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("Welcome023");
			Thread.sleep(2000);
*/			
			driver.findElement(By.id("btnSubmit_I")).click();
			Thread.sleep(4000);
			
/*			
			
			driver.findElement(By.id("ctl00_LogoutLinkBtn")).click();
			driver.close();
		*/	
			
		//	WebElement LogOutLink = driver.findElement(By.linkText("Log Out")); //Log Out
		//	LogOutLink.click(); 
		}
	}

	
	
