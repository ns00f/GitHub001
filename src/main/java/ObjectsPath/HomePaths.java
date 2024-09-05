package ObjectsPath;

import org.openqa.selenium.By;

public class HomePaths {

    public static final By docsLink = By.xpath("//a[text()='Docs']");

    public static final By signIn = By.xpath("/html/body/div[1]/div[1]/header/div/div[2]/div/div/div/a");

    public static final By newRepoButton0 = By.xpath("//button[@id='global-create-menu-anchor']");

    public static final By newRepoLink0 = By.xpath("//*[contains(text(),'New repository')]");

    public static final By repoNameInput0 = By.xpath("//input[@data-testid='repository-name-input']");

    public static final By createRepoButton1 = By.xpath("//span[text()='Create repository']");

   // public static final By clickOnRepo1 = By.xpath("//a[contains(@href, '/ensafalsharif@gmail.com/" + repoNameInput0 + "')]");


}
