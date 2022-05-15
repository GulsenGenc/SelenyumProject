package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TekrarTesti04 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1. “https://www.saucedemo.com” Adresine gidin
        driver.get("https://www.saucedemo.com");

        //2. Username kutusuna “standard_user” yazdirin
        driver.findElement(By.xpath("(//input[@class='input_error form_input'])[1]")).sendKeys("standard_user");

        //3. Password kutusuna “secret_sauce” yazdirin
        driver.findElement(By.xpath("(//input[@class='input_error form_input'])[2]")).sendKeys("secret_sauce");

        //4. Login tusuna basin
        driver.findElement(By.xpath("//input[@value='Login']")).click();

        //5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
        WebElement urunIsmı=driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        String urunIsmi=urunIsmı.getText();
        System.out.println(urunIsmi);
        urunIsmı.click();

        //6. Add to Cart butonuna basin
        driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']")).click();
        //7. Alisveris sepetine tiklayin
        driver.findElement(By.className("shopping_cart_badge")).click();
        //8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
        WebElement sepettekıUrun= driver.findElement(By.className("inventory_item_name"));
        if (sepettekıUrun.getText().equals(urunIsmi)){
            System.out.println("urun sepete eklenmiş");
        } else{
            System.out.println("urun sepete eklenmemiş");
        }
        //9. Sayfayi kapatin
        driver.close();
    }
}
