package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static ObjectsPath.HomePaths.*;

public class HomePages {
    WebDriver driver = null;

    public HomePages(WebDriver driver) {
        this.driver = driver;
    }

    public void openGitUrl() {
        driver.get("https://github.com/");
    }

    public void clickOnSignInBtn() {
        WebElement SignInBtn = driver.findElement(signIn);
        SignInBtn.click();
    }

    public void clickOnDocs() throws InterruptedException {
        WebElement Docs = driver.findElement(docsLink);
        Docs.sendKeys(Keys.PAGE_DOWN);
        //Using selenium Keys to scroll down page
        Thread.sleep(3000);
        Docs.click();
//        Thread.sleep(2000);
//        boolean gitHubAssert = driver.findElement(githubDocsTextAssertion).isDisplayed();
//        Assert.assertTrue(true);


    }

    public void createNewRepo() {
        WebElement newRepoButton = driver.findElement(newRepoButton0);
        newRepoButton.click();

        WebElement newRepoLink = driver.findElement(newRepoLink0);
        newRepoLink.click();
    }

    public void newRepoName() {
        WebElement repoNameInput = driver.findElement(repoNameInput0);
        repoNameInput.click();
        repoNameInput.sendKeys("GitHub0");

    }

   // public void clickOnRepo() {
     //   WebElement clickOnRepo = driver.findElement(clickOnRepo1);
       // clickOnRepo.click();
   // }

    public void scrollToPosition(int x, int y) {
        JavascriptExecutor ja = (JavascriptExecutor) driver;
        ja.executeScript("window.scrollTo(arguments[0],(arguments[1]);", x, y);

    }


    public void createRepoButton() {
        WebElement createRepoButton = driver.findElement(createRepoButton1);
        createRepoButton.click();
    }


}
