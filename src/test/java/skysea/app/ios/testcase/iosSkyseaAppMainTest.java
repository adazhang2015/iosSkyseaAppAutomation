package skysea.app.ios.testcase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.IOSKeyCode;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import skysea.app.ios.pageElement.MySettingsPageElement;
import skysea.app.ios.pageElement.facilityServicePageElement;
import skysea.app.ios.pageElement.loginPageElement;
import skysea.app.ios.pageElement.messagePageElement;
import skysea.app.ios.util.CaseEntity;
import skysea.app.ios.util.appiumHelp;
import skysea.app.ios.util.DBHelper;

import java.net.URL;
import java.rmi.server.ExportException;
import java.util.concurrent.TimeUnit;

/**
 * Created by ctrip on 16/9/29.
 */
public class iosSkyseaAppMainTest {
    private AppiumDriver iosDriver;
    private CaseEntity entity = new CaseEntity();

    //初始化webdriver并登录app
    @BeforeTest
    public void setUp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium-version", "1.0");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "8.4");
        capabilities.setCapability("deviceName", "iPhone 6");
        capabilities.setCapability("udid","95b12e4c905372160bde1fff73ea2d8e7de897f3");
        capabilities.setCapability("app","com.skysea.SkySea");
        capabilities.setCapability("unicodeKeyboard","True");
        capabilities.setCapability("resetKeyboard","True");
        iosDriver = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        iosDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Thread.sleep(1000);
        iosDriver.findElementByXPath(loginPageElement.LoginPage_LoginButton_Xpath).click();
        Thread.sleep(1000);
    }

    //退出app并退出appiumDriver
    @AfterTest
    public void tearDown() throws Exception {
        Restore();
        iosDriver.findElementByXPath(messagePageElement.MeFooterTabBar_Button_Xpath).click();
        iosDriver.findElementByXPath(MySettingsPageElement.Settings_TableCell_Xpath).click();
        iosDriver.findElementByXPath(MySettingsPageElement.Settings_Logout_Button_Xpath).click();
        iosDriver.quit();
        System.out.print("Test Completed");
    }


    public void Restore() throws Exception {
        iosDriver.closeApp();
        iosDriver.launchApp();
        Thread.sleep(1000);
    }


    //"消息"：添加好友-->天海邮友
    //做完操作后，返回消息Tab主页面
    @Test
    public void MessagePageAddCruiseFriendsTest() throws Exception {
        int id = DBHelper.InsertResult(entity);
        Restore();
        iosDriver.findElementByXPath(messagePageElement.MessgeFooterTabBar_Button_Xpath).click();
        //天海邮友
        iosDriver.findElementById(messagePageElement.AddButton_id).click();
        iosDriver.findElementByXPath(messagePageElement.AddFriend_Xpath).click();
        iosDriver.findElementByXPath(messagePageElement.SkyseaCruiseFriendButton_Xpath).click();
        iosDriver.findElementByXPath(messagePageElement.FriendTableCellB_Xpath).click();
        iosDriver.findElementByXPath(messagePageElement.AddToContactBook_Xpath).click();
        iosDriver.findElementByXPath(messagePageElement.SendButton_Xpath).click();
        Thread.sleep(5000);
        iosDriver.findElementByXPath(messagePageElement.GoBack_Button_Xpath).click();
        iosDriver.findElementByXPath(messagePageElement.GoBack_Button_Xpath).click();
        if(id>0) {
            DBHelper.UpdateDB(id);
        }

    }

    //消息：添加好友 ->创建群
    @Test
    public void MessagePageCreateGroupTest() throws Exception {
        int id = DBHelper.InsertResult(entity);
        Restore();
        iosDriver.findElementByXPath(messagePageElement.MessgeFooterTabBar_Button_Xpath).click();
        //创建群,并退出群
        iosDriver.findElementById(messagePageElement.AddButton_id).click();
        iosDriver.findElementByXPath(messagePageElement.AddFriend_Xpath).click();
        iosDriver.findElementByXPath(messagePageElement.CreateGroup_Xpath).click();
        iosDriver.findElementByXPath(messagePageElement.CreateGroup_SelectFirstFriend_Button_Xpath).click();
        iosDriver.findElementByXPath(messagePageElement.CreateFroup_Confirm_Button_Xpath).click();
        iosDriver.findElementByXPath(messagePageElement.CreateGroup_TelephoneBook_Button_Xpath).click();
        iosDriver.findElementByXPath(messagePageElement.CreateGroup_DismissGroup_Button_Xpath).click();
        iosDriver.findElementByXPath(messagePageElement.CreateGroup_DismissGroup_ConfirmButton_Xpath).click();
        if(id>0) {
            DBHelper.UpdateDB(id);
        }
    }

    //消息：添加好友->俱乐部
    @Test
    public void MessagePageJoinAndExitClubTest() throws Exception {
        int id = DBHelper.InsertResult(entity);
        Restore();
        iosDriver.findElementByXPath(messagePageElement.MessgeFooterTabBar_Button_Xpath).click();
        //俱乐部:先申请加入再删除退出俱乐部
        iosDriver.findElementById(messagePageElement.AddButton_id).click();
        iosDriver.findElementByXPath(messagePageElement.AddFriend_Xpath).click();
        iosDriver.findElementByXPath(messagePageElement.ClubButton_Xpath).click();
        iosDriver.findElementByXPath(messagePageElement.Club_SelectFirstClub_Button_Xpath).click();
        iosDriver.findElementByXPath(messagePageElement.Club_ApplyJoin_Button_Xpath).click();
        iosDriver.findElementByXPath(messagePageElement.Club_TelephoneBook_Button_Xpath).click();
        iosDriver.findElementByXPath(messagePageElement.Club_DeleteAndExit_Button_Xpath).click();
        iosDriver.findElementByXPath(messagePageElement.Club_DeleteConfirm_Button_Xpath).click();
        if(id>0) {
            DBHelper.UpdateDB(id);
        }

    }




    //"我"：个人信息 -->我的二维码 -->我的账单 -->我的日程 -->问题与反馈 -->设置 -->关于
    //做完操作后，返回消息Tab主页面
    //我的个人信息
    @Test
    public void MeMyPersonalInfoTest() throws Exception {
        int id = DBHelper.InsertResult(entity);
        Restore();
        iosDriver.findElementByXPath(messagePageElement.MeFooterTabBar_Button_Xpath).click();
        iosDriver.findElementByXPath(MySettingsPageElement.PersonalInfo_TableCell_Xpath).click();
        //修改昵称
        iosDriver.findElementByXPath(MySettingsPageElement.PersonalInfo_NickName_TextField_Xpath).click();
        Thread.sleep(2000);
        iosDriver.findElementByXPath(MySettingsPageElement.PersonalInfo_NickName_DeleteButton_Xpath).click();
        String name = appiumHelp.GetrandomString(6);
        iosDriver.findElementByXPath(MySettingsPageElement.PersonalInfo_NickName_ModifyTextField_Xpath).sendKeys(name);
        iosDriver.findElementByXPath(MySettingsPageElement.PersonalInfo_NickName_Sava_Xpath).click();

        //返回到我主页
        iosDriver.findElementById(MySettingsPageElement.PersonalInfo_GoBack_Button_Id).click();
        if(id>0) {
            DBHelper.UpdateDB(id);
        }

    }

    //我的二维码
    @Test
    public void MeMyQRCodeTest() throws Exception {
        int id = DBHelper.InsertResult(entity);
        Restore();
        iosDriver.findElementByXPath(messagePageElement.MeFooterTabBar_Button_Xpath).click();
        iosDriver.findElementByXPath(MySettingsPageElement.MyQRCode_TableCell_Xpath).click();
        Assert.assertEquals(iosDriver.findElementByXPath(MySettingsPageElement.MyQRCode_text_xoath).getText(),"我的二维码");
        Assert.assertTrue(iosDriver.findElementByXPath(MySettingsPageElement.MyQRCode_Image_Xpath).isDisplayed());
        Thread.sleep(2000);
        iosDriver.findElementByXPath(MySettingsPageElement.MyQRCode_Goback_Button_Xpath).click();
        if(id>0) {
            DBHelper.UpdateDB(id);
        }

    }

    //我的账单
    @Test
    public void MeMyBillTest() throws Exception {
        int id = DBHelper.InsertResult(entity);
        Restore();
        iosDriver.findElementByXPath(messagePageElement.MeFooterTabBar_Button_Xpath).click();
        iosDriver.findElementByXPath(MySettingsPageElement.MyBill_TableCell_Xpath).click();
        Assert.assertEquals(iosDriver.findElementByXPath(MySettingsPageElement.MyBill_Text_Xpath).getText(),"我的账单");
        Thread.sleep(2000);
        iosDriver.findElementByXPath(MySettingsPageElement.MyBill_Goback_Button_Xpath).click();
        if(id>0) {
            DBHelper.UpdateDB(id);
        }
    }

    //我的日程
    @Test
    public void MeMyTodayScheduleTest() throws Exception {
        int id = DBHelper.InsertResult(entity);
        Restore();
        iosDriver.findElementByXPath(messagePageElement.MeFooterTabBar_Button_Xpath).click();
        if(iosDriver.findElementByXPath(MySettingsPageElement.MySchedule_NoScheduleText_Xpath).getText().equalsIgnoreCase("您还没有添加行程呢"))
        {
            iosDriver.findElementByXPath(MySettingsPageElement.MyScheduleAgenda_TableCell_Xpath).click();
            Assert.assertEquals(iosDriver.findElementByXPath(MySettingsPageElement.MySchedule_Text_Xpath).getText(),"我的日程");
            Assert.assertTrue(iosDriver.findElementByXPath(MySettingsPageElement.MySchedule_NoSchedule_ViewTodayActivityButton_Xpath).isDisplayed());
        }
        else {
            iosDriver.findElementByXPath(MySettingsPageElement.MyScheduleAgenda_TableCell_Xpath).click();
            Assert.assertEquals(iosDriver.findElementByXPath(MySettingsPageElement.MySchedule_Text_Xpath).getText(),"我的日程");

        }

        iosDriver.findElementByXPath(MySettingsPageElement.MySchedule_GoBack_Button_Xpath).click();
        if(id>0) {
            DBHelper.UpdateDB(id);
        }

    }

    //问题与反馈
    @Test
    public void MeQuestionsAndFeedbackTest() throws Exception {
        int id = DBHelper.InsertResult(entity);
        Restore();
        iosDriver.findElementByXPath(messagePageElement.MeFooterTabBar_Button_Xpath).click();
        iosDriver.findElementByXPath(MySettingsPageElement.QuestionsAndFeedback_TableCell_Xpath).click();
        Assert.assertEquals(iosDriver.findElementByXPath(MySettingsPageElement.QuestionsAndFeedback_Text_Xpath).getText(),"问题与反馈");
        iosDriver.findElementByXPath(MySettingsPageElement.QuestionsAndFeedback_TextView_Xpath).sendKeys("test");
        Thread.sleep(2000);
        iosDriver.findElementByXPath(MySettingsPageElement.QuestionsAndFeedback_SendButton_Xpath).click();
        Thread.sleep(2000);
        if(id>0) {
            DBHelper.UpdateDB(id);
        }
    }

    //设置
    @Test
    public void MeMySettingsTest() throws Exception {
        int id = DBHelper.InsertResult(entity);
        Restore();
        iosDriver.findElementByXPath(messagePageElement.MeFooterTabBar_Button_Xpath).click();
        iosDriver.findElementByXPath(MySettingsPageElement.Settings_TableCell_Xpath).click();
        Assert.assertEquals(iosDriver.findElementByXPath(MySettingsPageElement.Settings_Text_Xpath).getText(),"设置");
        iosDriver.findElementByXPath(MySettingsPageElement.Settings_Voice_Switch_Xpath).click();
        iosDriver.findElementByXPath(MySettingsPageElement.Settings_Shake_Switch_Xpath).click();
        //勿扰先打开再关闭，否则影响其他的xpath
        iosDriver.findElementByXPath(MySettingsPageElement.Settings_Disturbance_Switch_Xpath).click();
        iosDriver.findElementByXPath(MySettingsPageElement.Settings_Disturbance_Switch_Xpath).click();
        iosDriver.findElementByXPath(MySettingsPageElement.Settings_AllowOtherPessageSearchMe_Switch_Xpath).click();
        iosDriver.findElementByXPath(MySettingsPageElement.Settings_AllowFriendSeeMe_Switch_Xpath).click();
        iosDriver.findElementByXPath(MySettingsPageElement.Settings_GoBack_Button_Xpath).click();
        if(id>0) {
            DBHelper.UpdateDB(id);
        }
    }

    //关于
    @Test
    public void MeAboutTest() throws Exception {
        int id = DBHelper.InsertResult(entity);
        Restore();
        iosDriver.findElementByXPath(messagePageElement.MeFooterTabBar_Button_Xpath).click();
        iosDriver.findElementByXPath(MySettingsPageElement.About_TableCell_Xpath).click();
        Assert.assertEquals(iosDriver.findElementByXPath(MySettingsPageElement.About_Text_Apath).getText(),"关于");
        Assert.assertTrue(iosDriver.findElementByXPath(MySettingsPageElement.About_ImageIcon_Xpath).isDisplayed());
        Assert.assertEquals(iosDriver.findElementByXPath(MySettingsPageElement.About_Help_Text_Xpath).getText(),"使用帮助");
        iosDriver.findElementByXPath((MySettingsPageElement.About_GoBack_Button)).click();
        if(id>0) {
            DBHelper.UpdateDB(id);
        }
    }

    //设施服务
    @Test
    public void FacilityAndServiceEntertainmentTest() throws Exception {
        int id = DBHelper.InsertResult(entity);
        Restore();
        iosDriver.findElementByXPath(messagePageElement.FacilityServiceFooterTabBar_Button_Xpath).click();
        Thread.sleep(2000);
        System.out.print(iosDriver.getPageSource());
        
        /*iosDriver.findElementByXPath(facilityServicePageElement.Entertainment_Enterance_Link_Xpath).click();
        Thread.sleep(2000);
        Assert.assertEquals(iosDriver.findElementByXPath(facilityServicePageElement.Entertainment_TitleText_Xpath).getText(),"娱乐设施");
        iosDriver.findElementByXPath(facilityServicePageElement.Entertainment_GoBack_Link_Xpath);

        iosDriver.findElementByXPath(facilityServicePageElement.SkyseaOdate_Entertrance_Link_Xpath).click();
        Assert.assertEquals(iosDriver.findElementByXPath(facilityServicePageElement.SkyseaOdate_TitleText_Xpath).getText(),"天海小馆");
        iosDriver.findElementByXPath(facilityServicePageElement.SkyseaOdate_Goback_Link_Xpath).click();

        iosDriver.findElementByXPath(facilityServicePageElement.DrugStore_Enterance_Link_Xpath).click();
        Assert.assertEquals(iosDriver.findElementByXPath(facilityServicePageElement.DrugStore_TitleText_Xpath).getText(),"药妆店");
        iosDriver.findElementByXPath(facilityServicePageElement.DrugStore_Goback_Link_Xpath).click();

        iosDriver.findElementByXPath(facilityServicePageElement.LuckyClub_Enterance_Link_Xpath).click();
        Assert.assertEquals(iosDriver.findElementByXPath(facilityServicePageElement.LuckyClub_TitleText_Link_Xpath).getText(),"幸运之星俱乐部");
        iosDriver.findElementByXPath(facilityServicePageElement.LuckyClub_Goback_Link_Xpath).click();*/


        iosDriver.tap(1,188,60,0);
        Assert.assertEquals(iosDriver.findElementByXPath(facilityServicePageElement.Entertainment_TitleText_Xpath).getText(),"娱乐设施");
        iosDriver.tap(1,10,22,0);

        iosDriver.tap(1,6,231,0);
        Assert.assertTrue(iosDriver.findElementByXPath(facilityServicePageElement.SkyseaOdate_TitleText_Xpath).getText().contains("食肆"));
        iosDriver.tap(1,10,22,0);

        //iosDriver.tap(1,188,231,0);
        //Assert.assertTrue(iosDriver.findElementByXPath(facilityServicePageElement.DrugStore_TitleText_Xpath).getText().contains("俱乐部"));
        //iosDriver.tap(1,10,22,0);

        Thread.sleep(2000);
        //设施服务点击消息Tab，恢复到app elementtree 初始的状态
        //iosDriver.tap(1,224,618,0);
        iosDriver.findElementByXPath(facilityServicePageElement.MessageFooterTab_Button_Xpath).click();
        if(id>0) {
            DBHelper.UpdateDB(id);
        }
    }

    //Chat
    @Test
    public void Chat() throws Exception {
        int id = DBHelper.InsertResult(entity);
        Restore();
        iosDriver.findElementByXPath(messagePageElement.Chat_FirstFriendinMessageList_TableCell_Xpath).click();
        //语音
        iosDriver.findElementByXPath(messagePageElement.Chat_VoiceButton_Xpath).click();
        TouchAction action = new TouchAction(iosDriver);
        action.longPress(iosDriver.findElementByXPath(messagePageElement.Chat_HoldOn_Button_Xpath)).waitAction(6000).perform();
        Thread.sleep(5000);
        //文本
        iosDriver.findElementByXPath(messagePageElement.Chat_TextButton_Xpath).click();
        String message = appiumHelp.GetrandomString(6);
        iosDriver.findElementByXPath(messagePageElement.Chat_TextField_Xpath).sendKeys(message);
        iosDriver.findElementByXPath(messagePageElement.Chat_TextSendButton_Xpath).click();
        //表情
        iosDriver.findElementByXPath(messagePageElement.Chat_EmotionButton_Xpath).click();
        iosDriver.findElementByXPath(messagePageElement.Chat_FirstEmotion_Button_Xpath).click();
        iosDriver.findElementByXPath(messagePageElement.Chat_EmotionSendButton_Xpath).click();

        //返回消息主页面
        iosDriver.findElementByXPath(messagePageElement.Chat_GoBack_Button_Xpath).click();
        if(id>0) {
            DBHelper.UpdateDB(id);
        }
    }

}
