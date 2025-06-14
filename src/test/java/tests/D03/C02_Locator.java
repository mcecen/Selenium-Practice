package tests.D03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_Locator {
    public static void main(String[] args) throws InterruptedException {


        //1- Bir test class’i olusturun ilgili ayarlari yapin
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2- https://www.testotomasyonu.com/ adresine gidin
        driver.get("https://www.testotomasyonu.com");

        //3- arama kutusuna phone yazip aratin
        WebElement aramaKutusuElementi = driver.findElement(By.id("global-search"));

        aramaKutusuElementi.sendKeys("phone" + Keys.ENTER);


        //4- Category bolumunde 8 element oldugunu test edin
        List<WebElement> basLikList = driver.findElements(By.className("panel-list"));

        System.out.println(basLikList.size());
        int expectedBaslik = 8;
        int actualBaslik = basLikList.size();

        if (actualBaslik==expectedBaslik){
            System.out.println("başarılı");
        }else System.out.println("Başarısız");


        //5- Category isimlerini yazdirin
        for (WebElement each:basLikList){
            System.out.println(each.getText());
        }
        //6- Sayfayi kapatin

        driver.quit();

    }
}
