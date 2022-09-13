package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    WebDriver driver;

    @FindBy(className = "oxd-topbar-header")
    WebElement appLogo;
    @FindBy(xpath = "//label[text()='Employee Name']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']/div/div/div/input")
    WebElement employeeID;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")
    WebElement searchButton;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div")
    WebElement employee;
    @FindBy(xpath = " //label[text()='Supervisor Name']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']/div/div/div/input")
    WebElement supervisorName;
    @FindBy(xpath = " //label[text()='Employee Name']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']/div/div/div/input")
    WebElement employeeName;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[9]/a")
    WebElement directoryLink;
    @FindBy(className = "oxd-userdropdown")
    WebElement optionsDropDown;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")
    WebElement logoutLink;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/div/div/input")
    WebElement searchMenu;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li/a")
    WebElement directoryLinkSearched;
    @FindBy(className = "oxd-brand-banner")
    WebElement logo;

    public HomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public boolean topBarIsDisplayed() {
        boolean appLogoIsDisplayed = appLogo.isDisplayed();
        return appLogoIsDisplayed;
    }

    public void setEmployeeID(String id){
        employeeID.sendKeys(id);
    }
    public void clickOnSearchButton(){
        searchButton.click();
    }
    public boolean employeeIsDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(employee));
        boolean bool = employee.isDisplayed();
        return bool;
    }
    public void setSupervisorName(String sName){
        supervisorName.sendKeys(sName);
    }
    public void setEmployeeName(String sName){
        supervisorName.sendKeys(sName);
    }
    public void clickOnDirectoryLink(){

        directoryLink.click();
    }

    /**
    public void selectOption(String element){
        Select selectOption = new Select(optionsDropDown);
        selectOption.selectByVisibleText(element);
    }

     **/
    public void clickOnOptionsDropDown(){
        optionsDropDown.click();
    }
    public void clickOnLogoutLink(){
        logoutLink.click();
    }

    public void clickOnSearchTextBox(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(searchMenu));
        searchMenu.click();
    }
    public void setSearch(String search){
        searchMenu.sendKeys(search);
    }
    public boolean directoryIsDisplayed(){
        boolean bool = directoryLinkSearched.isDisplayed();
        return bool;
    }
    public void clickOnLogo(){
        logo.click();
    }



}
