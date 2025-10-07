package tests;

import org.testng.Assert;
import org.testng.annotations.*;
import pages.LoginPage;
import utils.BaseTest;

public class LoginTest extends BaseTest {
    LoginPage loginPage;

    @BeforeMethod
    public void setupTest() {
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testValidLogin() {
        loginPage.login("testuser", "testpass");
        Assert.assertEquals(driver.getTitle(), "Home");
    }
}
