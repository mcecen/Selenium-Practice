package tests.D05_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class C02 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //1- bir class olusturun
        //2- https://www.testotomasyonu.com/ adresine gidin
        driver.get("https://www.testotomasyonu.com/");

        //3- Browseri tam sayfa yapin
        driver.manage().window().maximize();

        //4- Sayfayi “refresh” yapin
        driver.navigate().refresh();

        //5- Sayfa basliginin “Test Otomasyonu” ifadesi icerdigini test edin
        String expectedBaslik = "Test Otomasyonu";
        String actualBaslik = driver.getTitle();

        if (actualBaslik.contains(expectedBaslik)){
            System.out.println("başarılı");
        }else System.out.println("başarısız");

        //6- Furniture linkine tiklayin
        driver.findElement(By.xpath("(//a[text()='Furniture'])[3]")).click();

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();


        //7- price range filtresinde min degere 40, max degere 200 yazip filtreleyin
        Thread.sleep(2000);
        WebElement minElement = driver.findElement(By.xpath("//*[@name='min']"));
        minElement.clear();
        minElement.sendKeys("40");

        WebElement maxElement = driver.findElement(By.xpath("//*[@name='max']"));
        maxElement.clear();
        maxElement.sendKeys("200");


        driver.findElement(By.className("price-range-button")).click();
        Thread.sleep(2000);

        //8- filtreleme sonucunda urun bulunabildigini test edin
        WebElement urunElementi = driver.findElement(By.className("product-count-text"));
        String unExpected = "0 Products Found";
        String actual = urunElementi.getText();
        if (!(actual.equals(unExpected))){
            System.out.println("Başarılı");
        }else System.out.println("Başarısız");

        //9-Ilk urunu tiklayin
        driver.findElement(By.xpath("(//*[@class='prod-img'])[1]")).click();

        //10- Urun fiyatinin 40 ile 200 arasinda oldugunu test edin
        WebElement urunFiyatElementi = driver.findElement(By.id("priceproduct"));
        String urunFiyati = urunFiyatElementi.getText();
        urunFiyati = urunFiyati.replace("$", "");
        double urunFiyatiSayi = Double.parseDouble(urunFiyati);

        if (urunFiyatiSayi > 40 && urunFiyatiSayi < 200){
            System.out.println("Başarılı");
        }else System.out.println("Başarısız");

        //11-Sayfayi kapatin
        driver.quit();
    }
}
