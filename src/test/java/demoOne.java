import com.epam.healenium.SelfHealingDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.checkerframework.checker.fenum.qual.SwingTextOrientation;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.http.HttpClient;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.Duration;


public class demoOne{
    static public SelfHealingDriver driver;
    static Connection connect;

    @BeforeAll
    public static void setup() {
        DatabaseConnection db=new DatabaseConnection();
         connect=db.connectToDB("healenium","postgres","lion@208");
        db.readData(connect,"healenium.selector");
        WebDriverManager.chromedriver().setup();
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        WebDriver delegate = new ChromeDriver();
        driver = SelfHealingDriver.create(delegate);
        driver.get("C:/Users/LENOVO/Downloads/appiumBDD-Framework/Healenium/sourceCode/Calculator/index.html");
    }

    //    @Test
//    public void test20() throws InterruptedException {
//        driver.get("C:/Users/LENOVO/Downloads/appiumBDD-Framework/untitled/sourceCode/Calculator/index.html");
//        login web=new login(driver);
//        web.num7();
//        Thread.sleep(2000);
//        web.plusButton();
//        Thread.sleep(2000);
//        web.num3();
//        Thread.sleep(2000);
//        web.equalButton();
//        Thread.sleep(2000);
//        web.validate();
//    }
//    @Test
//    public void Id(){
//        login exe=new login(driver);
//        exe.firstName();
//        exe.lastName();
//        System.out.println(exe.message());
//        exe.submitButton();
//    }
//    @Test
//    public void className(){
//        login exe1=new login(driver);
//       exe1.class1();
//        exe1.class2();
//    }
//    @Test
//    public void TagName(){
//        login exe2=new login(driver);
//        exe2.tag1();
//    }
//    @Test
//    public void textContains(){
//        login exe3=new login(driver);
//        exe3.TextContains();
//    }
//    @Test
//    public void ClassName(){
//        login exe4=new login(driver);
//        exe4.className();
//    }
    @Test
    public void linkText(){
        login exe5=new login(driver);
        exe5.Link();
    }





    //valid login
//    @Test
//    public void test1() throws InterruptedException {
//                driver.get("https://demo.cyclos.org/ui/login");
//        login loginWeb=new login(driver);
//        loginWeb.UserName();
//        loginWeb.Password();
//        loginWeb.Submit();
//        Thread.sleep(5000);
//        loginWeb.verifyProfile();
//
//}

        //dynamic locator change login
//    @Test
//    public void test2(){
//        driver.get("https://www.facebook.com/");
//        login Facebook=new login(driver);
//        Facebook.FacebookLogin();
//    }

//    //prefix
//    @Test
//    public void test3() throws InterruptedException {
//        driver.get("https://demo.cyclos.org/ui/login");
//            login loginWeb=new login(driver);
//            loginWeb.UserName();
//            loginWeb.password1();
//            loginWeb.Submit();
//            Thread.sleep(5000);
//            loginWeb.verifyProfile();
//
//        }
//        //tagname-xpath
//    @Test
//    public void test4() throws InterruptedException {
//        driver.get("https://demo.cyclos.org/ui/login");
//            login loginWeb=new login(driver);
//            loginWeb.UserName();
//            loginWeb.password2();
//            loginWeb.Submit();
//            Thread.sleep(5000);
//            loginWeb.verifyProfile();
//
//        }
//        //valid-selector
//        @Test
//        public void test5() throws InterruptedException {
//            driver.get("https://demo.cyclos.org/ui/login");
//            login loginWeb=new login(driver);
//            loginWeb.UserName();
//            loginWeb.password3();
//            loginWeb.Submit();
//            Thread.sleep(5000);
//            loginWeb.verifyProfile();
//
//
//        }
//    //invalid selector  - value
//    @Test
//    public void test6() throws InterruptedException {
//        driver.get("https://demo.cyclos.org/ui/login");
//        login loginWeb=new login(driver);
//        loginWeb.UserName();
//        loginWeb.password4();
//        loginWeb.Submit();
//        Thread.sleep(5000);
//        loginWeb.verifyProfile();
//
//
//    }

//    @Test
//    public void test7() throws InterruptedException{
//        driver.get("https://demo.cyclos.org/ui/login");
//        login loginWeb=new login(driver);
//        loginWeb.UserName();
//        loginWeb.password4();
//        loginWeb.Submit();
//        Thread.sleep(5000);
//        loginWeb.verifyProfile();
//    }
    //valid
//@Test
//public void test8() {
//        driver.get("https://www.abhibus.com/");
//    login loginWeb=new login(driver);
//    loginWeb.FromButton();
//    loginWeb.list();
//
//
//}
   //value -xpath
//    @Test
//    public void test9() throws InterruptedException {
//        driver.get("C:/Users/LENOVO/Downloads/appiumBDD-Framework/untitled/sourceCode/www.saucedemo.com/v1/index.html");
//        login loginWeb=new login(driver);
//        loginWeb.user10();
//        loginWeb.user11();
//        loginWeb.user12();
//    }



    //prefix -xpath

//    @Test
//    public void test10() throws InterruptedException {
//        Thread.sleep(10000);
//        driver.get("https://www.abhibus.com");
//        login loginWeb=new login(driver);
//        loginWeb.FromButton2();
//        loginWeb.list();
//
//
//    }
  // @tagname -selector
//    @Test
//    public void test11() {
//        driver.get("https://www.abhibus.com/");
//        login loginWeb=new login(driver);
//        loginWeb.FromButton3();
//        loginWeb.list();
//    }

    //change locator value in source code
//   @Test
//    public void test12() throws InterruptedException {
//       driver.get("https://demo.cyclos.org/ui/login");
//        login loginWeb=new login(driver);
//        loginWeb.UserName();
//        loginWeb.Password();
//        Thread.sleep(15000);
//        loginWeb.Submit();
//        Thread.sleep(5000);
//        loginWeb.verifyProfile();
//    }


    @AfterAll
    public static void tearDown() throws SQLException {
        if(driver!=null){
            driver.quit();
            System.out.println("Code running successfully");
            connect.close();
            if(connect.isClosed())
            {
                System.out.println("Database connection is closed");
            }
            else{
                System.out.println("Database connection is not closed");
            }
        }
    }
}
