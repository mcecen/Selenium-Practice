package tests.D04_ClassWork;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_ClassWork {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //1- testotomasyonu.com anasayfasina gidelim
        driver.get("https://www.testotomasyonu.com");

        //2- arama kutusunu locate edelim
        WebElement aramaKutusu = driver.findElement(By.id("global-search"));

        //3- “phone” ile arama yapalim
        aramaKutusu.sendKeys("phone" + Keys.ENTER);
        Thread.sleep(2000);

        //4- Bulunan sonuc sayisini yazdiralim
        WebElement sonucSyisiElementi = driver.findElement(By.className("product-count-text"));
        System.out.println(sonucSyisiElementi.getText());

        //5- Ilk urunu tiklayalim
        driver.findElement(By.xpath("(//a[@class='prod-img'])[1]")).click();
        Thread.sleep(3000);

        //6- Urunun stokta var oldugunu test edin
        WebElement stokElementi = driver.findElement(By.xpath("//*[@class='info  greenclr '] "));
        String expectedStok = "In Stock";
        String actualStok = stokElementi.getText();
        if (actualStok.equals(expectedStok)){
            System.out.println("Ürün stokta");
        }else System.out.println("Ürün stokta değil");

        driver.quit();






    }
}