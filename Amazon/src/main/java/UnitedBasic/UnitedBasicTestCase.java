package UnitedBasic;

import BaseUtil.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class UnitedBasicTestCase extends CommonAPI {
    public void checkSearchBox(){

    }
    public void searchButton(){
        driver.findElement(By.cssSelector(".search-button")).click();
    }
    public void checkTextEspanol(){
        //driver.findElement(By.cssSelector(".english-link lang-toggle")).click();
        if(driver.getPageSource().contains("Español")){
            System.out.println("Español text exist top right corner");
        }
        else{
            System.out.println("Español is not exist in the web page");
        }
    }
    public void verifyingText(){
        if(driver.getPageSource().contains("Already a member?")){
            System.out.println("Already a member? Text exist");
        }
        else {
            System.out.println("Already a member? Text not Exist");
        }
    }
    public void clickOnSignIn(){
        driver.findElement(By.id("loginmenubutton")).click();
    }
    public void clickSignInDownArrow(){
        driver.findElement(By.cssSelector(".caret")).click();
    }
}
