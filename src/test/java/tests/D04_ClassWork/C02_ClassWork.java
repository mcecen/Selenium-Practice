package tests.D04_ClassWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_ClassWork {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //1. http://zero.webappsecurity.com
        driver.get("http://zero.webappsecurity.com");
        //sayfasina gidin

        //2. Signin buttonuna tiklayin
        driver.findElement(By.id("signin_button")).click();

        //3. Login alanine “username” yazdirin
        WebElement loginElemnt = driver.findElement(By.id("user_login"));
        loginElemnt.sendKeys("username");
        Thread.sleep(1000);

        //4. Password alanina “password” yazdirin
        WebElement passwordElementi = driver.findElement(By.id("user_password"));
        passwordElementi.sendKeys("password");
        Thread.sleep(1000);

        //5. Sign in buttonuna tiklayin
        driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
        Thread.sleep(2000);

        //6. Back tusu ile sayfaya donun
        driver.navigate().back();

        //7. Online Banking menusunden Pay Bills sayfasina gidin
        driver.findElement(By.id("online-banking")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("pay_bills_link")).click();
        Thread.sleep(1000);

        //8. amount kismina yatirmak istediginiz herhangi bir miktari yazin
        WebElement amountElement = driver.findElement(By.id("sp_amount"));
        amountElement.sendKeys("90000");
        Thread.sleep(1000);

        //9. tarih kismina “2023-09-10” yazdirin
        driver.findElement(By.id("sp_date")).sendKeys("2023-09-10");
        Thread.sleep(1000);

        //10. Pay buttonuna tiklayin
        driver.findElement(By.id("pay_saved_payees")).click();
        Thread.sleep(1000);

        //11. “The payment was successfully submitted.” mesajinin ciktigini test edin
        WebElement yaziElementi = driver.findElement(By.id("alert_content"));
        String expectedYazi = "The payment was successfully submitted.";
        String actualYazi = yaziElementi.getText();

        if (actualYazi.equals(expectedYazi)){
            System.out.println("başarılı");
        }else System.out.println("Başarısız");

        driver.quit();
    }
}
