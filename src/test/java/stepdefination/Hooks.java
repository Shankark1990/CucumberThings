package stepdefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

import java.io.IOException;

public class Hooks {

    public WebDriver driver;
    public static LoginPage loginPage;
    static Logger log;

    @Before
    public void setup() {
        log = LogManager.getLogger(Hooks.class);

        System.out.println("Inside hooks");
        driver = new ChromeDriver();
        log.info("This is log message");
        driver.manage().window().maximize();
        driver.get("https://saucedemo.com/");
        loginPage = new LoginPage(driver);

    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();

    }
}
