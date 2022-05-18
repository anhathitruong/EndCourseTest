import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class RegisterTest extends BaseTest {

    @Test

    public void SignUpAccount() {


        webDriver.get("http://tutorialsninja.com/demo/index.php?route=account/register");

        WebElement firstname = webDriver.findElement(By.id("input-firstname"));
        WebElement lastname = webDriver.findElement(By.id("input-lastname"));
        WebElement email = webDriver.findElement(By.id("input-email"));
        WebElement telephone = webDriver.findElement(By.id("input-telephone"));
        WebElement password = webDriver.findElement(By.id("input-password"));
        WebElement passwordconfirm = webDriver.findElement(By.id("input-confirm"));
        WebElement agree = webDriver.findElement(By.name("agree"));
        WebElement submit = webDriver.findElement(By.xpath("//input[@value='Continue']"));
        firstname.sendKeys("summer");
        lastname.sendKeys("truong");
        email.sendKeys("summertruong@gmail.com");
        telephone.sendKeys("0909931988");
        password.sendKeys("123456");
        passwordconfirm.sendKeys("123456");
        agree.click();
        submit.click();


    }
}







