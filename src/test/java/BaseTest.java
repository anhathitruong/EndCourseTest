import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;


public class BaseTest {
   public static WebDriver driver;

    private static java.util.concurrent.TimeUnit SECONDS;


    @BeforeTest
    public static void beforeTest ()  throws InterruptedException {

        System.out.println("This is Before Test method");
        System.setProperty("webdriver.chrome.driver", "/Users/truonganha/Desktop/AEndCourseTest/EndCourseTest/chromedriver 2");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);






        driver = WebDriverManager.getInstance("Chrome").create();


    }

    }








