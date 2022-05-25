import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidAccounts extends BaseTest {



        // Signup without providing First Name field
        @Test
        public void emptyFirstNameTest() {

            driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");

            WebElement firstname = driver.findElement(By.id("input-firstname"));
            WebElement lastname = driver.findElement(By.id("input-lastname"));
            WebElement email = driver.findElement(By.id("input-email"));
            WebElement telephone = driver.findElement(By.id("input-telephone"));
            WebElement password = driver.findElement(By.id("input-password"));
            WebElement passwordconfirm = driver.findElement(By.id("input-confirm"));
            WebElement agree = driver.findElement(By.name("agree"));
            WebElement submit = driver.findElement(By.xpath("//input[@value='Continue']"));
            firstname.sendKeys("");
            lastname.sendKeys("ha");
            email.sendKeys("anhathi.truong@gmail.com");
            telephone.sendKeys("0909123456");
            password.sendKeys("123456");
            passwordconfirm.sendKeys("123456");
            agree.click();
            submit.click();

            String expectedErrorMsg = "First Name must be between 1 and 32 characters!";

            WebElement exp = driver.findElement(By.xpath("//div[@class='text-danger']"));
            String actualErrorMsg = exp.getText();

            Assert.assertEquals(actualErrorMsg, expectedErrorMsg);


        }

    // Signup without providing Last Name field

    @Test
    public void emptyLastNameTest() {
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");

        WebElement firstname = driver.findElement(By.id("input-firstname"));
        WebElement lastname = driver.findElement(By.id("input-lastname"));
        WebElement email = driver.findElement(By.id("input-email"));
        WebElement telephone = driver.findElement(By.id("input-telephone"));
        WebElement password = driver.findElement(By.id("input-password"));
        WebElement passwordconfirm = driver.findElement(By.id("input-confirm"));
        WebElement agree = driver.findElement(By.name("agree"));
        WebElement submit = driver.findElement(By.xpath("//input[@value='Continue']"));
        firstname.sendKeys("truong");
        lastname.sendKeys("");
        email.sendKeys("anhathi.truong@gmail.com");
        telephone.sendKeys("0909123456");
        password.sendKeys("123456");
        passwordconfirm.sendKeys("123456");
        agree.click();
        submit.click();

        String expectedErrorMsg = "Last Name must be between 1 and 32 characters!";

        WebElement exp = driver.findElement(By.xpath("//div[@class='text-danger']"));
        String actualErrorMsg = exp.getText();

        Assert.assertEquals(actualErrorMsg, expectedErrorMsg);

    }

    //Signup without providing email field
    @Test
    public void emptyEmailTest() {
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");

        WebElement firstname = driver.findElement(By.id("input-firstname"));
        WebElement lastname = driver.findElement(By.id("input-lastname"));
        WebElement email = driver.findElement(By.id("input-email"));
        WebElement telephone = driver.findElement(By.id("input-telephone"));
        WebElement password = driver.findElement(By.id("input-password"));
        WebElement passwordconfirm = driver.findElement(By.id("input-confirm"));
        WebElement agree = driver.findElement(By.name("agree"));
        WebElement submit = driver.findElement(By.xpath("//input[@value='Continue']"));
        firstname.sendKeys("truong");
        lastname.sendKeys("ha");
        email.sendKeys("");
        telephone.sendKeys("0909123456");
        password.sendKeys("123456");
        passwordconfirm.sendKeys("123456");
        agree.click();
        submit.click();

        String expectedErrorMsg = "E-Mail Address does not appear to be valid!";

        WebElement exp = driver.findElement(By.xpath("//div[@class='text-danger']"));
        String actualErrorMsg = exp.getText();

        Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
    }

    //Signup without providing telephone field
    @Test
    public void emptyTelephoneTest() {
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");

        WebElement firstname = driver.findElement(By.id("input-firstname"));
        WebElement lastname = driver.findElement(By.id("input-lastname"));
        WebElement email = driver.findElement(By.id("input-email"));
        WebElement telephone = driver.findElement(By.id("input-telephone"));
        WebElement password = driver.findElement(By.id("input-password"));
        WebElement passwordconfirm = driver.findElement(By.id("input-confirm"));
        WebElement agree = driver.findElement(By.name("agree"));
        WebElement submit = driver.findElement(By.xpath("//input[@value='Continue']"));
        firstname.sendKeys("truong");
        lastname.sendKeys("ha");
        email.sendKeys("anhathi.truong@gmail.com");
        telephone.sendKeys("");
        password.sendKeys("123456");
        passwordconfirm.sendKeys("123456");
        agree.click();
        submit.click();

        String expectedErrorMsg = "Telephone must be between 3 and 32 characters!";

        WebElement exp = driver.findElement(By.xpath("//div[@class='text-danger']"));
        String actualErrorMsg = exp.getText();

        Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
    }

    //Signup without providing password field
    @Test

    public void emptyPasswordTest () {
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");

        WebElement firstname = driver.findElement(By.id("input-firstname"));
        WebElement lastname = driver.findElement(By.id("input-lastname"));
        WebElement email = driver.findElement(By.id("input-email"));
        WebElement telephone = driver.findElement(By.id("input-telephone"));
        WebElement password = driver.findElement(By.id("input-password"));
        WebElement passwordconfirm = driver.findElement(By.id("input-confirm"));
        WebElement agree = driver.findElement(By.name("agree"));
        WebElement submit = driver.findElement(By.xpath("//input[@value='Continue']"));
        firstname.sendKeys("truong");
        lastname.sendKeys("ha");
        email.sendKeys("anhathi.truong@gmail.com");
        telephone.sendKeys("0909123456");
        password.sendKeys("");
        passwordconfirm.sendKeys("");
        agree.click();
        submit.click();

        String expectedErrorMsg = "Password must be between 4 and 20 characters!";

        WebElement exp = driver.findElement(By.xpath("//div[@class='text-danger']"));
        String actualErrorMsg = exp.getText();

        Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
    }

}
