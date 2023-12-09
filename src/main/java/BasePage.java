import com.epam.healenium.SelfHealingDriver;
import engine.DatabaseConnection;
import engine.PropertiesRead;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.sql.Connection;
import java.sql.SQLException;


public class BasePage {
    static Connection connect;
    protected SelfHealingDriver driver;
    static DatabaseConnection db;
    static String browserName= PropertiesRead.readProperties().get("browserName");

    public BasePage(SelfHealingDriver driver) {
        this.driver = driver;
    }

    public static void connectPostgresql() {
        db = new DatabaseConnection();
        connect = db.connectToDB(PropertiesRead.readProperties().get("dbName"),PropertiesRead.readProperties().get("dbUser"), PropertiesRead.readProperties().get("dbPassword"));
    }

    public static void disconnectPostgresql() throws SQLException {
        connect.close();
        if (connect.isClosed()) {
            System.out.println("Database connection is closed");
        } else {
            System.out.println("Database connection is not closed");
        }
    }

    public static WebDriver connectToBrowser(String BrowserName) {
        switch (BrowserName) {
            case "CHROME":
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOption = new ChromeOptions();
                chromeOption.addArguments("--remote-allow-origins=*");
                return new ChromeDriver();
            case "EDGE":
                WebDriverManager.edgedriver().setup();
                EdgeOptions edgeOption = new EdgeOptions();
                edgeOption.addArguments("--remote-allow-origins=*");
                return new EdgeDriver();
        }
        return new ChromeDriver();
    }

    public static void getDataInDB(String columnName) {
        db.readData(connect, "healenium." + columnName);
    }

}
