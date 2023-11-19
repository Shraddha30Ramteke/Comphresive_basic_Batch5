package Packag_comp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.Assert;
import org.testng.annotations.*;

public class Comphre_class1 {

          WebDriver driver;

            @BeforeClass
            public void setUp() {
                System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
                driver = new ChromeDriver();
                driver.get("https://autify.com/");
            }
       
            // ...

                @AfterClass
                public void tearDown() {
                    // Close the WebDriver after tests are finished
                    if (driver != null) {
                        driver.quit();
                    }
                }

                @DataProvider(name = "pageLinks")
                public Object[][] pageLinksData() {
                    return new Object[][] {
                       {"Why Autify", "Why Autify"},
                        {"Pricing", "Pricing"},
                       {"Webinars", "Webinars"},
                        {"Guide", "Guide"}
                    };
                }

                @Test(dataProvider = "pageLinks")
                public void testPageLinks(String linkText, String expectedTitle) {
                	if (linkText =="Guide")
                		
                	{
                		driver.findElement(By.xpath("//a[contains(text(), 'Resources')]")).click();
                		driver.findElement(By.xpath("//*[@id=\"menu-item-3649\"]/a")).click();
                		
                	}
                	
                	else {
                		 driver.findElement(By.xpath("//a[contains(text(), '" + linkText + "')]")).click();
                	}
                    // Click on the link with the given text
                   // driver.findElement(By.xpath("//a[contains(text(), '" + linkText + "')]")).click();
                    // Verify the page title
                    String actualTitle = driver.getTitle();
                    Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match expected title.");
                }
            }
