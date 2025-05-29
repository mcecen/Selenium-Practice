package tests.D01_SeleniumGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_webDriverMetotlari {

    public static void main(String[] args) {
        /*
1. testotomasyonu sayfasina gidelim. https://www.testotomasyonu.com/
2. Sayfa basligini(title) yazdirin
3. Sayfa basliginin “Test Otomasyonu” icerdigini test edin
4. Sayfa adresini(url) yazdirin
5. Sayfa url’inin https://testotomasyonu.com/ oldugunu test edin.
6. Sayfa handle degerini yazdirin
7. Sayfa HTML kodlarinda “otomasyon” kelimesi gectigini test edin
8. Sayfayi kapatin.

         */
        WebDriver driver = new ChromeDriver();

        //1. testotomasyonu sayfasina gidelim. https://www.testotomasyonu.com/
        driver.get("https://www.testotomasyonu.com/");

        //2. Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());

        //3. Sayfa basliginin “Test Otomasyonu” icerdigini test edin
        String expectedTitle = "Test Otomasyonu";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Başlık Test Başarılı");
        }else {
            System.out.println("Başlık Test Başarısız");
        }

        //4. Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());

        //5. Sayfa url’inin https://testotomasyonu.com/ oldugunu test edin.
        String expectedURL = "https://testotomasyonu.com/";
        String actualURL = driver.getCurrentUrl();

        if (actualURL.equals(expectedURL)){
            System.out.println("URL Test Başarılı");
        }else {
            System.out.println("URL Test Başarısız");
        }

        //6. Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());

        //7. Sayfa HTML kodlarinda “otomasyon” kelimesi gectigini test edin.
        String expectedHTMLKod = "otomasyon";
        String actualHTMLKod = driver.getPageSource();

        if (actualHTMLKod.contains(expectedHTMLKod)){
            System.out.println("HTML Test Başarılı");
        }else {
            System.out.println("HTML Test Başarısız");
        }

        //8. Sayfayi kapatin.

        driver.close();




    }
}
