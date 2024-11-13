package browserlauching;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.logging.Logger;

public class ChromeBrowser implements Browser{
    public static RemoteWebDriver driver;
    Logger logger = Logger.getLogger(ChromeBrowser.class.getName());

    @Override
    public RemoteWebDriver lauchbrowser() {
        driver = new ChromeDriver();
        logger.info("Chrome Browser Launched");
        return driver;
    }
}
