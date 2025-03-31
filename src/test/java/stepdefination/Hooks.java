package stepdefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

public class Hooks {

    public WebDriver driver;
    public static LoginPage loginPage;

    @Before
    public void setup() {
        System.out.println("Inside hooks");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://saucedemo.com/");
        loginPage = new LoginPage(driver);

    }

    @After
    public void tearDown() {

    }
}
