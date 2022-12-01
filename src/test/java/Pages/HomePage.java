package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class HomePage {
    private WebDriver driver;

    //Локаторы для выпадающего списка
    private final By cookieButton = By.className("App_CookieButton__3cvqF");
    private WebElement webElement;
    private final By orderButtonUp = By.className("Button_Button__ra12g");
    public By scrollQuestions = By.id("accordion__heading-0"); //Локатор блока FAQ
    public By scrollQuestions1 = By.id("accordion__heading-1");
    public By scrollQuestions2 = By.id("accordion__heading-2");
    public By scrollQuestions3 = By.id("accordion__heading-3");
    public By scrollQuestions4 = By.id("accordion__heading-4");
    public By scrollQuestions5 = By.id("accordion__heading-5");
    public By scrollQuestions6 = By.id("accordion__heading-6");

    public By scrollQuestions7 = By.id("accordion__heading-7");

    public HomePage(WebDriver driver) {
        this.driver = driver;

    }
    public void testAccordionFull(){
        waitForLoad();
        testAccordion0();
        testAccordion1();
        testAccordion2();
        testAccordion3();
        testAccordion4();
        testAccordion5();
        testAccordion6();
        testAccordion7();
    }
    public void waitForLoad() {
  new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.id("accordion__heading-0")));
}
    //Тесты выпадающего списка
    public void testAccordion0(){
        WebElement textOne = driver.findElement(scrollQuestions);
         ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", textOne);
        textOne.click();
        assertEquals("Сутки — 400 рублей. Оплата курьеру — наличными или картой.", driver.findElement(By.id("accordion__panel-0")).getText());
    }
    public void testAccordion1(){
        WebElement textOne = driver.findElement(scrollQuestions1);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", textOne);
        textOne.click();
        assertEquals("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.", driver.findElement(By.id("accordion__panel-1")).getText());
    }
    public void testAccordion2(){
        WebElement textOne = driver.findElement(scrollQuestions2);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", textOne);
        textOne.click();
        assertEquals("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.", driver.findElement(By.id("accordion__panel-2")).getText());
    }
    public void testAccordion3(){
        WebElement textOne = driver.findElement(scrollQuestions3);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", textOne);
        textOne.click();
        assertEquals("Только начиная с завтрашнего дня. Но скоро станем расторопнее.", driver.findElement(By.id("accordion__panel-3")).getText());
    }
    public void testAccordion4(){
        WebElement textOne = driver.findElement(scrollQuestions4);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", textOne);
        textOne.click();
        assertEquals("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.", driver.findElement(By.id("accordion__panel-4")).getText());
    }
    public void testAccordion5(){
        WebElement textOne = driver.findElement(scrollQuestions5);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", textOne);
        textOne.click();
        assertEquals("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.", driver.findElement(By.id("accordion__panel-5")).getText());
    }
    public void testAccordion6(){
        WebElement textOne = driver.findElement(scrollQuestions6);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", textOne);
        textOne.click();
        assertEquals("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.", driver.findElement(By.id("accordion__panel-6")).getText());
    }
    public void testAccordion7(){
        WebElement textOne = driver.findElement(scrollQuestions7);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", textOne);
        textOne.click();
        assertEquals("Да, обязательно. Всем самокатов! И Москве, и Московской области.", driver.findElement(By.id("accordion__panel-7")).getText());
    }

 // Принять куки
    public void clickCookieButton() {
        driver.findElement(cookieButton).click();
    }
//Кнопка Заказать
    public void clickOrderButtonUp() {
        driver.findElement(orderButtonUp).click();
    }
}



// public void waitForLoad() {
//   new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath(".//div[@id='accordion__panel-0']")));
//}






//public void waitForLoad() {
//  new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(answerText0));
   //}
