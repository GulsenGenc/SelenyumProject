package Homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TekrarTesti01 {
    /*
    1. Yeni bir class olusturun (TekrarTesti)
2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın
(verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru
URL'yi yazdırın.
4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
5. Youtube sayfasina geri donun
6. Sayfayi yenileyin
7. Amazon sayfasina donun
8. Sayfayi tamsayfa yapin
9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa
doğru başlığı(Actual Title) yazdırın.
10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
URL'yi yazdırın
11.Sayfayi kapatin
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //1. Youtube web sayfasına gidin
        driver.get("https://www.youtube.com");
        //2. sayfa başlığının “youtube” olup olmadığını doğrulayın
        //(verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        String actualTitle = driver.getTitle();
        String expectedTittle="youtube";
        if (actualTitle.equals(expectedTittle)){
            System.out.println("tittle testi PASSED");
        } else{
            System.out.println("actual tittle->"+ actualTitle+", tittle testi FAILED");
        }
        //3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru
        //URL'yi yazdırın.
        String actualUrl= driver.getCurrentUrl();
        String expected="youtube";
        if (actualUrl.contains(expected)){
            System.out.println("url testi PASSED");
        }else{
            System.out.println("actual Url->"+ actualUrl+", url testı FAILED");
        }
        //4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");
        //5. Youtube sayfasina geri donun
        driver.navigate().back();
        //6. Sayfayi yenileyin
        driver.navigate().refresh();
        //7. Amazon sayfasina donun
        driver.navigate().forward();
        //8. Sayfayi tamsayfa yapin
        driver.manage().window().fullscreen();
        //9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa
        //doğru başlığı(Actual Title) yazdırın.
        String actualTtle = driver.getTitle();
        String expectedTttle="Amazon";
        if (actualTtle.contains(expectedTttle)){
            System.out.println("tittle testi PASSED");
        } else{
            System.out.println("actual tittle->"+ actualTtle+", tittle testi FAILED");
        }
        //10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        //URL'yi yazdırın
        String actuallUrl= driver.getCurrentUrl();
        String expectedd="https://www.amazon.com/";
        if (actuallUrl.equals(expectedd)){
            System.out.println("url testi PASSED");
        }else{
            System.out.println("actual Url->"+ actuallUrl+", url testı FAILED");
        }
        //11.Sayfayi kapatin
        driver.close();


    }
}
