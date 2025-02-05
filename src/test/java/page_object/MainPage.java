package page_object;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static utility.BaseClass.driver;

public class MainPage {
    //Верхняя Кнопка "Закфзать"
    @FindBy(xpath = "(//button[text()='Заказать'])[1]")
    public WebElement order1;
    //Нижняя кнопка "Заказать2"
    @FindBy(xpath = "(//button[text()='Заказать'])[2]")
    public WebElement order2;
    //Картинка в верхнем левом углу "Яндекс Самокат"
    @FindBy(xpath = "//img[@alt='Scooter']" )
    public WebElement imgScooter;
    //Раздел Вопросы о важном
    @FindBy(xpath = "//div[text()='Вопросы о важном']")
    public WebElement questions;
    //Форма куки
    @FindBy(xpath = "//div[text()='И здесь куки! В общем, мы их используем.']")
    public WebElement cookies;
    @FindBy(xpath = "//div[@data-accordion-component='AccordionItemHeading']/div")
    //Первый вопрос в разделе Вопросы о важном "Сколько это стоит? И как оплатить?"
    public WebElement question1;
    //Ответ на первый вопрос с текстом "Сутки — 400 рублей. Оплата курьеру — наличными или картой."
    @FindBy(xpath = "//div[@data-accordion-component='AccordionItemPanel']")
    public WebElement cost;


    public MainPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOrder1() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", order1);

    }
    public void clickOrder2() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", order2);

    }
    public void clickScooter() {
        imgScooter.click();
    }

    public void clickCookies() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", cookies);
    }

    public String questionsGetText() {
        return questions.getText();
    }

    public void clickQuestion1() {
        ((JavascriptExecutor) driver)
                .executeScript("window.scrollTo(0, document.body.scrollHeight)");
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", question1);
        question1.click();
    }

    public String costGetText() {
       return cost.getText();
    }
}
