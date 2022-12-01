package CreateScooterOrderTest;

import Pages.HomePage;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

@RunWith(Parameterized.class)
public  class OrderPageTest {
  private WebDriver driver;
    private String name;
    private String surNam;

    public OrderPageTest(String name, String surName) {
        this.name=name;
       this.surNam=surNam;
    }


    @Parameterized.Parameters
   public static Object[][] getDataForOrder () {
      return new Object[][]{
              {"maks","Smirnov"},
              {"YYY","DDD"},
        };
    }


        @Test
    public void Test() {
           // driver =new ChromeDriver() ; //Тестировал на Safari , в конце проверил на Chrome

            driver = new SafariDriver();
            driver.get("https://qa-scooter.praktikum-services.ru/");
           driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            HomePage objHomePage = new HomePage(driver);
            objHomePage.clickCookieButton();


           Pages.OrderPage objOrderPage = new Pages.OrderPage(driver);
           objOrderPage.fillForm();
            objOrderPage.rentFill();


        }
    @After
    public void tearDown() {
        driver.quit();
    }
}