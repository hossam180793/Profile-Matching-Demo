package Setup;

import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pages.HiasLoginPage;

public class Base {

	private WebDriver driver ;
	 HiasLoginPage HIASLOGIN;
		// TODO Auto-generated method stub
		@BeforeClass
		  public  void Setup() {
			  
			  System.setProperty("webdriver.chrome.driver", "D:\\git\\chromedriver.exe");
			  driver = new ChromeDriver();
			  driver .manage().window().maximize();			
			 HIASLOGIN = new HiasLoginPage(driver);
			 HIASLOGIN.NavigatetoURL();
			 
		  }
		
public WebDriver getdriver() {
	
	return driver ;
	
}
	

}
