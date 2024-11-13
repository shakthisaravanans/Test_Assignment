package browserlauching;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.logging.Logger;

public class SafariBrowser implements Browser{
    public static RemoteWebDriver driver;
    Logger logger = Logger.getLogger(SafariBrowser.class.getName());

    @Override
    public RemoteWebDriver lauchbrowser() {
        SafariDriver driver = new SafariDriver();
        logger.info("Safari Browser Launched");
        return driver;
    }
}
