package tests.D03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_Locator {
    public static void main(String[] args) {

        //1- Bir test class’i olusturun ilgili ayarlari yapin
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/");

        //3- Category bolumundeki elementleri locate edin
        List<WebElement> baslikList = driver.findElements(By.xpath("//div[@class='panel panel-default']"));

        //4- Category bolumunde 3 element oldugunu test edin
        int expectedElement = 3;
        int actualElement = baslikList.size();

        if(actualElement==expectedElement){
            System.out.println("Başarılı");
        }else System.out.println("başarısız");

        //5- Category isimlerini yazdirin
        for (WebElement each:baslikList){
            System.out.println(each.getText());
        }
        //6- Sayfayi kapatin
        driver.quit();



    }
}
