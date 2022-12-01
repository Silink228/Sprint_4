package CreateScooterOrderTest;

import Pages.HomePage;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;


public class HomePageTest {
   private WebDriver driver;


    @Test
 public void homePageTest(){
  //  driver =new ChromeDriver() ; ////Тестировал на Safari , в конце проверил на Chrome
        //import удалился когда закоментировал
 driver = new SafariDriver();
  driver.get("https://qa-scooter.praktikum-services.ru/");
 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

  HomePage objHomePage = new HomePage(driver);
  objHomePage.clickCookieButton();
  objHomePage.testAccordionFull();
    }
 @After
 public void tearDown() {
   driver.quit();
  }
}
