package tests.D02_Selenium_Navigate_Metotlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumNavigate {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

//1. Youtube ana sayfasina gidin . https://www.youtube.com/
        driver.get("https://www.youtube.com/");

//2. url’in “youtube” icerdigini test edin.
        String expectedURLİcerik = "youtube";
        String actualURLİcerik = driver.getCurrentUrl();

        if (actualURLİcerik.contains(expectedURLİcerik)){
            System.out.println("URL içerik testi BAŞARILI");
        }
        else System.out.println("URL içerik testi BAŞARISIZ");

//3. Testotomasyonu sayfasina gidin. https://www.testotomasyonu.com/
        driver.get("https://www.testotomasyonu.com/");

//4. Title’in “Test Otomasyonu” icerdigini test edin.

        String expectedTitleİcerik = "Test Otomasyonu";
        String actualTitleİcerik = driver.getTitle();

        if (actualTitleİcerik.contains(expectedTitleİcerik)){
            System.out.println("Title içerik testi BAŞARILI");
        }else System.out.println("Title içerik testi BAŞARISIZ");

//5. Tekrar YouTube’sayfasina donun.
    driver.navigate().back();

//6. Title’in “YouTube” oldugunu test edin
        String expectedBaslikİcerik = "YouTube";
        String actualBaslikİcerik = driver.getTitle();

        if (actualBaslikİcerik.equals(expectedBaslikİcerik)){
            System.out.println("Başlık içerik testi BAŞARILI");
        }
        else System.out.println("Başlık içerik testi BAŞARISIZ");

//7. Sayfayi Refresh(yenile) yapin.
driver.navigate().refresh();

//8. Sayfayi kapatalim / Tum sayfalari kapattin.
driver.close();
    }
}
