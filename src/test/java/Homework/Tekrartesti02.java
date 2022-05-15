package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Tekrartesti02 {
    public static void main(String[] args) {
        //1-C01_TekrarTesti isimli bir class olusturun,main method açın
        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //2-https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");
        //3-Browseri tam sayfa yapin
        driver.manage().window().fullscreen();
        //4-Sayfayi “refresh” yapin
        driver.navigate().refresh();
        //5-Sayfa basliginin “Spend less” ifadesi icerdigini test edin
     if (driver.getTitle().contains("Spend less")){
         System.out.println("başlık testi PASSED");
     } else{
         System.out.println("başlık testi FAILED");
     }
        //6-Gift Cards sekmesine basin
        driver.findElement(By.xpath("//a[text()='Gift Cards']")).click();

        //7-Birthday butonuna basin
        driver.findElement(By.xpath("//img[@alt='Birthday gift cards']")).click();

        //8-Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("(//img[@alt='Amazon.com eGift Card'])[1]")).click();

        //9-Gift card details’den 25 $’i secin
        driver.findElement(By.xpath("//button[@value='25']"));
        //10-Urun ucretinin 25$ oldugunu test edin
        //11-Sayfayi kapatin
    }
}
