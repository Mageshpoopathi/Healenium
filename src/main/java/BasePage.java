import com.epam.healenium.SelfHealingDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class BasePage {
    protected SelfHealingDriver driver;
    protected String MainPageUrl="https://demo.cyclos.org/ui/login";
    public BasePage(SelfHealingDriver driver){
        this.driver=driver;
    }

}
