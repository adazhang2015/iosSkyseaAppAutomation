package skysea.app.ios;

import skysea.app.ios.util.appiumHelp;
import skysea.app.ios.pageElement.loginPageElement;

import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.JavascriptExecutor;



import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.openqa.selenium.By;


/**
 * Created by ctrip on 16/9/19.
 */
public class example {
    private AppiumDriver wd;


    //set up appium
    @BeforeTest
    public void setUp() throws Exception {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium-version", "1.0");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "8.4");
        capabilities.setCapability("deviceName", "iPhone 6");
        capabilities.setCapability("udid","95b12e4c905372160bde1fff73ea2d8e7de897f3");
        //use iphone
        capabilities.setCapability("app","com.skysea.SkySea");
        //capabilities.setCapability("app","/private/var/mobile/Containers/Bundle/Application/123F22BB-CF3F-47CC-B5FA-DDE30D81FE9D/SkySea.app");
        //capabilities.setCapability("app", "/Users/ctrip/Library/Developer/Xcode/DerivedData/SkySea-gjyzlculbdhnjncoawtxlckiptgm/Build/Products/Debug-iphonesimulator/SkySea.app");
        wd = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Test
    public void test(){



        //login page, input account and password,then click login button
        /*WebElement lgn1 = wd.findElementByXPath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[1]");
        lgn1.click();
        WebElement text1 = wd.findElementByXPath("//UIAApplication[1]/UIAWindow[1]/UIATextField[1]");
        text1.sendKeys("00008801");
        WebElement text2 = wd.findElementByXPath("//UIAApplication[1]/UIAWindow[1]/UIASecureTextField[1]");
        text2.sendKeys("123456");*/
        WebElement lgn2 = wd.findElementById(loginPageElement.LoginPage_LoginButton_Id);
        lgn2.click();

    }



    //tear down appium
    @AfterTest
    public void tearDown() throws  Exception {
        wd.quit();

    }
}
