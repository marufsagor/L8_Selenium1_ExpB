import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class BrowserExplore {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        System.out.println("Url is:"+driver.getCurrentUrl());
        System.out.println("Title is:"+driver.getTitle());
       // driver.quit();

    driver.findElement(By.id("user-name")).sendKeys("standard_user");
    Thread.sleep(3000);
    driver.findElement(By.id("password")).sendKeys("secret_sauce"); //id
    Thread.sleep(3000);
    driver.findElement(By.id("login-button")).click();
    Thread.sleep(3000);

    String name= driver.findElement(By.cssSelector("a[id='item_4_title_link'] div[class='inventory_item_name ']")).getText(); //cssSelector
        System.out.println("After Login the 1st item name is:"+name);

       String name2=driver.findElement(By.xpath("//div[normalize-space()='Sauce Labs Bike Light']")).getText();
        System.out.println("2nd Name is:"+name2);

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);

       driver.findElement(By.linkText("LinkedIn")).click();
       Thread.sleep(3000);

       driver.findElement(By.partialLinkText("cebook")).click();
        Thread.sleep(3000);

      List<WebElement> element= driver.findElements(By.tagName("a"));
      for (WebElement el:element){
          System.out.println(el.getText()+"Url"+el.getAttribute("href"));
          Thread.sleep(3000);

      }
      driver.navigate().to("https://www.prothomalo.com/");
        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();



    }

}
