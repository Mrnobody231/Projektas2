import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;
//
//public class WebsiteTest {
//
//    public static void main(String[] args) {
//
//        System.setProperty("webdriver.chrome.driver", "C:/Users/user/Desktop/chromedriver/chromedriver_win32/chromedriver.exe");
//        WebsiteTest test1 = new WebsiteTest();
//        //test1.googleSearch();
//        GoogleSearchPage test2 = new GoogleSearchPage(driver);
//        test2 acceptCookie();
//
//        GoogleSearchResults results = new GoogleSearchResults();
//    }

//    public void googleSearch() {
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://google.com");
//        WebElement cookieNotice = driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div"));
//        cookieNotice.click();
//
//        String[] searchTerms = {"Java", "Vilnius", "Selenium"};
//        WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
//
//        for (String term : searchTerms) {
//            searchBox.sendKeys(term);
//            searchBox.submit();
//            String expectedTerms = term + " - „Google“ paieška";
//            String actualTerms = driver.getTitle();
//            assertEquals(expectedTerms, actualTerms);
//            driver.navigate().back();
//        }
//        driver.quit();
//
//    }
//}




