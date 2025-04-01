package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.RepoObject;
import utilities.UtilityActions;


public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enter_user_name(String username) {
        driver.findElement(By.xpath(RepoObject.username_xpath)).sendKeys(username);
    }

    public void enter_password(String password) {
        driver.findElement(By.xpath(RepoObject.password_xpath)).sendKeys(password);
    }

    public void click_login_button(){
        UtilityActions.eleClick(driver.findElement(By.xpath(RepoObject.loginBtn_xpath)));
    }

    public void verify_order_success(){
        try{
            System.out.println("Inside verify order success method");
            driver.findElement(By.xpath(RepoObject.finishBtn_xpath)).isDisplayed();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
