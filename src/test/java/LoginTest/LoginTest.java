package LoginTest;

import Base.BaseClass;
import Pages.LoginPages;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {

    @Test(testName = "TS-001")

    public void LoginPagesMethod() throws InterruptedException {
        LoginPages login = new LoginPages(driver);

        login.openUrl();
        login.usernameField();
        login.passwordField();
        login.loginBtn();



    }

}