package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * 3. Write down the following test into ‘LoginTest’ class
 * 1. userSholdLoginSuccessfullyWithValidCredentials
 * * Enter “Admin” username
 * * Enter “admin123 password
 * * Click on ‘LOGIN’ button
 * * Verify the ‘Welcome’ text is display
 */
public class LoginTest extends BaseTest {
    String baseUrl ="https://opensource-demo.orangehrmlive.com/";
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){
    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");     //Enter admin
    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");  //Enter password
    driver.findElement(By.xpath("//button[@type='submit']")).click();                          //Click Login
    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}
