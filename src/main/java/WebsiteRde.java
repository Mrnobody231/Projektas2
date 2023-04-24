import io.netty.channel.nio.AbstractNioByteChannel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class WebsiteRde {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/user/Desktop/chromedriver/chromedriver_win32/chromedriver.exe");
        WebsiteRde rde = new WebsiteRde();
        rde.rdeSearch();

    }

    public void rdeSearch() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rde.lt");
       // WebElement cookieNotice = driver.findElement(By.xpath("//*[@id=\"js_cookie_window\"]/p/a[2]"));
       // cookieNotice.click();


        String[] searchTerms = {"Televizoriai", "Mobilieji Telefonai", "Saldytuvai"};
        //WebElement searchBox = driver.findElement(By.xpath("/html/body/main/header/div/form/input"));

        for (String terms : searchTerms) {
            WebElement searchBox = driver.findElement(By.xpath("/html/body/main/header/div/form/input"));
            searchBox.sendKeys(terms);
            searchBox.submit();


            List<WebElement> productTitles = driver.findElements(By.xpath("//*[@id=\"main_container_wrapper\"]/ul[2]/li[5]/div[2]/div[1]/h3"));
            String[] products = new String[productTitles.size()];
            for (int x = 0; x < productTitles.size(); x++) {
                products[x] = productTitles.get(x).getText();
            }
            System.out.println("Rasti produktai su zodziu\"" + terms + "\":");
            for (String product : products){
                System.out.println(" - " + product);

            }
            driver.navigate().back();
        }

    }
}
