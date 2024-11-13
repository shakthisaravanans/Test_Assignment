package browserlauching;

import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserFactory {
    public static RemoteWebDriver driver;

    public BrowserFactory(BrowserType browserType) throws IllegalAccessException {
        switch (browserType){
            case Chrome:
                driver = new ChromeBrowser().lauchbrowser();
                break;
            case Safari:
                driver = new SafariBrowser().lauchbrowser();
            default:
                throw new IllegalAccessException("Not a valid Browser Type");
        }
        browserActions();
    }

    public void browserActions(){
        BrowserHelper browserHelper = new BrowserHelper(driver);
        browserHelper.maximizeBrowser();
        browserHelper.setTimeout();
        browserHelper.launchURL();
    }


}
