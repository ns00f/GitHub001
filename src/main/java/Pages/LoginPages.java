package Pages;

import ObjectsPath.LoginObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static ObjectsPath.LoginObjects.*;
import static ObjectsPath.LoginObjects.password;

public class LoginPages {
    WebDriver driver = null;

    public LoginPages(WebDriver driver) {
        this.driver = driver;
    }

    public void openUrl() {
        driver.get("https://github.com/login");
    }

    public void usernameField() {
        WebElement userName = driver.findElement(username);
        userName.sendKeys("ensafalsharif@gmail.com");

    }

    public void passwordField() {
        WebElement Password = driver.findElement(password);
        Password.sendKeys("******");

    }

    public void loginBtn() {
        WebElement loginBtn = driver.findElement(loginButton);
        loginBtn.click();
    }


}
