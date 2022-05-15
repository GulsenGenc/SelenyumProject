package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.time.Duration;

public class TekrarTesti03 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1-C01_TekrarTesti isimli bir class olusturun
        //2-https://www.google.com/ adresine gidin
        driver.get("https://www.google.com/");

        //3-Sayfa basliginin “Google” ifadesi icerdigini test edin
        if (driver.getTitle().contains("Google")){
            System.out.println("sayfa başlığı testi passed");
        } else{
            System.out.println("sayfa başlığı testi failed");
        }
        // 4-Arama cubuguna “Nutella” yazip aratin
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Nutella"+ Keys.ENTER);

        //5-Bulunan sonuc sayisini yazdirin
        WebElement sonucYazısı=driver.findElement(By.xpath("//div[text()='Yaklaşık 77.800.000 sonuç bulundu']"));
        System.out.println(sonucYazısı.getText());
        //6-sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
        String sonucSayısı[]=(sonucYazısı.getText().replaceAll("\\.","")).split(" ");

        if (Integer.parseInt(sonucSayısı[1])>10000000){
            System.out.println("10 milyondan fazla sonuc bulundu");
        } else{
            System.out.println("10 mılyondan az sonuc bulundu");
        }
        //7-Sayfayi kapatin
        driver.close();

    }
}
