import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login {

    private static WebDriver driver;


    public Login(WebDriver driver) {
        this.driver = driver;
        driver.get("https://rde.lt");
    }


    public static void loginWindow(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            Thread.sleep(3000);
            WebElement login = driver.findElement(By.id("auth-login-tab"));
            wait.until(ExpectedConditions.elementToBeClickable(login));
            login.click();

            Thread.sleep(3000);
            WebElement emailIcon = driver.findElement(By.xpath("//*[@id=\"auth-login-panel\"]/div/div/div/a[2]"));
            wait.until(ExpectedConditions.elementToBeClickable(emailIcon));
            emailIcon.click();

            Thread.sleep(3000);
            WebElement chooseEmail = driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div/div/ul/li[1]/div"));
            wait.until(ExpectedConditions.elementToBeClickable(chooseEmail));
            chooseEmail.click();
        }catch (Exception e){
            System.out.println("Error in Login" + e.getMessage());
        }



        // WebElement gmailIcon = driver.findElement(By.xpath("//*[@id=\"auth-login-panel\"]/div/div/div/a[2]/img"));
        //gmailIcon.click();

     //   WebElement email = driver.findElement(By.xpath("//*[@id=\"loginEmail\"]"));
       // email.click();

    }
}