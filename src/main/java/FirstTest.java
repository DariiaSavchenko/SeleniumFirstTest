import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FirstTest {
    @Test
    public void checkPayMaiSunMobile() throws InterruptedException {
        System.setProperty ("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    //   PRIVAT24

    //   By amountField= By.xpath("//input[@data-qa-node='amount']");
    //   By cardNumberFrom = By.xpath("//td[@data-qa-node='card']");

    //     driver.get("https://next.privat24.ua/mobile");
    //      Thread.sleep(2000);
    //     driver.navigate().to("https://next.privat24.ua");
    //      Thread.sleep(2000);
    //     driver.navigate().back();
    //      Thread.sleep(2000);
    //     driver.navigate().forward();
    //     Thread.sleep(2000);
    //     driver.navigate().refresh();
    //     driver.close();
    //     driver.quit();
    //     driver.manage().window().fullscreen();
    //     driver.manage().window().maximize();
    //     driver.manage().window().setSize(new Dimension(375,812));
    //     driver.findElement(By.xpath("//input[@data-qa-node='phone-number']")).sendKeys("636087092");
    //     driver.findElement(amountField).clear();
    //     driver.findElement(amountField).sendKeys("1");
    //     driver.findElement(By.xpath("//input[@data-qa-node='numberdebitSource']")).sendKeys("4552331448138217");
    //     driver.findElement(By.xpath("//input[@data-qa-node='expiredebitSource']")).sendKeys("1122");
    //     driver.findElement(By.xpath("//input[@data-qa-node='cvvdebitSource']")).sendKeys("111");
    //     driver.findElement(By.xpath("//button[@type='submit']")).click();

    //    System.out.println("card value:" + driver.findElement(cardNumberFrom).getText());
    //     Assert.assertEquals("4552 **** **** 8217", driver.findElement(cardNumberFrom).getText());

    //  FACEBOOK
    // LogInError
       By LogInPwError = By.xpath("//a[@href='https://uk-ua.facebook.com/recover/initiate?lwv=120&lwc=1348092&ars=facebook_login_pw_error']");

       driver.get("https://uk-ua.facebook.com/");
       driver.findElement(By.xpath("//input[@id='email']")).sendKeys("+380969482629");
       driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1122");
       driver.findElement(By.xpath("//button[@name='login']")).click();

        System.out.println("Error:" + driver.findElement(LogInPwError).getText());
        Assert.assertEquals("Забули пароль?", driver.findElement(LogInPwError).getText());

    //  LogInSuccess

        By LogInSuccess = By.xpath("//div[@aria-live='polite']/span/span");

        driver.get("https://uk-ua.facebook.com/");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("+380969482629");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("HillelJava");
        driver.findElement(By.xpath("//button[@name='login']")).click();
        driver.findElement(By.xpath("//input[@type='search']")).click();

        System.out.println("Search:" + driver.findElement(LogInSuccess).getText());
        Assert.assertEquals("Нет недавних запросов", driver.findElement(LogInSuccess).getText());

    }
}
