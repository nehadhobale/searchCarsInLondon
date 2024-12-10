package com.tektome.testCases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SearchLinkTest extends BaseTest {

    @Test
    public void verify_gumTreeLink_functionality() {

        // Perform google search by using "Cars in London" text
        googleSearch.doGoogleSearch("Cars in London");

        // Retrieve search result link
        List<WebElement> links = searchResult.getLinksToVerify();
        String originalTab = driver.getWindowHandle();
        int gumtreeCounter = 0;

        //Iterate Through the Links and checking if the Link Contains "gumtree.com" or not
        for (WebElement link : links) {
            String url = link.getAttribute("href");
            if (url.contains("gumtree.com")) {
                gumtreeCounter++;
                driver.switchTo().newWindow(WindowType.TAB);
                driver.get(url);
                Assert.assertTrue(driver.getTitle().contains("Gumtree"), "Gumtree title is not matching");
                driver.close();
                driver.switchTo().window(originalTab);
            }
        }
        // Verify Gumtree Links Exist
        Assert.assertTrue(gumtreeCounter > 0, "No Gumtree links");
    }


}
