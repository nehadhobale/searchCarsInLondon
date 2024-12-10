package com.tektome.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {
    WebDriver driver;

    public GoogleSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    //Locators for search bar and search text
    private By search = By.xpath("//textarea[@id='APjFqb']");
    private By searchTextBox = By.xpath("//div[@id='jZ2SBf']");

    /**
     * Performs a Google search using the specified search text.
     * <p>
     * This method navigates to the Google homepage, maximizes the browser window,
     * inputs the specified search text into the search bar, and initiates the search.
     * </p>
     * @param searchText the text to be searched on Google
     */
    public void doGoogleSearch(String searchText) {
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.findElement(search).sendKeys(searchText);
        driver.findElement(searchTextBox).click();
    }
}
