package step_definitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class    Hooks {
    public static WebDriver webDriver;

    @Before
    public void openBrowser(){
        ChromeOptions a = new ChromeOptions();
        a.addArguments("--remote-allow-origins=*");
        a.addArguments("--no-sandbox");
        a.addArguments("--disable-dev-shm-usage");
//        a.addArguments("--headless");
        a.addArguments("--window-size=1920,1080");
        WebDriverManager.chromedriver().setup();

        webDriver = new ChromeDriver();
        String appUrl = "http://10.10.3.250:32265/sign-in?url=http%3A%2F%2F10.10.3.250%3A30639";
        webDriver.get(appUrl);
        webDriver.manage().window().maximize();
    }

    @After
    public void closeBrowser(){
        webDriver.quit();
    }

}