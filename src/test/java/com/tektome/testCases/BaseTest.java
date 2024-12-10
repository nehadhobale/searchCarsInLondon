package com.tektome.testCases;


import com.tektome.pages.GoogleSearchPage;
import com.tektome.pages.SearchResultPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import java.time.Duration;

public class BaseTest {

    public WebDriver driver;
    GoogleSearchPage googleSearch;
    SearchResultPage searchResult;

    @BeforeSuite
public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        googleSearch = new GoogleSearchPage(driver);
        searchResult = new SearchResultPage(driver);
    }

    @AfterSuite
    public void cleanUp(){driver.quit();}
}
