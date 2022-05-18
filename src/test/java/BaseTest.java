import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;



public class BaseTest {
    protected WebDriver webDriver;


    @BeforeTest
    public void beforeTest() {
        System.out.println("This is Before Test method");
        System.setProperty("webdriver.chrome.driver", "/Users/truonganha/Desktop/AEndCourseTest/EndCourseTest/chromedriver");
        WebDriver driver = new ChromeDriver();

        webDriver = WebDriverManager.getInstance("Chrome").create();

        webDriver.manage().window().maximize();
    }

    }



