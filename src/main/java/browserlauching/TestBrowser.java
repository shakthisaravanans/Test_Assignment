package browserlauching;

public class TestBrowser {
    public static void main(String[] args) throws IllegalAccessException {
        BrowserFactory browserFactory = new BrowserFactory(BrowserType.Chrome);
        //BrowserFactory browserFactory1 = new BrowserFactory(BrowserType.Safari);
    }
}
