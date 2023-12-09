import com.epam.healenium.SelfHealingDriver;
import engine.PropertiesRead;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import java.sql.SQLException;
public class HealeniumDemo{
    static public SelfHealingDriver driver;
    @BeforeAll
    public static void setup() {

        BasePage.connectPostgresql();
        WebDriver delegate= BasePage.connectToBrowser(BasePage.browserName.toUpperCase());
//        BasePage.getDataInDB("Selector");
        driver = SelfHealingDriver.create(delegate);
        driver.get(PropertiesRead.getURL());
    }
    @Test
    public void linkText(){
        Repo method1=new Repo(driver);
        method1.Link();
    }
    @Test
    public void add(){
        Repo method2=new Repo(driver);
        method2.num3();
        method2.plusButton();
        method2.num7();
        method2.equalButton();
    }

    @AfterAll
    public static void tearDown() throws SQLException {
        if(driver!=null){
            driver.quit();
            BasePage.disconnectPostgresql();
            System.out.println("Code running successfully");
        }
    }

}
