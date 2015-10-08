/**
 * 
 */
package com.hello.seleniumtests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author User
 *
 */
public class SeleniumTest
  {

    private static WebDriver driver;

    @BeforeClass
    public static void initWebDriver()
      {
        driver = new FirefoxDriver();
      }

    @AfterClass
    public static void tearUp()
      {
        if (driver != null)
          {
            driver.close();
            driver.quit();
            driver = null;
          }
      }

    @Test
    public void seleniumTest()
      {
        driver.get("https://www.google.com/");
        driver.findElement(By.id("gs_lc0")).sendKeys("Hi");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        //System.out.println("Title : " + driver.getTitle());
        //Assert.assertTrue(driver.getTitle().contains("hi - Google Search"), "Title doesnot exists");

      }

  }
