package com.tektome.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResultPage {
    WebDriver driver;

    public SearchResultPage(WebDriver driver){
        this.driver=driver;
    }

    //Locators for links
    private By allLink = By.xpath("//a[@href]");

    /**
     * Retrieves all web elements matching the specified locator for links.
     * This method finds and returns a list of web elements that match the locator
     * defined by the `allLink` variable. These elements can be used for further
     * verification or interaction.
     * @return a list of {@link WebElement} representing the links to verify.
     */

    public List<WebElement> getLinksToVerify(){

        return driver.findElements(allLink);
    }

}
