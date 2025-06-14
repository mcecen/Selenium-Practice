package tests.D06_jUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase_Each;

public class C03_RadioButtons extends TestBase_Each {

    @Test
    public void test01(){
        //a. Verilen web sayfasına gidin.
        //https://testotomasyonu.com/form
        driver.get("https://testotomasyonu.com/form");

        //b. Cinsiyet Radio button elementlerini locate edin
        WebElement kadinRadio = driver.findElement(By.xpath("//*[@value='option1']"));
        WebElement erkekRadio = driver.findElement(By.xpath("//*[@value='option2']"));
        WebElement digerRadio = driver.findElement(By.xpath("//*[@value='option3']"));

        ReusableMethods.bekle(2);
        //c. Iki farkli test method’u oluşturup yazidan veya direk buton’dan size uygun
        //olani secin
        kadinRadio.click();

        //d. Sectiginiz radio button’un seçili, ötekilerin seçili olmadigini test edin
        Assertions.assertTrue(kadinRadio.isSelected());
        Assertions.assertFalse(erkekRadio.isSelected());
        Assertions.assertFalse(digerRadio.isSelected());
    }
}
