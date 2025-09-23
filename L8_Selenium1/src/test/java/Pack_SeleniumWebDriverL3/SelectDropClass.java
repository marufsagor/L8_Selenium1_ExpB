package Pack_SeleniumWebDriverL3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        System.out.println("Url is:"+driver.getCurrentUrl());
        System.out.println("Title is:"+driver.getTitle());
        // driver.quit();
        driver.findElement(By.id("gender")).click();
        //Thread.sleep(3000);

        Select sl = new Select(driver.findElement(By.id("state")));
        sl.selectByIndex(4);
          Thread.sleep(2000);
       // sl.deselectByValue("NCR");

        Select sl2 =new Select(driver.findElement(By.id("city")));
        sl2.selectByValue("Agra");

    }
}
