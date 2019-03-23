package AmazonTest;

import AmazonHome.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePage extends HomePage {
    @Test
   public void verifyTitle(){
        String title = driver.getTitle();
        Assert.assertEquals(title,"Health Insurance Plans for Individuals & Families, Employers, Medicare | UnitedHealthcare");
    }
    @Test
    public void clickOnLogo(){
        checkLogo();
    }
    @Test
    public void clickOnTextBeforeSearchBox(){
        checkSearchText();
    }
}
