package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AboutPage;
import pages.HomePage;
import utilities.DriverManager;

import java.util.List;

public class HomeSteps {
    HomePage homepage = new HomePage(DriverManager.getDriver().driver);
    AboutPage aboutPage = new AboutPage(DriverManager.getDriver().driver);
    @Then("The home page should be displayed")
    public void verifyHomePageIsDisplayed(){
        Assert.assertTrue(homepage.topBarIsDisplayed());
    }
    @And("I fill the search information with")
    public void fillCheckoutInformation(DataTable checkoutInformation) throws InterruptedException {
        List<String> data = checkoutInformation.transpose().asList(String.class);
        homepage.setEmployeeID(data.get(0));
        homepage.setSupervisorName(data.get(1));
        homepage.setEmployeeName(data.get(2));
    }
    @And("I click on search button")
    public void clickOnContinueButton(){
        homepage.clickOnSearchButton();
    }
    @Then("The employee should be displayed")
    public void verifyEmployeeIsDisplayed(){Assert.assertTrue(homepage.employeeIsDisplayed());}
    @When("I click on Directory link")
    public void clickOnDirectoryLink(){
        homepage.clickOnDirectoryLink();
    }
    @When("I click on search text box")
    public void clickOnSearch(){homepage.clickOnSearchTextBox();}
    @And("I fill the search input with {string}")
    public void fillSearch(String search){homepage.setSearch(search);}
    @Then("The menu should show jus Directory")
    public void directoryIsDisplayed(){
        Assert.assertTrue(homepage.directoryIsDisplayed());
    }
    @When("I click on link logo")
    public void clickOnLogo(){homepage.clickOnLogo();}
    @Then("we should be in about page")
    public void verifyWeAreInAboutPage(){aboutPage.elementIsDisplayed();}
}
