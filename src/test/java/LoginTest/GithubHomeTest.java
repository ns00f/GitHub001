package LoginTest;

import Base.BaseClass;
import Pages.HomePages;
import Pages.LoginPages;
import org.testng.annotations.Test;

public class GithubHomeTest extends BaseClass {

    @Test(testName = "TS-001")
    public void LoginPagesMethod() throws InterruptedException {
        LoginPages login = new LoginPages(driver);
        login.openUrl();
        login.usernameField();
        login.passwordField();
        login.loginBtn();


    }

    @Test(testName = "TS-002")
    public void HomePageMethod() throws InterruptedException {
        HomePages home = new HomePages(driver);
        LoginPagesMethod();

        Thread.sleep(2000);
        home.createNewRepo();
        Thread.sleep(2000);
        //home.clickOnRepo();
        Thread.sleep(2000);
        home.newRepoName();
        Thread.sleep(2000);
        home.createRepoButton();
        Thread.sleep(4000);
       // home.scrollToPosition(0, 600);
       // Thread.sleep(2000);

    }


}
