package sel1;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
//import org.testng.remote.RemoteTestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class s1 {
	// WebDriver driver;

	 @BeforeMethod
	  public void beforeMethod() {
System.setProperty("webdriver.chrome.driver","C:\\Users\\ramyavenkit\\Desktop\\chromedriver.exe");
		 WebDriver  driver=new ChromeDriver();
		   driver.get("http://newtours.demoaut.com");
	  }

	 WebDriver  driver;
  @Test
  public void f() {
	   //actions , operations, methods
	   //click on signin link class="_2zrpKA _1dBPDZ"
	  
	// By driver;
	//driver.findElement(By.partialLinkText("Login & Signup")).click();
	 //driver.findElement(By.partialLinkText("LOGIN")).click();

	   driver.findElement(By.className("username")).sendKeys("mercury");
	   driver.findElement(By.className("password")).sendKeys("mercury");
	   driver.findElement(By.className("login")).click();

	//   driver.findElement(By.partialLinkText("SignIn")).click();
	   //enter username as lalitha
	 //  driver.findElement(By.name("userName")).sendKeys("Lalitha");
	   //enter password as password@123
	 //  driver.findElement(By.id("password")).sendKeys("Password123");
	   //click login 
	  // driver.findElement(By.xpath("//input[@value='Login']")).click();

	  
  }
   @AfterMethod
  public void afterMethod() {
	   driver.close();

  }

}
