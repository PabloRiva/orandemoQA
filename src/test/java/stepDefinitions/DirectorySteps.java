package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.DirectoryPage;
import pages.HomePage;
import utilities.DriverManager;

public class DirectorySteps {
    DirectoryPage directoryPage = new DirectoryPage(DriverManager.getDriver().driver);
    @Then("The employee {string} is displayed")
    public void verifyEmployeeIsDisplayed(String employee) throws InterruptedException {
        Assert.assertTrue(directoryPage.verifyEmployeeIsDisplayed(employee));
    }

}
