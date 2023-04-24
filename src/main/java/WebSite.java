//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import static org.junit.Assert.assertEquals;
//
//
//public class WebSite {
//    public static void main(String[] args) {
//        WebDriver driver = new ChromeDriver();
//        System.setProperty("webdriver.chrome.driver", "C:/Users/user/Desktop/chromedriver/chromedriver_win32/chromedriver.exe"); //declare path to
//        // chromedriver
//        WebSite test1 = new WebSite();
//       // test1.googleSearch();
//        GoogleSearchPage test2 = new GoogleSearchPage(driver);
//        test2.acceptCookie();
//    }
//
//   // public void googleSearch() {
////        WebDriver driver = new ChromeDriver();
////        driver.get("https://www.google.com/");
////        WebElement cookieNotice = driver.findElement(By.xpath("//*[@id='L2AGLb']/div"));
////        cookieNotice.click();
////        String[] searchTerm = {"Java", "Vilnius", "Kaunas"};
////        WebElement searchBox;
////        searchBox = driver.findElement(By.xpath("//*[@id='APjFqb']"));
////        for (String term : searchTerm) {
////            searchBox.sendKeys(term);
////            searchBox.submit();
////            String expectedValue = term + " - „Google“ paieška";
////            String actualValue = driver.getTitle();
////            assertEquals(expectedValue, actualValue);
////            driver.navigate().back();
////        }
////        //*[@id="APjFqb"]
////        driver.quit();
////    }
//}
