package Com.udemy.utils.runners;

import Com.udemy.utils.utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Testrunner extends CommonMethods {
    public static void clickin() {


        setup();

    }

    public static void main(String[] args) throws InterruptedException {
        clickin();
        driver.manage().window().maximize();
        Thread.sleep(7000);

       WebElement datepicker =driver.findElement(By.xpath("//input[@id='ctl00_mainContent_txt_Fromdate']/following-sibling::button"));

datepicker.click();

boolean flag=true;
while(flag){

WebElement month= driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-left'] //span[@class='ui-datepicker-month']"));

if (month.getText().equals("March")){
    flag=false;
    Thread.sleep(2000);
        List<WebElement> mydates=driver.findElements(By.id("hello"));// this is wrong
    
        for (WebElement date:mydates
             ) {
            if(date.getText().equals("13"));{
date.click();
                System.out.println(datepicker.getText());
            }
        }

}
driver.findElement(By.xpath("//span[text()='Next']")).click();
Thread.sleep(3000);
}
    }
}
