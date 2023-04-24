import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PirkiniuKrepselis {

     private WebDriver driver;
     private final By addToCart = By.xpath("/html/body/main/div[3]/div/div/div[2]/div/div[2]/div/div/div[1]/div/div/div[5]/div/a[1]/span");


     public PirkiniuKrepselis(WebDriver driver){
         this.driver = driver;
         driver.get("https://rde.lt");
     }

     public void addToCard(){

//     WebElement addToCartButton = driver.findElement(By.xpath("/html/body/main/div[3]/div/div/div[2]/div/div[2]/div/div/div[1]/div/div/div[5]/div/a[1]/span"));
//     addToCartButton.click();
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/main/header/div/div/a")));
         WebElement addProduct = wait.until(ExpectedConditions.visibilityOfElementLocated(addToCart));
         addProduct.click();

     }




}
