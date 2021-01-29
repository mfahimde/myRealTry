package Com.udemy.utils.pages;

import Com.udemy.utils.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RahulMainPage extends CommonMethods {
    @FindBy(xpath = "//strong[contains(text(),'Learn')]")
     public WebElement logoMani;

    @FindBy(xpath = "(//a[text()='Practice Projects'])[1]")
   public WebElement practiceProject;


   public RahulMainPage(){
        PageFactory.initElements(driver,this);
       System.out.println("some code addedd");
    }
}
