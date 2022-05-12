package Pratıkler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Pratik01 {
    /*
   Main method oluşturun ve aşağıdaki görevi tamamlayın.
   a. http://a.testaddressbook.com adresine gidiniz.
   b. Sign in butonuna basin
   c. email textbox,password textbox, and signin button elementlerini locate ediniz..
   d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
       i. Username : testtechproed@gmail.com
       ii. Password : Test1234!
   e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
   f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
   3. Sayfada kac tane link oldugunu bulun.
    */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");

        // b. Sign in butonuna basin
        WebElement signInLınkı=driver.findElement(By.linkText("Sign in"));
        signInLınkı.click();

        //   c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement emailTextBox= driver.findElement(By.id("session_email"));
        WebElement passwordTextBox=driver.findElement(By.name("session[password]"));
        WebElement signInButton=driver.findElement(By.name("commit"));


        //   d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //       i. Username : testtechproed@gmail.com
        //       ii. Password : Test1234!
        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        signInButton.click();

        //   e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement actualUserId=driver.findElement(By.className("navbar-text"));
        System.out.println("actual kullanıcı adı->"+actualUserId.getText());
        String expectedUserId="testtechproed@gmail.com";
        if (actualUserId.getText().equals(expectedUserId)){
            System.out.println("userId testı PASSED");
        } else{
            System.out.println("userId testi FAILED");
        }
        //   f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement adresses=driver.findElement(By.linkText("Addresses"));
        WebElement signOut=driver.findElement(By.linkText("Sign out"));
        if (adresses.isDisplayed()){
            System.out.println("adresses testi PASSED");
        } else{
            System.out.println("adresses testi FAILED");
        }

        if (signOut.isDisplayed()){
            System.out.println("signout testi PASSED");
        } else{
            System.out.println("signout testi FAILED");
        }
        //   3. Sayfada kac tane link oldugunu bulun.
        List<WebElement> linklerinListesi=driver.findElements(By.tagName("a"));
        System.out.println("sayfadakı lınk sayısı->"+linklerinListesi.size());

        //linkleri yazdıralım(linkler lıstesının her bır elemanı bır webelemant old.için dırek yazamayız.referans yazar.
        //for each loop ıle yazdırırız.
        for (WebElement w:linklerinListesi
             ) {
            System.out.print(w.getText()+" ");
        }
        driver.close();
    }
}