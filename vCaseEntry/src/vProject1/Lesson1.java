package vProject1;

import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Lesson1 {
	private static WebDriver driver;
	private static String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.ie.driver", "C:\\Users\\vedant.jagani\\Desktop\\Automation Driver\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		
		// WebDriver driver=new FirefoxDriver();
		driver.get("https://wvm2012webapp4/IrmsWeb.HQQS_IRMSWeb/Login/Login.aspx");
		Thread.sleep(20000); // Need to wait 2 second for website to load.

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.id("txtUserName")).clear();
		driver.findElement(By.id("txtUserName")).sendKeys("*vedant");
		driver.findElement(By.id("txtPassword")).clear();
		driver.findElement(By.id("txtPassword")).sendKeys("vedantg1");
		driver.findElement(By.id("btnLogin")).click();
		

				Boolean LoginUnsuccessFul = driver.getTitle().contains("Login");
		if (LoginUnsuccessFul == true) {
			WebElement clickOkButton = driver.findElement(By.xpath("/html/body/form/div[1]/table/tbody/tr[2]/td[2]/div/div/div[2]/a[1]/span/span"));
			clickOkButton.click();
		}
		// driver.findElement(By.cssSelector("span.rwInnerSpan")).click();
		// driver.findElement(By.id("btnExpireUserSession")).click();

		driver.findElement(By.cssSelector("#rmiNewCase > span.rmText")).click();
		Thread.sleep(5000);
		Thread.sleep(5000);
		WebElement FirstName = driver.findElement(By.id("txtFirstName")); // EnterFristName
		FirstName.sendKeys("George");

		WebElement LastName = driver.findElement(By.id("txtLastName")); // EnterLastName
		LastName.sendKeys("Washington");
		
/*		WebElement Gender = driver.findElement(By.id("ctl00_ctl00_MainContent_MainContent_ucxContact_panelBarContacts_i0_rcbGender_Input")); //Gender
		Gender.click();
		Gender.sendKeys("Male");
		Gender.sendKeys(Keys.TAB);
		
		WebElement phone=driver.findElement(By.id("ctl00_ctl00_MainContent_MainContent_ucxContact_panelBarContacts_i0_txtPhone")); //Phone
		phone.sendKeys("1111111111");
		
		WebElement phone2=driver.findElement(By.id("ctl00_ctl00_MainContent_MainContent_ucxContact_panelBarContacts_i0_txtPhone2")); //Phone2
		phone2.sendKeys("2222222222");
		
		WebElement fax=driver.findElement(By.id("ctl00_ctl00_MainContent_MainContent_ucxContact_panelBarContacts_i0_txtFax")); //Fax
		fax.sendKeys("3333333333");
		
		WebElement attention = driver.findElement(By.id("txtAttention")); // Attention
		attention.sendKeys("AutomationTest");
		
		WebElement title = driver.findElement(By.id("ctl00_ctl00_MainContent_MainContent_ucxContact_panelBarContacts_i0_rcbTitle_Input")); //Title
		title.click();
		title.sendKeys("V Title");
		title.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
		WebElement company=driver.findElement(By.id("txtCompany")); //Company
		company.sendKeys("ABC");
		Thread.sleep(1000);
		
		WebElement address=driver.findElement(By.id("ctl00_ctl00_MainContent_MainContent_ucxContact_panelBarContacts_i0_txtAddress")); //Address
		address.sendKeys("1001 Chicago Drive");
		
		//WebElement zipCode=driver.findElement(By.id("ctl00_ctl00_MainContent_MainContent_ucxContact_panelBarContacts_i0_txtZipCode")); //Zip/PostalCode
		//zipCode.sendKeys("60056");
				
		WebElement eMail=driver.findElement(By.id("txtEmail"));
		eMail.sendKeys("vedant@gmail.com");
		
		WebElement dEpartment=driver.findElement(By.id("ctl00_ctl00_MainContent_MainContent_ucxContact_panelBarContacts_i0_rcbDept_Input")); //Department
		dEpartment.click();
		dEpartment.sendKeys("Radiology");
		dEpartment.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
		WebElement miscInfo=driver.findElement(By.id("ctl00_ctl00_MainContent_MainContent_ucxContact_panelBarContacts_i0_rcbMisc_Input")); //Misc Info
		miscInfo.click();
		miscInfo.sendKeys("NK_001");
		miscInfo.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
		WebElement gReeting = driver.findElement(By.id("txtGreeting")); //Greeting
		gReeting.sendKeys("Dear");
		
		WebElement degree=driver.findElement(By.id("txtDegree")); //Degree
		degree.sendKeys("PHD");
		
		WebElement salutation=driver.findElement(By.id("txtSalutation")); // Salutation
		salutation.sendKeys("Sir");
		
		WebElement type=driver.findElement(By.id("ctl00_ctl00_MainContent_MainContent_ucxContact_panelBarContacts_i0_rcbType_Input")); //Contact Type
		type.click();
		type.sendKeys("V Contact Type");
		type.sendKeys(Keys.TAB);
		Thread.sleep(2000);
				
		WebElement Product = driver.findElement(By.id("ctl00_ctl00_MainContent_MainContent_ucxQuestionResponse_rpbQuestionResponse_i0_rcbProduct_Input")); // Product
		Product.click();
		WebElement els= (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("li.colDesc5")));
		//ele.click();
		Product.sendKeys("_NX01");
		Product.sendKeys(Keys.TAB);
		Thread.sleep(3000);

		WebElement Question = driver.findElement(By.id("ctl00_ctl00_MainContent_MainContent_ucxQuestionResponse_rpbQuestionResponse_i0_rtxtQuestion")); // Question
		Question.sendKeys("This is Question field");
		
		//WebElement Notes = driver.findElement(By.id("ctl00_ctl00_MainContent_MainContent_ucxQuestionResponse_rpbQuestionResponse_i0_rtxtQuestionNotes")); //Notes
		//Notes.sendKeys("This is Notes field");
		
		WebElement classfield=driver.findElement(By.id("ctl00_ctl00_MainContent_MainContent_ucxQuestionResponse_rpbQuestionResponse_i0_rcbClassification_Input")); //Class
		classfield.click();
		classfield.sendKeys("Sydney QuestionClass");
		classfield.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
		WebElement subclassfield=driver.findElement(By.id("ctl00_ctl00_MainContent_MainContent_ucxQuestionResponse_rpbQuestionResponse_i0_rcbSubClassification_Input")); //Sub Class
		subclassfield.click();
		subclassfield.sendKeys("SydneyQuesSubClass");
		subclassfield.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
		WebElement Response = driver.findElement(By.id("ctl00_ctl00_MainContent_MainContent_ucxQuestionResponse_rpbQuestionResponse_i0_rtxtResponse")); //Response
		Response.sendKeys("This is Response field");
		
		WebElement resolution=driver.findElement(By.id("ctl00_ctl00_MainContent_MainContent_ucxQuestionResponse_rpbQuestionResponse_i0_rcbResolution_Input")); //Resolution
		resolution.click();
		resolution.sendKeys("V Resolution Type");
		resolution.sendKeys(Keys.TAB);
		Thread.sleep(2000); 
		
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.invisibilityOfElementLocated(By.id("loadingPanelContainer")));
		WebElement saveButton = driver.findElement(By.cssSelector("img.rtbIcon"));// Save the Case
		for(int i=0;i<3;i++){
			saveButton.click();
		}
		*/
		WebElement informationTab=driver.findElement(By.linkText("Information"));
		informationTab.click();
		Thread.sleep(1000);
		/*
		WebElement informationTab=driver.findElement(By.xpath("/html/body/form/div[4]/table/tbody/tr/td[2]/div[3]/div[5]/span/div/div/ul/li[2]/a/span/span/span"));
		informationTab.click();
		Thread.sleep(1000);*/
	
