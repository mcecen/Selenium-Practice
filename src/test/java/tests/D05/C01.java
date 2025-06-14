package tests.D05_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01 {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    //1- https://www.testotomasyonu.com/ sayfasına gidin.
        driver.get("https://www.testotomasyonu.com/");

    //2- Arama kutusuna “dress” yazip aratin
        WebElement aramaKutusu = driver.findElement(By.id("global-search"));
        aramaKutusu.sendKeys("dress" + Keys.ENTER);

    //3- Görüntülenen sonuçların sayısını yazdırın
        WebElement sonucElementi = driver.findElement(By.className("product-count-text"));
        System.out.println(sonucElementi.getText());

        //4- Listeden ilk urunun resmine tıklayın.
        driver.findElement(By.xpath("(//a[@class='prod-img'])[1]")).click();

    //5- Urun detayinda dress kelimesi geçtiğini test edin.
        WebElement dressYazisi = driver.findElement(By.xpath("//div[text()='Women Black Fancy Dress']"));
        String expectedDress = "dress";
        String actualDress = dressYazisi.getText().toLowerCase();

        if (actualDress.contains(expectedDress)){
            System.out.println("Test başarılı");
        }else System.out.println("Başarısız");

        driver.quit();
}
    }