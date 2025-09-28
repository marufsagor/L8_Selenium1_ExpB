import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstTest{
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        System.out.println("Url is:" + driver.getCurrentUrl());
        System.out.println("Title is:" + driver.getTitle());

        driver.findElement(By.name("name")).sendKeys("Maruf Sagor");
        Thread.sleep(3000);
        driver.findElement(By.name("email")).sendKeys("marufsagor10@gmail.com");
        Thread.sleep(3000);
        //driver.findElement(By.name("gender")).click();

       // WebElement maleRadio = driver.findElement(By.id("gender"));
       // maleRadio.click();
       // System.out.println("Male selected? " + maleRadio.isSelected());

        //WebElement maleRadio = driver.findElement(By.id("gender"));
        driver.findElement(By.xpath("//div[3]//div[1]//div[1]//div[2]//input[1]")).click(); //dropdown
        Thread.sleep(3000);
        driver.findElement(By.id("mobile")).sendKeys("01684096265");
        Thread.sleep(3000);

        WebElement dobInput = driver.findElement(By.id("dob"));
        dobInput.sendKeys("2000-05-20");   // date calender
        Thread.sleep(3000);

        driver.findElement(By.id("subjects")).sendKeys("Computer Science and Engineering");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[7]//div[1]//div[1]//div[2]//input[1]")).click();
        Thread.sleep(3000);

        WebElement upload = driver.findElement(By.id("picture"));
        upload.sendKeys("C:\\Users\\User\\Downloads\\amloki.png"); //attached file
        //C:\\Users\\User\\Downloads\\amloki.png
        Thread.sleep(3000);

        driver.findElement(By.xpath("//textarea[@id='picture']")).sendKeys("Mirpur 10,Dhaka,Bnagladesh");
        Thread.sleep(3000);

        Select sl= new Select(driver.findElement(By.id("state")));
        sl.selectByVisibleText("Haryana");   //dropdown
        Thread.sleep(3000);


        Select sl2= new Select(driver.findElement(By.name("city")));
        sl2.selectByVisibleText("Lucknow");
        Thread.sleep(3000);


        driver.findElement(By.xpath("//input[@value='Login']")).click();

    }
    @Test
    public void checkTest(){
        System.out.println(" Filling up Reg Form");

    }



}