/*		WebElement requestedVia=driver.findElement(By.id("ctl00_ctl00_MainContent_MainContent_ucxCaseInformation_rcbRequestedBy_Input")); //Requested Via
		requestedVia.click();
		requestedVia.sendKeys("Representative");
		requestedVia.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		
		WebElement caseType=driver.findElement(By.id("ctl00_ctl00_MainContent_MainContent_ucxCaseInformation_rcbCaseType_Input")); //CaseType
		caseType.click();
		caseType.sendKeys("V Case Type");
		caseType.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		
		WebElement source=driver.findElement(By.id("ctl00_ctl00_MainContent_MainContent_ucxCaseInformation_rcbSource_Input")); //Source
		source.click();
		source.sendKeys("V Case Source");
		source.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		
		WebElement priority=driver.findElement(By.id("ctl00_ctl00_MainContent_MainContent_ucxCaseInformation_rcbPriority_Input")); //Priority
		priority.click();
		priority.sendKeys("High");
		priority.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
		WebElement handling=driver.findElement(By.id("ctl00_ctl00_MainContent_MainContent_ucxCaseInformation_rcbHandling_Input")); //Handling
		handling.click();
		handling.sendKeys("Email");
		handling.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
		WebElement miscData=driver.findElement(By.id("ctl00_ctl00_MainContent_MainContent_ucxCaseInformation_rcbMiscData_Input")); //Misc Data
		miscData.click();
		miscData.sendKeys("NK's Misc");
		miscData.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
		WebElement caseProduct=driver.findElement(By.id("ctl00_ctl00_MainContent_MainContent_ucxCaseInformation_rcbCaseProduct_Input")); //Case Product
		caseProduct.click();
		caseProduct.sendKeys("_NX01");
		caseProduct.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		
		WebElement entryPeriod=driver.findElement(By.id("ctl00_ctl00_MainContent_MainContent_ucxCaseInformation_rcbEntryPeriod_Input")); //Entry Period
		entryPeriod.click();
		entryPeriod.sendKeys("NK's Entry");
		entryPeriod.sendKeys(Keys.TAB);
		Thread.sleep(2000); */
		
		WebElement repTerritory=driver.findElement(By.id("ctl00_ctl00_MainContent_MainContent_ucxCaseInformation_rcbRepTerritory_Input")); //Rep Territory
		repTerritory.click();
		repTerritory.sendKeys("VEDANT");
		repTerritory.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.invisibilityOfElementLocated(By.id("loadingPanelContainer")));
		WebElement saveButton2 = driver.findElement(By.cssSelector("img.rtbIcon"));// Save the Case
		for(int i=0;i<3;i++){
			saveButton2.click();
		}
		
		Thread.sleep(2000);
		WebElement LogOutLink = driver.findElement(By.linkText("Log Out")); //Log Out
		LogOutLink.click(); 
	}
}
