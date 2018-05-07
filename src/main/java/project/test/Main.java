package project.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;



public class Main {
    static WebDriver driver;
    static Wait<WebDriver> wait;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "G:\\My Programs\\NetBeansProjects\\TestSelenium\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("http://selenium.thinkcode.se/helloWorld");

        WebElement headline=driver.findElement(By.id("headline"));


        boolean result1;
        
        try {
            
            result1 = headline.getText().equals("Hello, world!");;
        } catch(Exception e) {
            e.printStackTrace();
            result1 = false;
        } finally {
            driver.close();
        }

        
        System.out.println("Result1 Test " + (result1? "passed." : "failed."));
        if (!result1) {
          //  System.exit(1);
          System.out.println("the test failed");
        }
    }

    



    
    
}