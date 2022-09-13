package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DirectoryPage {
    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/div[1]/div")
    WebElement employeeCard;

    public DirectoryPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public boolean verifyEmployeeIsDisplayed(String employee) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(employeeCard));
        Thread.sleep(3000);
        WebElement productLink = driver.findElement(By.xpath("//p[contains(string(),'"+employee+"')]"));
        return productLink.isDisplayed();
    }
}
