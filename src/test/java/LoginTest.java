import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;



public class LoginTest extends BaseTest {

    @Test

    public void VerifyLoginValidAccount () {


        driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");


        WebElement email = driver.findElement(By.id("input-email"));

        WebElement password = driver.findElement(By.id("input-password"));

        WebElement submit = driver.findElement(By.xpath("//input[@value='Login']"));

        email.sendKeys("summertruong@gmail.com");

        password.sendKeys("123456");

        submit.click();



        String expectedURL = "http://tutorialsninja.com/demo/index.php?route=account/account";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL);



    }
}








