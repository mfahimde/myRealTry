package Com.udemy.utils.utils;

import Com.udemy.utils.testbase.Pageinitilaizer;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods extends Pageinitilaizer {

    public static WebDriverWait getwait(){
        WebDriverWait wait=new WebDriverWait(driver,5);
return wait;
    }
    public static void Click(WebElement element){
        getwait().until(ExpectedConditions.elementToBeClickable(element));
element.click();
    }
}
