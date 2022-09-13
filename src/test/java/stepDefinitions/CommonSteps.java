package stepDefinitions;

import io.cucumber.java.en.Given;
import utilities.DriverManager;

public class CommonSteps {
    @Given("Im in orange demo web page")
    public void goToSauceDemoPage(){
        DriverManager.getDriver().driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        DriverManager.getDriver().driver.manage().window().maximize();
    }
}
