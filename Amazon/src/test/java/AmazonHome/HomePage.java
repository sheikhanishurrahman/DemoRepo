package AmazonHome;

import BaseUtil.CommonAPI;
import org.openqa.selenium.By;

public class HomePage extends CommonAPI {
    public void checkLogo(){
        driver.findElement(By.xpath("//img[@class='uhc-logo desktop-logo']")).click();
    }
    public void checkSearchText(){
        driver.findElement(By.xpath("//label[@class='btn-search lbl']")).click();
    }
}
