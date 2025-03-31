package utilities;

import org.openqa.selenium.WebElement;

public class UtilityActions {

    public static void eleClick(WebElement ele){
        ele.click();
    }
    public static void sendText(WebElement ele, String txt){
        ele.sendKeys(txt);
    }
}
