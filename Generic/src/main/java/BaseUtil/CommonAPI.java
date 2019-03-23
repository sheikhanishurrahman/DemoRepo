package BaseUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public WebDriver driver = null;
    @Parameters({"url"})
    @BeforeMethod
    public void setUp(String url){
      System.setProperty("webdriver.chrome.driver","C:\\Users\\sheik\\IdeaProjects\\MyAutomationProject\\Generic\\Lib\\chromedriver\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      driver.navigate().to(url);
      driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
      driver.manage().window().maximize();
    }
    @AfterMethod
    public void closeUp(){
      driver.quit();
    }
    public void typeOnSearchBox(String locator, String value){
        driver.findElement(By.id(locator)).sendKeys(value, Keys.ENTER);
    }
}
