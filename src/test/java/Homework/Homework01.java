package Homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v99.systeminfo.SystemInfo;

public class Homework01 {
      /*
        1.Yeni bir class olusturalim (Homework)
        2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        yazdirin.
        4.https://www.walmart.com/ sayfasina gidin.
        5.Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        6.Tekrar “facebook” sayfasina donun
        7.Sayfayi yenileyin
        8.Sayfayi tam sayfa (maximize) yapin
        9.Browser’i kapatin
         */
      public static void main(String[] args) {
          System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
          WebDriver driver=new ChromeDriver();
          driver.manage().window().maximize();
          //2.1->facebook adresıne gidelim
          driver.get("https://www.facebook.com");
          //2.2->sayfa başlığının facebook olup olmadıgını test edelım
          String actualTittle=driver.getTitle();
          String expectedTittle="facebook";
          if (actualTittle.equals(expectedTittle)){
              System.out.println("expected tittle actual tittle a eşit,test PASSED");
          } else {
              System.out.println("actual tittle->" +actualTittle+" expected tittle a eşit değil,test FAILED");
          }

          //3->sayfa Urlsınde facebook kelımesının olup olmadıgını test edelım
          String actualUrl= driver.getCurrentUrl();
          String expectedWord="facebook";
          if (actualUrl.contains(expectedWord)){
              System.out.println("actual url istenen kelımeyı içeriyor,test PASSED");
          } else{
              System.out.println("actual Url--> "+actualUrl +"  --> actual url ıstenen kelımeyı içermiyor ,test FAILED");
          }

          //4->https://www.walmart.com/ sayfasina gidin.
          driver.navigate().to("https://www.walmart.com/");

          //5->Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
          String actualTitle=driver.getTitle();
          String istenen="Walmart.com";
          if (actualTitle.contains(istenen)){
              System.out.println("actual tittle istenen kelımeyı içeriyor,test PASSED");
          } else{
              System.out.println("actual title istenen kelımeyı içermiyor ,test FAILED");
          }

          //6->Tekrar “facebook” sayfasina donun
          driver.navigate().back();

          //7->sayfayı yenileyin
          driver.navigate().refresh();

          //8->sayfayı tam sayfa maximize yapın
          driver.manage().window().maximize();

          //9->browser i kapatın
          driver.close();



      }
}
