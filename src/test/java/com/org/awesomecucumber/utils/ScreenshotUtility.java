package com.org.awesomecucumber.utils;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

import java.io.ByteArrayInputStream;

public class ScreenshotUtility {
    @Attachment(value = "Page screenshot", type = "image/png")
    public static void placeScreenShotInAllureReport(WebDriver driver, String scenarioName) {
        byte[] expected = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        Allure.addAttachment(scenarioName, new ByteArrayInputStream(expected));
    }
}