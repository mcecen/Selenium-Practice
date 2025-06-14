package tests.D06_jUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase_All;

public class C02_CheckBox extends TestBase_All {
    //Gerekli yapiyi olusturun ve aşağıdaki görevi tamamlayın.
    //a. Verilen web sayfasına gidin.
    //https://the-internet.herokuapp.com/checkboxes
    //b. Checkbox1 ve checkbox2 elementlerini locate edin.
    //c. Checkbox1 seçili değilse onay kutusunu tıklayın
    //d. Checkbox2 seçili değilse onay kutusunu tıklayın
    //e. Checkbox1ve Checkbox2’nin seçili olduğunu test edin

    @Test
    public void test01(){

        //a. Verilen web sayfasına gidin.
        //https://the-internet.herokuapp.com/checkboxes
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        //b. Checkbox1 ve checkbox2 elementlerini locate edin.
        WebElement checkBox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement checkBox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));

        ReusableMethods.bekle(3);
        //c. Checkbox1 seçili değilse onay kutusunu tıklayın
        if (!checkBox1.isSelected()){
            checkBox1.click();
        }
        Assertions.assertTrue(checkBox1.isSelected());

        ReusableMethods.bekle(3);
        //d. Checkbox2 seçili değilse onay kutusunu tıklayın
        if (!checkBox2.isSelected()){
            checkBox2.click();
        }
        Assertions.assertTrue(checkBox2.isSelected());

        ReusableMethods.bekle(3);
        //e. Checkbox1ve Checkbox2’nin seçili olduğunu test edin
        Assertions.assertTrue(checkBox1.isSelected() && checkBox2.isSelected());





    }
}























