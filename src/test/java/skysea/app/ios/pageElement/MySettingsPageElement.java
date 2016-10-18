package skysea.app.ios.pageElement;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * Created by ctrip on 16/9/30.
 */
public class MySettingsPageElement {
    //点击"我" 进入设置主页
    //个人信息TableCell
    public static final String PersonalInfo_TableCell_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]";
    //我的二维码TableCell
    public static final String MyQRCode_TableCell_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[2]";
    //我的账单TableCell
    public static final String MyBill_TableCell_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[3]";
    //我的日程TableCell
    public static final String MyScheduleAgenda_TableCell_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[4]";
    //问题与反馈TableCell
    public static final String QuestionsAndFeedback_TableCell_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[5]";
    //设置TableCell
    public static final String Settings_TableCell_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[6]";
    //关于TableCell
    public static final String About_TableCell_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[7]";


    //"个人信息"页面
    public static final String PersonalInfo_NickName_TextField_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[4]/UIATextField[1]";
    public static final String PersonalInfo_NickName_ModifyTextField_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIATextField[1]";
    public static final String PersonalInfo_NickName_DeleteButton_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[3]";
    public static final String PersonalInfo_NickName_Sava_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[2]";
    public static final String PersonalInfo_PhoneNumber_TextField_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[5]/UIATextField[1]";
    public static final String PersonalInfo_Signature_TextField_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[7]/UIATextField[1]";
    public static final String PersonalInfo_AgeAndConstellation_TableCell_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[8]";
    public static final String PersonalInfo_Age_TextField_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIATextField[3]";
    public static final String PersonalInfo_City_TableCell_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[9]";
    public static final String PersonalInfo_City_Save_Button_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[2]";
    public static final String PersonalInfo_City_TextField_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIATextField[1]";
    public static final String PersonalInfo_Hobby_TableCell_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[10]";
    public static final String PersonalInfo_HobbyList_Button_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[i]";
    public static final String PersonalInfo_Hooby_Save_Button_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[2]";
    public static final String PersonalInfo_GoBack_Button_Id = "phonebook back";

    //我的二维码
    public static final String MyQRCode_Image_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIAImage[2]";
    public static final String MyQRCode_text_xoath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAStaticText[1]";
    public static final String MyQRCode_Goback_Button_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[2]";


    //我的账单
    public static final String MyBill_Text_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAStaticText[1]";
    public static final String MyBill_Goback_Button_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[2]";

    //我的日程
    public static final String MySchedule_NoScheduleText_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[4]/UIAStaticText[2]";
    public static final String MySchedule_Text_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAStaticText[1]";
    public static final String MySchedule_NoSchedule_ViewTodayActivityButton_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[1]";
    public static final String MySchedule_GoBack_Button_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[2]";

    //问题与反馈
    public static final String QuestionsAndFeedback_Goback_Button_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[2]";
    public static final String QuestionsAndFeedback_Text_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAStaticText[1]";
    public static final String QuestionsAndFeedback_SendButton_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[3]";
    public static final String QuestionsAndFeedback_TextView_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIATextView[1]";

    //"设置"页面
    public static final String Settings_Text_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAStaticText[1]";
    public static final String Settings_Voice_Switch_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[2]/UIASwitch[1]";
    public static final String Settings_Shake_Switch_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[3]/UIASwitch[1]";
    public static final String Settings_Disturbance_Switch_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[4]/UIASwitch[1]";
    public static final String Settings_AllowOtherPessageSearchMe_Switch_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[6]/UIASwitch[1]";
    public static final String Settings_AllowFriendSeeMe_Switch_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[7]/UIASwitch[1]";
    public static final String Settings_ModifyPassword_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[8]";
    public static final String Settings_BlackList_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[9]";
    public static final String Settings_Logout_Button_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[10]/UIAButton[1]";
    public static final String Settings_GoBack_Button_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[2]";

    //关于页面
    public static final String About_GoBack_Button = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[2]";
    public static final String About_Text_Apath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAStaticText[1]";
    public static final String About_ImageIcon_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIAImage[1]";
    public static final String About_Help_Text_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[3]";





}
