package sel1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class s2 {
 static WebDriver driver;

 public static WebDriver startBrowser(String browsername,String url)
 {
   if(browsername.equalsIgnoreCase("chrome"))
  {
   System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
         driver= new ChromeDriver();
  }
  driver.manage().window().maximize();
  driver.get(url);
  return driver;
 }

}


