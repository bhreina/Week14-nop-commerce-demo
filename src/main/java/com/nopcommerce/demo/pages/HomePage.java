package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//img[@alt='nopCommerce demo store']")
    WebElement logo;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computersMenu;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']")
    WebElement electronicsMenu;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']")
    WebElement apparelMenu;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Digital downloads']")
    WebElement digitalDownloadsMenu;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Books']")
    WebElement booksMenu;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Jewelry']")
    WebElement jewelry;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Gift Cards']")
    WebElement giftCardsMenu;
    @CacheLookup
    @FindBy(xpath = "//a[@class='ico-login']")
    WebElement loginLinkHomePage;
    @CacheLookup
    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement registerLink;
    @CacheLookup
    @FindBy(xpath = "//a[@class='ico-logout']")
    WebElement logoutLink;
    @CacheLookup
    @FindBy(xpath = "//a[@title='Show products in category Desktops'][normalize-space()='Desktops']")
    WebElement desktopsLink;

    // Defining Methods
    public void isLogoutLinkDisplayed() { // Method to verify that logout link is displayed
        verifyThatElementIsDisplayed(logoutLink);
    }

    public void clickingOnTheLogoutLink() { // Method to click on logout link
        clickOnElement(logoutLink);
    }

    public void clickingOnLoginLinkFromTheHomePage() { // Method to click on the login link from home page
        clickOnElement(loginLinkHomePage);
    }


    public void isLoginLinkDisplayed() {
        WebElement link = driver.findElement(By.xpath("//a[@class='ico-login']"));
        boolean isEnabled = link.isEnabled();
    }

    public void clickingOnRegisterLink() { // Method to click on register link
        clickOnElement(registerLink);
    }

    public void clickingOnComputersMenu() { // Method to click on computers menu
        clickOnElement(computersMenu);
    }

    public void clickingOnDesktopsLink() { // Method to click on desktops link
        clickOnElement(desktopsLink);
    }
}
