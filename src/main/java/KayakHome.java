import io.netty.handler.codec.spdy.SpdyHttpResponseStreamIdHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class KayakHome extends KayakBase {

    private static final By stayButton = By.cssSelector("a[aria-label='Search for hotels'] div[class='hsCY-menu-item-title']");


    public KayakHome(WebDriver driver) {
        super(driver);
    }

    public static void stays() {
        WebDriverWait stayButtonWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try{
        WebElement stays = stayButtonWait.until(ExpectedConditions.visibilityOfElementLocated(stayButton));
            stays.click();
            Thread.sleep(5000);
        } catch (Exception e) {

        }
    }
    public static void searchBox(){
        String[] searchTerm = {"Narutis"};
        WebElement searchBox = driver.findElement(By.cssSelector("input[placeholder='Enter a city, hotel, airport, address or landmark']"));
        for(String term : searchTerm){
            searchBox.sendKeys(term);
            searchBox.submit();
        }
    }
}