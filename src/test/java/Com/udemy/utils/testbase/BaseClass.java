package Com.udemy.utils.testbase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static WebDriver driver;
    public static void setup(){
        try {
            String myurl="chrome";
switch (myurl){
    case "chrome":
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();



    case"firefox":
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();


            }
        }
        catch (Exception e){
            System.out.println("could not read properties");
        }
driver.navigate().to("https://www.spicejet.com/");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }
    public static void teardown(){
        if (driver!=null){
            driver.quit();
        }
    }
}
