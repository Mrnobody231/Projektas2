import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;


    public class TestPage{

        private static Registracija registracija;
        private static Login login;

        private static WebDriver driver;


        @BeforeClass
        public static void setUp(){
            System.setProperty("webdriver.chrome.driver", "C:/Users/user/Desktop/chromedriver/chromedriver_win32/chromedriver.exe");
            driver = new ChromeDriver();

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            WebDriver driver = new ChromeDriver(options);

            //LAukiame kol visi Elementai bus užkrauti
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
            //objektas
            registracija = new Registracija(driver);
            login = new Login(driver);
        }
        @Test
        public void registracija2(){
            registracija.ieiti();
            registracija.registruotis();
        }
        @Test
        public void login(){
            login.loginWindow();
        }

        @AfterClass
        public static void tearDown(){
            driver.quit();
        }
    }

