package skysea.app.ios.util;

import io.appium.java_client.AppiumDriver;

import java.util.Random;

/**
 * Created by ctrip on 16/9/21.
 */
public class appiumHelp {

    //define swipe right to left
    public  static void swipeRightToLeft(AppiumDriver driver, int during) throws Exception{
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        driver.swipe(width*3/4,height/2,width/4,height/2,during);
    }

    //define random strings，only contains digits and alph
    public static String GetrandomString(int s_length) throws Exception {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        String str = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0;i<s_length;i++) {
            int number = random.nextInt(str.length());
            stringBuilder.append(str.charAt(number));
        }
        return stringBuilder.toString();
    }

    public static void tapPoint(AppiumDriver driver,int x,int y) throws Exception {
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        driver.tap(1,x*width/height,y*width/height,0);
    }

    public static String GetPackageName(Class c){
        String userDir = c.getPackage().getName().substring(c.getPackage().getName().lastIndexOf(".")+1);
        return userDir;
    }


}
