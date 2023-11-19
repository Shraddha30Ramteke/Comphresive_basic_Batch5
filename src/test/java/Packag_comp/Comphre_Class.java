package Packag_comp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Comphre_Class {

	
	WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://autify.com/");
    }

    @Test
    public void verifyLinks() {
        String[] links = {"Why Autify", "Pricing", "Webinars", "Resources"};

        for (String linkText : links) {
            WebElement link = driver.findElement(By.linkText(linkText));
            assert link.isDisplayed() : linkText + " link is not displayed.";
        }
    }

    @Test
    public void verifyButtons() {
        String[] buttons = {"Start Free Trial", "Sign In"};

        for (String buttonText : buttons) {
            WebElement button = driver.findElement(By.xpath("/html/body/div[5]/nav/div/div[2]/div[2]/div/div/div[2]/a"));
                       assert button.isEnabled() : buttonText + " button is not enabled.";
        }
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

	
	
	
}
