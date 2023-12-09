import com.epam.healenium.SelfHealingDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Repo extends BasePage {
    WebDriverWait WaitForVisibility = new WebDriverWait(driver, Duration.ofSeconds(80));

    @FindBy(xpath = "//input[@value='7']")
    WebElement e7;

    @FindBy(xpath = "//input[@value='3']")
    WebElement e3;

    @FindBy(xpath = "//input[@value='+']")
    WebElement plus;

    @FindBy(xpath = "//input[@value='=']")
    WebElement equal;

    @FindBy(xpath = "//input[@id='inp']")
    WebElement value;

    @FindBy(id = "FName")
    WebElement firstname;

    @FindBy(id = "LName")
    WebElement lastname;

    @FindBy(xpath = "//span[text ()='click the submit button']")
    WebElement text;

    @FindBy(xpath = "//span[text ()='submit']")
    WebElement submit;

    @FindBy(css = ".black")
    WebElement text1;

    @FindBy(css = ".blue")
    WebElement text2;

    @FindBy(xpath = "//div[@id='one']")
    WebElement text3;

    @FindBy(xpath = "//span[text ()='Click']")
    WebElement text4;

    @FindBy(xpath = "//span[@class='blue']")
    WebElement text5;

    @FindBy(linkText = "googleLink")
    WebElement link1;

    public void Link() {
        WaitForVisibility.until(ExpectedConditions.visibilityOf(link1));
        link1.click();
    }

    public void className() {
        WaitForVisibility.until(ExpectedConditions.visibilityOf(text5));
        System.out.println(text5.getText());
    }

    public void TextContains() {
        WaitForVisibility.until(ExpectedConditions.visibilityOf(text4));
        if (text4.isDisplayed()) {
            System.out.println("text contains xpath is displayed");
        } else {
            System.out.println("text contains xpath is not displayed");
        }
    }

    public void tag1() {
        WaitForVisibility.until(ExpectedConditions.visibilityOf(text3));
        if (text3.isDisplayed()) {
            System.out.println("tag Name is displayed");
        } else {
            System.out.println("tag Name is not displayed");
        }
    }

    public void class1() {
        WaitForVisibility.until(ExpectedConditions.visibilityOf(text1));
        if (text1.isDisplayed()) {
            System.out.println("class black text is displayed");
        } else {
            System.out.println("class black text is not displayed");
        }
    }

    public void class2() {
        if (text2.isDisplayed()) {
            System.out.println("class blue text is displayed");
        } else {
            System.out.println("class blue text is not displayed");
        }
    }

    public void num7() {
        WaitForVisibility.until(ExpectedConditions.visibilityOf(e7));
        e7.click();
    }

    public void plusButton() {
        WaitForVisibility.until(ExpectedConditions.visibilityOf(plus));
        plus.click();
    }

    public void num3() {
        WaitForVisibility.until(ExpectedConditions.visibilityOf(e3));
        e3.click();
    }

    public void equalButton() {
        WaitForVisibility.until(ExpectedConditions.visibilityOf(equal));
        equal.click();
    }

    public void validate() throws InterruptedException {
        WaitForVisibility.until(ExpectedConditions.visibilityOf(value));
        Thread.sleep(3000);
        String ans = value.getText();
        System.out.println(ans);
    }

    public void firstName() {
        WaitForVisibility.until(ExpectedConditions.visibilityOf(firstname));
        firstname.clear();
        firstname.sendKeys("welcome user");
        System.out.println("First name is entered");
    }

    public void lastName() {
        WaitForVisibility.until(ExpectedConditions.visibilityOf(lastname));
        lastname.clear();
        lastname.sendKeys("hello user");
        System.out.println("last name is entered");
    }


    public Repo(SelfHealingDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


}
