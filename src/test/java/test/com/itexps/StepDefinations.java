/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com.itexps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author RANGANI2
 */
public class StepDefinations {
   
    private static WebDriver driver;
    private String baseUrl = "https://www.costco.com";

    @Given("^the user is on Costco home page$")
    public void the_user_is_on_Costco_home_page() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^title of home page is Costco Wholesale$")
    public void title_of_home_page_is_Costco_Wholesale() throws Throwable {
        try{
            assertEquals("Costco Wholsale", driver.getTitle());
        } catch (Error e) {
            System.out.println(e.toString());
        }
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^user enters Paper Towel in search bar$")
    public void user_enters_Paper_Towel_in_search_bar() throws Throwable {
        driver.findElement(By.id("search-field")).click();
        driver.findElement(By.id("search-field")).clear();
        driver.findElement(By.id("search-field")).sendKeys("Paper Towels");
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    }

    @Then("^user submits the data$")
    public void user_submits_the_data() throws Throwable {
        driver.findElement(By.id("search-field")).submit();
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^user is on SearchResult page$")
    public void user_is_on_SearchResult_page() throws Throwable {
        try{
            assertEquals("Results for Paper Towel", driver.getTitle());
        } catch (Error e) {
            System.out.println(e.toString());
        }
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    } 
}
