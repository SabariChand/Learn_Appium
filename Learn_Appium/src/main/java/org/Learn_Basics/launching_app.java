package org.Learn_Basics;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class launching_app extends BaseTest

{
    @Test
    public void AppiumTest() throws MalformedURLException {

        //Code to start the Appium server

       /* AppiumDriverLocalService service = new AppiumServiceBuilder()
                .withAppiumJS(new File("C://Users//Sabari Nathan//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
                .withIPAddress("127.0.0.1").usingPort(4723).build();
        service.start();*/

        //Android driver
        //Appium code -> Appium server -> Mobile

        driver.findElement(AppiumBy.accessibilityId("Preference")).click();
        //service.stop();

        //Actual Automation


    }
}
