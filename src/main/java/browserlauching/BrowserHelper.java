package browserlauching;

import org.openqa.selenium.remote.RemoteWebDriver;

import java.time.Duration;
import java.util.logging.Logger;

public class BrowserHelper {
    public static RemoteWebDriver driver;
    Logger logger = Logger.getLogger(BrowserHelper.class.getName());

    public BrowserHelper(RemoteWebDriver driver) {
        this.driver = driver;
    }

    public void maximizeBrowser(){
        driver.manage().window().maximize();
        logger.info("Browser Maximized");
    }

    public void setTimeout(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        logger.info("Set Timeout");
    }

    public void launchURL(){
        driver.get("https://www.indianbank.net.in/jsp/startIB.jsp");
        logger.info("Launched URL");
    }
}
