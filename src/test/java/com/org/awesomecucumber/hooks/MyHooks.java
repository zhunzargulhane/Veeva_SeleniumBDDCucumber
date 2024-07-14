package com.org.awesomecucumber.hooks;

import com.org.awesomecucumber.context.TestContext;
import com.org.awesomecucumber.factory.DriverManagerFactory;
import com.org.awesomecucumber.utils.ScreenshotUtility;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestResult;
import org.testng.Reporter;


public class MyHooks {
    private static final Logger logger = LogManager.getLogger(MyHooks.class);
    public TestContext testContext;

    public MyHooks(TestContext testContext) {
        this.testContext = testContext;
    }

    @Before
    public void setup(Scenario scenario) {
        String browser = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser");
        //String browser = System.getProperty("browser", "CHROME");
        logger.info("BEFORE THREAD ID" + Thread.currentThread().getName() + "," + " " + scenario.getName());
        testContext.driver = DriverManagerFactory.getManager(browser).createDriver();
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            ScreenshotUtility.placeScreenShotInAllureReport(testContext.driver, scenario.getName());
        }
        logger.info("AFTER THREAD ID" + Thread.currentThread().getName() + "," + scenario.getName());
        testContext.driver.quit();
    }
}
