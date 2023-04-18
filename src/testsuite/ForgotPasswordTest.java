package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * 4. Write down the following test into
 * ‘ForgotPasswordTest’ class
 * 1. userShouldNavigateToForgotPasswordPageSuccessfully
 * * click on the ‘Forgot your password’ link
 * * Verify the text ‘Forgot Your Password?’
 */
public class ForgotPasswordTest extends BaseTest {

    String baseURL= "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp(){
        openBrowser(baseURL);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        //click on the ‘Forgot your password’ link
        driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();

        //* Verify the text ‘Forgot Your Password?’
        String expectedText ="//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']";
        String actualText = driver.findElement(By.xpath("")).getText();
        Assert.assertEquals("Verified the Text ‘Forgot Your Password?’ -, no error ",expectedText,actualText);
    }

    public void tearDown(){
        closeBrowser();
    }

}
