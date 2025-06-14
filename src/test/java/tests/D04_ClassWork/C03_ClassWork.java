package tests.D04_ClassWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_ClassWork {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //1. “https://www.saucedemo.com” Adresine gidin
        driver.get("https://www.saucedemo.com");

        //2. Username kutusuna “standard_user” yazdirin
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(1000);

        //3. Password kutusuna “secret_sauce” yazdirin
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(1000);

        //4. Login tusuna basin
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(3000);

        //5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
        WebElement ilkUrunElementi = driver.findElement(By.xpath("(//div[@class='inventory_item_name '])[1]"));
        ilkUrunElementi.click();
        Thread.sleep(3000);

        //6. Add to Cart butonuna basin
        driver.findElement(By.id("add-to-cart")).click();
        Thread.sleep(3000);

        //7. Alisveris sepetine tiklayin
        driver.findElement(By.className("shopping_cart_link")).click();
        Thread.sleep(1000);

        //8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
        WebElement urunIsmi = driver.findElement(By.className("inventory_item_name"));
        String expectedUurnIsmi = "Sauce Labs Backpack";
        String actualUrunIsmi = urunIsmi.getText();
        if (expectedUurnIsmi.equals(actualUrunIsmi)){
            System.out.println("urun eklenmiş");
        }else System.out.println("sepet boş");

        //9. Sayfayi kapatin
        driver.quit();
    }
}

