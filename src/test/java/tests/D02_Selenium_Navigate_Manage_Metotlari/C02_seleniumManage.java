package tests.D02_Selenium_Navigate_Manage_Metotlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_seleniumManage {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        //1. https://www.testotomasyonu.com/ sayfasina gidin
        driver.get("https://www.testotomasyonu.com/");

        //2. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println(driver.manage().window().getPosition()); //sayfanın konumu
        System.out.println(driver.manage().window().getSize()); //sayfanın boyutları

        //3. Sayfayi simge durumuna getirin
        driver.manage().window().minimize();

        //4. Simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();

        //5. Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("-------------------------------");
        System.out.println("Maximize konum:" + driver.manage().window().getPosition());
        System.out.println("Maximize boyut:" + driver.manage().window().getSize());

        //6. Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();

        //7. Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("-------------------------------");
        System.out.println("Fullscreen konum:" + driver.manage().window().getPosition());
        System.out.println("Fullscreen boyut:" + driver.manage().window().getSize());

        //8. Sayfanin konumunu pixel olarak (50,50)’ye getirin
        System.out.println("-------------------------------");
        driver.manage().window().setPosition(new Point(50,50));
        System.out.println("Yeni sayfa konumu: "+ driver.manage().window().getPosition());

        //9. Sayfa boyutunu pixel olarak (1000,500)’ye ayarlayin
        System.out.println("-------------------------------");
        driver.manage().window().setSize(new Dimension(1000,500));
        System.out.println("Yeni sayfa boyutu: "+ driver.manage().window().getSize());

        //10. Sayfayi kapatin
        driver.close();
    }
}