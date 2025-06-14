package tests.D06_jUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase_All;

public class C01_Assertions extends TestBase_All {



    @Test
    public void test01(){

        //1) https://www.youtube.com adresine gidin
        driver.get("https://www.youtube.com");

        //2) Aşağıdaki adları kullanarak 4 test metodu oluşturun ve gerekli testleri yapin
        //○ titleTest => Sayfa başlığının “YouTube” oldugunu test edin
        String expectedBaslik = "YouTube";
        String actualBaslik = driver.getTitle();

        Assertions.assertEquals(expectedBaslik,actualBaslik, "başlık aynı değil");



    }


        @Test
        public void test02() {
            //○ imageTest => YouTube resminin görüntülendiğini (isDisplayed()) test edin
            WebElement logo = driver.findElement(By.xpath("(//*[@class='style-scope ytd-logo'])[1]"));
            Assertions.assertTrue(logo.isDisplayed());

        }

            @Test
            public void test03(){
            //○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
                ReusableMethods.bekle(2);
                Assertions.assertTrue(driver.findElement(By.name("search_query")).isEnabled());

}

    @Test
    public void test04() {
        //○ wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin
        Assertions.assertNotEquals("youtube", driver.getTitle());
    }

}
