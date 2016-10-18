package skysea.app.ios.pageElement;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * Created by ctrip on 16/9/23.
 */
public class messagePageElement {

    //消息 segmentedControl
    public static final String MessageButton_Id = "消息";
    public static final String MessageButton_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIASegmentedControl[1]/UIAButton[1]";
    //通话 segmentControl
    public static final String Call_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIASegmentedControl[1]/UIAButton[2]";
    //添加 +
    public static final String AddButton_id = "Button";
    public static final String AddButton_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[2]";

    //点击+ -->拨打电话
    public static final String MakeCall_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[2]/UIATableCell[1]";
    //点击+ -->发起群聊
    public static final String LaunchGroupChat_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[2]/UIATableCell[2]";

    //点击+ -->添加好友
    public static final String AddFriend_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[2]/UIATableCell[3]";
    public static final String PhoneBookBack_Id = "phonebook back";
    public static final String GoBack_Button_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[2]";
    //天海邮友
    public static final String SkyseaCruiseFriendButton_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[3]";
    public static final String FriendTableGroupB_Id = "B";
    public static final String FriendTableGroupB_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableGroup[1]";
    public static final String FriendTableCellB_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]/UIAButton[1]";
    public static final String AddToContactBook_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[4]/UIAButton[1]";
    public static final String AddFriendReasonTextField_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIATextField[1]";
    public static final String SendButton_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[2]";
    //俱乐部
    public static final String ClubButton_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[4]";
    public static final String Club_SelectFirstClub_Button_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]/UIAButton[1]";
    public static final String Club_ApplyJoin_Button_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[1]";
    public static final String Club_TelephoneBook_Button_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[2]";
    public static final String Club_DeleteAndExit_Button_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[3]/UIAButton[1]";
    public static final String Club_DeleteConfirm_Button_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[2]";
    public static final String Club_GoBack_Button_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[4]";

    //创建群
    public static final String CreateGroup_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[5]";
    public static final String CreateGroup_Cancel_Button_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[2]";
    public static final String CreateFroup_Confirm_Button_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[3]";
    public static final String CreateGroup_SelectFirstFriend_Button_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]/UIAButton[1]";
    public static final String CreateGroup_GoBack_Button_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[4]";
    public static final String CreateGroup_TelephoneBook_Button_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[2]";
    public static final String CreateGroup_DismissGroup_Button_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[6]/UIAButton[1]";
    public static final String CreateGroup_DismissGroup_ConfirmButton_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[2]";

    //点击+ -->扫一扫
    public static final String ScanCode_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[2]/UIATableCell[4]";



    //底部TabBar：消息、通讯录、今日活动、设施服务、我
    public static final String MessgeFooterTabBar_Button_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIAImage[1]/UIAButton[1]";
    public static final String ContactBookFooterTabBar_Button_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIAImage[1]/UIAButton[2]";
    public static final String TodayActivityFooterTabBar_Button_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIAImage[1]/UIAButton[3]";
    public static final String FacilityServiceFooterTabBar_Button_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIAImage[1]/UIAButton[4]";
    public static final String MeFooterTabBar_Button_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIAImage[1]/UIAButton[5]";


    //Chat
    public static final String Chat_FirstFriendinMessageList_TableCell_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]";
    public static final String Chat_GoBack_Button_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[4]";
    public static final String Chat_VoiceButton_Id = "message session voice";
    public static final String Chat_EmotionButton_Id = "message session expression";
    public static final String Chat_TextField_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIAImage[2]/UIATextView[1]";
    public static final String Chat_VoiceButton_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIAImage[2]/UIAButton[1]";
    public static final String Chat_EmotionButton_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIAImage[2]/UIAButton[2]";
    //public static final String Chat_TextButton_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIAImage[2]/UIAButton[1]";
    public static final String Chat_HoldOn_Button_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIAImage[2]/UIAButton[2]";
    public static final String Chat_FirstEmotion_Button_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[1]";
    public static final String Chat_FirstEmotion_Button_Id = "emotion 0";
    public static final String Chat_EmotionSendButton_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[4]";
    public static final String Chat_TextButton_Xpath = "//UIAApplication[1]/UIAWindow[1]/UIAImage[2]/UIAButton[1]";
    public static final String Chat_TextSendButton_Xpath = "//UIAApplication[1]/UIAWindow[2]/UIAKeyboard[1]/UIAButton[4]";





}
