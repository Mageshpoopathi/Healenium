import com.epam.healenium.SelfHealingDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class login extends BasePage{
    WebDriverWait WaitForVisibility = new WebDriverWait(driver, Duration.ofSeconds(80));



//    @FindBy(xpath = "//input[@id='user-name']")
//    WebElement name1;
//
//    @FindBy(xpath="//input[@id='password']")
//    WebElement name2;
//
//    @FindBy(xpath="//input[@value='LOGIN']")
//    WebElement name3;
//
//    @FindBy(xpath="(//input)[1]")
//    WebElement username;
//
//    @FindBy(xpath = "//input[@placeholder='Password']")
//    WebElement password;
//
//
//    @FindBy(xpath = "//div[@fdprocessedid='kmoyra']")
//    WebElement password1;
//
//    //"//input[@fdprocessedid='kmoyra']"
//
//    @FindBy(xpath = "(//div[@id='input-group-prepend']/following-sibling::input)[2]")
//    WebElement password2;
//
//  // (//div[@class='input-group-prepend']/following-sibling::input)[2]
//
//    @FindBy(css = "input[type='password']")
//    WebElement password3;
//
//    @FindBy(css = "input[type='passwor']")
//    WebElement password4;
//
//    @FindBy(xpath="//span[text ()='Submit']")
//    WebElement submit;
//    @FindBy(id="profile-link")
//    WebElement profile;
//    @FindBy(id = "#u_0_5_rf")
//    WebElement loginButton;
//
//    @FindBy(xpath = "//input[@placeholder='From Station']")
//    WebElement fromButton;
//
//    @FindBy(xpath = "//input[@placeholder='From Stati']")
//    WebElement fromButton1;
//
//    @FindBy(xpath = "(//div[text()='Login/SignUp']/following::input)[1]")
//    WebElement fromButton2;
//
//    //(//span[text()='Login/SignUp']/following::input)[1]
//
//    @FindBy(css = "input[@id='31a4fm']")
//    WebElement fromButton3;

    @FindBy(xpath="//input[@value='7']")
    WebElement e7;

    @FindBy(xpath="//input[@value='3']")
    WebElement e3;

    @FindBy(xpath="//input[@value='+']")
    WebElement plus;

    @FindBy(xpath="//input[@value='=']")
    WebElement equal;

    @FindBy(xpath="//input[@id='inp']")
    WebElement value;

    @FindBy(id="FName")
    WebElement firstname;

    @FindBy(id="LName")
    WebElement lastname;

    @FindBy(xpath="//span[text ()='click the submit button']")
    WebElement text;

    @FindBy(xpath="//span[text ()='submit']")
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

    public void Link(){
        WaitForVisibility.until(ExpectedConditions.visibilityOf(link1));
        link1.click();
    }

    public void className(){
        WaitForVisibility.until(ExpectedConditions.visibilityOf(text5));
        System.out.println(text5.getText());
    }

    public void TextContains(){
        WaitForVisibility.until(ExpectedConditions.visibilityOf(text4));
        if( text4.isDisplayed()){
            System.out.println("text contains xpath is displayed");
        }
        else{
            System.out.println("text contains xpath is not displayed");
        }
    }

    public void tag1(){
        WaitForVisibility.until(ExpectedConditions.visibilityOf(text3));
        if( text3.isDisplayed()){
            System.out.println("tag Name is displayed");
        }
        else{
            System.out.println("tag Name is not displayed");
        }
    }

    public void class1(){
        WaitForVisibility.until(ExpectedConditions.visibilityOf(text1));
        if( text1.isDisplayed()){
            System.out.println("class black text is displayed");
        }
        else{
            System.out.println("class black text is not displayed");
        }
    }
    public void class2(){
        if( text2.isDisplayed()){
            System.out.println("class blue text is displayed");
        }
        else{
            System.out.println("class blue text is not displayed");
        }
    }
    public void num7(){
        WaitForVisibility.until(ExpectedConditions.visibilityOf(e7));
        e7.click();
    }
    public void plusButton(){
        WaitForVisibility.until(ExpectedConditions.visibilityOf(plus));
        plus.click();
    }
    public void num3(){
        WaitForVisibility.until(ExpectedConditions.visibilityOf(e3));
        e3.click();
    }
    public void equalButton(){
        WaitForVisibility.until(ExpectedConditions.visibilityOf(equal));
        equal.click();
    }
    public void validate() throws InterruptedException {
        WaitForVisibility.until(ExpectedConditions.visibilityOf(value));
        Thread.sleep(3000);
        String ans= value.getText();
        System.out.println(ans);
    }
    public void firstName(){
        WaitForVisibility.until(ExpectedConditions.visibilityOf(firstname));
        firstname.clear();
        firstname.sendKeys("welcome user");
        System.out.println("First name is entered");
    }
    public void lastName(){
        WaitForVisibility.until(ExpectedConditions.visibilityOf(lastname));
        lastname.clear();
        lastname.sendKeys("hello user");
        System.out.println("last name is entered");
    }
    public String message(){
        WaitForVisibility.until(ExpectedConditions.visibilityOf(text));
        return text.getText();
    }
    public void submitButton(){
        WaitForVisibility.until(ExpectedConditions.visibilityOf(submit));
        if( submit.getText().equalsIgnoreCase("submit")){
            System.out.println("Submit button is displayed");
        }
        else{
            System.out.println("click button is displayed");
        }

    }




    //input[fdprocessedid='31a4fm']

//    @FindBy(xpath = "(//li[@class='collection-item auto-complete-list-item '])[1]")
//    WebElement list;

    public login(SelfHealingDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }


//    public void user10(){
//        WaitForVisibility.until(ExpectedConditions.visibilityOf(name1));
//        name1.sendKeys("welcome user");
//    }
//    public void user11(){
//        WaitForVisibility.until(ExpectedConditions.visibilityOf(name2));
//        name2.sendKeys("welcome user");
//    }
//    public void user12(){
//        WaitForVisibility.until(ExpectedConditions.visibilityOf(name3));
//        if( name3.isDisplayed()){
//            System.out.println("Button is displayed");
//        }
//        else{
//            System.out.println("Button is not displayed");
//        }
//    }
//    public login start(){
//        driver.get(MainPageUrl);
//        return this;
//    }
//    public void verifyProfile(){
//        WaitForVisibility.until(ExpectedConditions.visibilityOf(profile));
//        if (profile.isDisplayed()){
//            System.out.println("Profile photo is displayed");
//        }
//        else{
//            System.out.println("Profile photo is not displayed");
//        }
//    }
//    public void UserName(){
//        WaitForVisibility.until(ExpectedConditions.visibilityOf(username));
//        username.sendKeys("demo");
//    }
//    public void Password(){
////        WaitForVisibility.until(ExpectedConditions.visibilityOf(password));
//        password.sendKeys("1234");
//    }
//
//    public void password1(){
//        password1.sendKeys("1234");
//    }
//    public void password2(){
//        password2.sendKeys("1234");
//    }
//
//    public void password3(){
//        password3.sendKeys("1234");
//    }
//
//    public void password4(){
//        password4.sendKeys("1234");
//    }
//    public void Submit(){
//        WaitForVisibility.until(ExpectedConditions.visibilityOf(submit));
//        submit.click();
//    }
//
//    public void FromButton(){
//        fromButton.click();
//    }
//
//    public void FromButton1(){
//        fromButton1.click();
//    }
//
//    public void FromButton2(){
//        fromButton2.click();
//    }
//
//    public void FromButton3(){
//        fromButton3.click();
//    }
//
//    public void list(){
//        WaitForVisibility.until(ExpectedConditions.visibilityOf(list));
//        list.click();
//    }
//
//
//
//    public void FacebookLogin(){
//        WaitForVisibility.until(ExpectedConditions.visibilityOf(loginButton));
//        if (loginButton.isDisplayed()){
//            System.out.println("Login Button is displayed");
//            System.out.println(loginButton.getText());
//        }
//        else{
//            System.out.println("Login button is not displayed");
//        }
//    }
}
