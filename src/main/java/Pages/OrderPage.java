package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public  class OrderPage {
   // private String name;
  //  private String surNam;
    private WebDriver driver;//*[@id="root"]/div/div[2]/div[3]/button
    private final By buttonOrder = By.className("Button_Button__ra12g");
    private final By buttonOrderD = By.className("Button_Middle__1CSJM");
    private final By nameField = By.xpath(".//div/div[2]/div[2]/div[1]/input");
    private final By surName = By.xpath(".//div/div[2]/div[2]/div[2]/input");
    private final By addressField = By.xpath(".//div/div[2]/div[2]/div[3]/input");

    //Поле Станции метро
    private final By metroStationField = By.xpath(".//input[@placeholder='* Станция метро']");


    private final By phoneField = By.xpath(".//div/div[2]/div[2]/div[5]/input");
    private final By buttonNext =  By.xpath("//div/div[2]/div[3]/button");
    private final By dateField = By.xpath(".//div/div[2]/div[2]/div[1]/div/div/input");

    //Поле Срок аренды
    private final By periodField = By.xpath("//div/div[2]/div[2]/div[2]/div");


    private final By isBlackCheckbox = By.xpath(".//input[@id='black']");
    private final By isGreyCheckbox = By.xpath("//input[@id='grey']");
    private final By commentField = By.xpath(".//input[@placeholder='Комментарий для курьера']");
  private final By buttonOrd = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[text()='Заказать']");


  public void fillForm(){
      clickOrderButton();
      fillName();
      fillSurName();
      fillAddress();
      fillStationMetro();
      fillPhone();
      clickButtonNext();

  }

  public void rentFill(){
      dataFill();
      periodFill();
     clickBox();
      commentFill();
     Order();
      willIssue();
      getOrderCompletedConfirmation();
  }
    public OrderPage(WebDriver driver) {
        this.driver = driver;
      //  this.name=name;
      //  this.surNam= surNam;
    }
    public void clickOrderButton(){
        driver.findElement(buttonOrder).click();
    }
    public void clickOrderButtonDown(){
        driver.findElement(buttonOrderD).click();
        WebElement element = driver.findElement(By.xpath("//div/div/div[4]/div[2]/div[5]/button"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);

    }

    public void fillName(){
        driver.findElement(nameField).sendKeys("Максим");
    }
    public void fillSurName(){
        driver.findElement(surName).sendKeys("Фамилия");

    }
    public void fillAddress(){
        driver.findElement(addressField).sendKeys(" Москва");

    }
    //Выбор станции метро
    public void fillStationMetro() {


        driver.findElement(metroStationField).click();
        WebElement elementStationMetro = driver.findElement(metroStationField);
        elementStationMetro.sendKeys("Котельники");
        driver.findElement(By.xpath("//div/div[2]/div[2]/div[4]/div/div[2]")).click();


    }
    public void fillPhone(){
        driver.findElement(phoneField).sendKeys("89765432133");
    }
    public void clickButtonNext(){
        driver.findElement(buttonNext).click();
    }
    public void time() {
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div/div[2]/div[2]/div[4]/input"));
}
    public void dataFill(){
        driver.findElement(dateField).click();
        driver.findElement(By.xpath("//div/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div[4]")).click();
    }
    public void periodFill(){
        driver.findElement(periodField).click();
        driver.findElement(By.xpath("//div/div[2]/div[2]/div[2]/div[2]/div[1]")).click();

    }
    public void clickBox(){
        driver.findElement(isBlackCheckbox).click();
    }
    public void commentFill(){
        driver.findElement(commentField).sendKeys("Тра та та ");
    }
    public void  Order(){
        driver.findElement(buttonOrd).click();
    }
    public void willIssue(){
        driver.findElement(By.xpath("//div/div[2]/div[5]/div[2]/button[2]")).click();
    }
    public void getOrderCompletedConfirmation() {
        String elementText = driver.findElement(By.xpath(".//div[contains(text(),'Заказ оформлен')]")).getText();
        System.out.println(elementText);
        if (elementText.contains("Заказ оформлен")) {
            System.out.println("Right!");
        }
        else System.out.println("Wrong!");
    }
}


