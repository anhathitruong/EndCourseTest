import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class RegisterTest extends BaseTest {

    @Test

    public void SignUpAccount() {


        driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");

        WebElement firstname = driver.findElement(By.id("input-firstname"));
        WebElement lastname = driver.findElement(By.id("input-lastname"));
        WebElement email = driver.findElement(By.id("input-email"));
        WebElement telephone = driver.findElement(By.id("input-telephone"));
        WebElement password = driver.findElement(By.id("input-password"));
        WebElement passwordconfirm = driver.findElement(By.id("input-confirm"));
        WebElement agree = driver.findElement(By.name("agree"));
        WebElement submit = driver.findElement(By.xpath("//input[@value='Continue']"));
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







