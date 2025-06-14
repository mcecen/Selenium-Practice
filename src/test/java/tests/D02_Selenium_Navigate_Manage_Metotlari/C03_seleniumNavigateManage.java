package tests.D02_Selenium_Navigate_Manage_Metotlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_seleniumNavigateManage {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();


        //1.Yeni bir class olusturalim (Homework)
        //2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin
        //(title) “facebook” oldugunu test edin, degilse dogru basligi yazdirin.

        driver.get("https://www.facebook.com/");
        String expectedTitle = "facebook";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title testi BAŞARILI");
        }else {
            System.out.println("Title testi BAŞARISIZ");
            System.out.println("Sayfa başlığı: " + driver.getTitle());
        }

        //3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa
        //“actual” URL’i yazdirin.

        String expectedURL = "facebook";
        String actualURL = driver.getCurrentUrl();

        if (actualURL.contains(expectedURL)){
            System.out.println("URL testi BAŞARILI");
        }else {
            System.out.println("URL testi BAŞARISIZ");
            System.out.println("Sayfa URL'i: " + driver.getCurrentUrl());
        }

        //4.https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com/");

        //5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String expectedBaslik = "Walmart.com";
        String actualBaslik = driver.getTitle();

        if (actualBaslik.contains(expectedBaslik)){
            System.out.println("Başlık testi BAŞARILI");
        }else System.out.println("Başlık testi BAŞARISIZ");

        //6. Tekrar “facebook” sayfasina donun
        driver.navigate().back();

        //7. Sayfayi yenileyin
        driver.navigate().refresh();

        //8. Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();

        //9.Browser’i kapatin
        driver.close();
    }
}
