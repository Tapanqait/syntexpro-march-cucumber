package com.syntexpro.cucumber.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PharmacyStepdefinitions {

    private WebDriver driver;

    @Given("browse the costco websites")
    public void browseWebsite() {
        driver = new ChromeDriver();
        driver.get("https://www.costco.com/");
        driver.manage().window().maximize();
    }

    @When("click on the pharmacy tab")
    public void click_on_the_pharmacy_tab() {
        driver.findElement(By.linkText("Pharmacy")).click();
    }

    @Then("pharmacy page display")
    public void pharmacy_page_display() {
        System.out.println(driver.getTitle());
        assertEquals("Welcome to Costco Pharmacy", driver.getTitle());
        driver.close();
    }

    @Then("close the browser")
    public void close_the_browser() {
        driver.quit();
    }
}
