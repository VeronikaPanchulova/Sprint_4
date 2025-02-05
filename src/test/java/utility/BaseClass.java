package utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import page_object.MainPage;
import page_object.OrderPage;


public class BaseClass {

    MainPage mainPage = new MainPage();
    OrderPage orderPage = new OrderPage();

    static {
        System.setProperty("webdriver.chrome.driver", "C:/Users/vpanc/Desktop/chrome/chromedriver.exe");
    }

    public static WebDriver driver = new ChromeDriver();

    @Test
    public void orderFirstButton()  {
        driver.get(TestData.url);
        mainPage.clickOrder1();
        orderPage.clickCookies();
        orderPage.sendName(TestData.user1Name);
        orderPage.sendSurname(TestData.user1Surname);
        orderPage.sendAddress(TestData.user1Address);
        orderPage.clickMetro();
        orderPage.selectSubwayStation();
        orderPage.sendPhone(TestData.user1Phone);
        orderPage.clickNext();
        orderPage.clickDate();
        orderPage.selectCalendarDate();
        orderPage.clickRentalPeriod();
        orderPage.selectNumberOfDays();
        orderPage.clickRegistration();
        orderPage.clickYes();
        new WebDriverWait(driver, 5);
        orderPage.clickNo();
        driver.quit();
    }

    @Test
    public void orderSecondButton()  {
        driver.get(TestData.url);
        mainPage.clickOrder2();
        orderPage.clickCookies();
        orderPage.sendName(TestData.user2Name);
        orderPage.sendSurname(TestData.user2Surname);
        orderPage.sendAddress(TestData.user2Address);
        orderPage.clickMetro();
        orderPage.selectSubwayStation();
        orderPage.sendPhone(TestData.user2Phone);
        orderPage.clickNext();
        orderPage.clickDate();
        orderPage.selectCalendarDate();
        orderPage.clickRentalPeriod();
        orderPage.selectNumberOfDays();
        orderPage.clickRegistration();
        orderPage.clickYes();
        new WebDriverWait(driver, 5);
        orderPage.clickNo();
        driver.quit();
    }

    @Test
    public void importantQuestions()  {
        driver.get(TestData.url);
        Assert.assertEquals(mainPage.questionsGetText(), "Вопросы о важном");
        mainPage.clickQuestion1();
        new WebDriverWait(driver, 5);
        Assert.assertEquals("Сутки — 400 рублей. Оплата курьеру — наличными или картой.", mainPage.costGetText());
        driver.quit();
    }
    //Дополнительный тест
    @Test
    public void importantScooter()  {
        driver.get(TestData.url);
        mainPage.clickScooter();
        driver.quit();
    }
}
