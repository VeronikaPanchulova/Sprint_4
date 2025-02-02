package page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.awt.SystemColor.text;
import static utility.BaseClass.driver;

public class OrderPage {
@FindBy (xpath = "//button[contains(text(), 'да все привыкли')]")
public WebElement buttonCookies;
@FindBy (xpath = "//input[@placeholder='* Имя']")
public WebElement inputName;
@FindBy (xpath = "//input[@placeholder = '* Фамилия']")
public WebElement inputSurname;
@FindBy (xpath = "//input[@placeholder = '* Адрес: куда привезти заказ']")
public WebElement inputAddress;
@FindBy (xpath = "//input[@placeholder = '* Станция метро']")
public WebElement inputMetro;
@FindBy (xpath = "//div[contains(text(), 'Бульвар Рокоссовского')]")
public WebElement subwayStation;
@FindBy (xpath = "//input[@placeholder = '* Телефон: на него позвонит курьер']")
public WebElement inputPhone;
@FindBy (xpath ="//button[contains(text(), 'Далее')]")
public WebElement buttonNext;
@FindBy (xpath = "//input[@placeholder = '* Когда привезти самокат']")
public  WebElement inputDate;
@FindBy (xpath = "//div[@role='button' and @aria-label='Choose четверг, 6-е февраля 2025 г.']")
public WebElement calendarDate;
@FindBy (xpath = "//div[@class='Dropdown-placeholder'='Срок аренды']")
public WebElement rentalPeriod;
@FindBy (xpath = "//div[@class='Dropdown-option' ='двое суток'][2]")
public WebElement numberOfDays;
@FindBy (xpath = "(//button[contains(text(), 'Заказать')])[2]")
public WebElement buttonRegistration;
@FindBy (xpath = "//button[contains(text(), 'Да')]")
//Ошибка после нажатия на кнопку "Да"
public WebElement buttonYes;
@FindBy (xpath = "//button[contains(text(), 'Нет')]")
public WebElement buttonNo;
@FindBy (xpath = "//img[@alt='Scooter']" )
public WebElement imgScooter;
    public OrderPage() {
        PageFactory.initElements(driver, this);
    }
    public void clickCookies() {
        buttonCookies.click();
    }
    public void sendSurname(String text) {
        inputSurname.click();
        inputSurname.sendKeys(text);
    }
    public void sendName (String text) {
        inputName.click();
        inputName.sendKeys(text);
    }
    public void sendAddress (String text) {
        inputAddress.click();
        inputAddress.sendKeys(text);
    }
    public void clickMetro () {
        inputMetro.click();
    }
    public void selectSubwayStation () {
        subwayStation.click();
    }
    public void sendPhone (String text) {
        inputPhone.click();
        inputPhone.sendKeys(text);
    }
    public void clickNext () {
        buttonNext.click();
    }
    public void clickDate() {
        inputDate.click();
    }
    public void selectCalendarDate() {
        calendarDate.click();
    }
    public void clickRentalPeriod() {
        rentalPeriod.click();
    }
    public void selectNumberOfDays() {
        numberOfDays.click();
    }
    public void clickRegistration() {
        buttonRegistration.click();
    }
    public void clickYes() {
        buttonYes.click();
    }
    public void clickNo() {
        buttonNo.click();
    }
    public void clickScooter() {
        imgScooter.click();
    }
}
