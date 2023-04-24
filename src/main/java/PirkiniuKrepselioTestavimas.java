import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PirkiniuKrepselioTestavimas {

    public static void main(String[]args){
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:/Users/user/Desktop/chromedriver/chromedriver_win32/ch0romedriver.exe");
        driver.manage().window().maximize();
        PirkiniuKrepselis test1 = new PirkiniuKrepselis(driver);
       // test1.addToCard();
        Registracija test2 = new Registracija(driver);
        test2.ieiti();
    }
}
