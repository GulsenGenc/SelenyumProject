package Homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Tekrartesti02 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1-C01_TekrarTesti isimli bir class olusturun
        //2-https://www.amazon.com/ adresine gidin
        //3-Browseri tam sayfa yapin
        //4-Sayfayi “refresh” yapin
        //5-Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        //6-Gift Cards sekmesine basin
        //7-Birthday butonuna basin
        //8-Best Seller bolumunden ilk urunu tiklayin
        //9-Gift card details’den 25 $’i secin
        //10-Urun ucretinin 25$ oldugunu test edin
        //11-Sayfayi kapatin
    }
}
