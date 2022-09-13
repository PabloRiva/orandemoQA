package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import pages.HomePage;
import utilities.DriverManager;

public class Hooks {
    HomePage homePage = new HomePage(DriverManager.getDriver().driver);
    @AfterAll
    public static void afterAll(){
        DriverManager.getDriver().driver.close();
    }
    @After("@Logout")
    public void afterScenario(){
        homePage.clickOnOptionsDropDown();
        homePage.clickOnLogoutLink();
    }
}
