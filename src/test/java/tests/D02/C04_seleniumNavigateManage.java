package tests.D02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class C04_seleniumNavigateManage {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        //1. Yeni bir class olusturun (TekrarTesti)
        //2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını
        //doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https://www.youtube.com/");

        String expectedTitle = "youtube";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) System.out.println("Title testi BAŞARILI");
        else{
            System.out.println("Title testi BAŞARISIZ");
            System.out.println("Doğru title değeri:" +driver.getTitle());
            System.out.println("---------------------------");
        }

        //3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa
        //doğru URL'yi yazdırın.
        String expectedURL = "youtube";
        String actualURL = driver.getCurrentUrl();

        if (actualURL.contains(expectedURL)) System.out.println("URL testi BAŞARILI");
        else{
            System.out.println("URL testi BAŞARISIZ");
            System.out.println("Doğru URL değeri:" + driver.getCurrentUrl());
        }
        System.out.println("---------------------------");

        //4. Daha sonra testotomasyonu sayfasina gidin https://www.testotomasyonu.com/
        driver.get("https://www.testotomasyonu.com/");

        //5. Youtube sayfasina geri donun
        driver.navigate().back();

        //6. Sayfayi yenileyin
        driver.navigate().refresh();

        //7. Testotomasyonu sayfasina donun
        driver.navigate().forward();

        //8. Sayfayi tamsayfa yapin
        driver.manage().window().maximize();

        //9. Ardından sayfa başlığının "Test" içerip içermediğini (contains) test edin, Yoksa
        //doğru başlığı(Actual Title) yazdırın.

        String expectedBaslik = "Test";
        String actualBaslik = driver.getTitle();

        if (actualBaslik.contains(expectedBaslik)) System.out.println("Başlık Testi BAŞARILI");
        else {
            System.out.println("Başlık Testi BAŞARISIZ");
            System.out.println("Doğru başlık değeri: "+ driver.getTitle());
        }

        //10.Sayfa URL'sinin https://www.testotomasyonu.com/ olup olmadığını test edin,
        //degilse doğru URL'yi yazdırın

        Thread.sleep(4000);
        String expectedTestURL = "https://www.testotomasyonu.com/";
        String actualTestURL = driver.getCurrentUrl();
        System.out.println("---------------------------");
        if (actualTestURL.equals(expectedTestURL))System.out.println("Test URL testi BAŞARILI");
        else{
            System.out.println("Test URL testi BAŞARISIZ");
            System.out.println("Doğru Test URL değeri:" + driver.getCurrentUrl());
        }

        //11.Sayfayi kapatin
        driver.close();
    }
}