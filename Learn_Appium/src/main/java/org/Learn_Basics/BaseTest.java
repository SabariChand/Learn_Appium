package org.Learn_Basics;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest

{
    public AndroidDriver driver;

    @BeforeClass
    public void ConfigureAppium() throws MalformedURLException
    {

        UiAutomator2Options options = new UiAutomator2Options();

        options.setDeviceName("SabariPhone");

        options.setApp("C://Users//Sabari Nathan//Documents//JAVA-APPIUM//APKFiles//resources//ApiDemos-debug.apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);

    }
    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
