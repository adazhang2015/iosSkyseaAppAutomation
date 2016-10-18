package skysea.app.ios.util;

import java.io.IOException;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;
import java.io.InputStream;


/**
 * Created by ctrip on 16/9/21.
 */
public class DBHelper {

    public static Connection conn = null;
    public static PreparedStatement pst = null;
    private static Properties prop = new Properties();
    private static ResultSet rs = null;
    private static InputStream fis;

    public static boolean LoadFile () {

        try
        {

            //prop.load(DBHelper.class.getResourceAsStream(fileName));

            fis = DBHelper.class.getClassLoader().getResourceAsStream("./dbconfig.properties");
            prop.load(fis);
        }catch (IOException e) {
            e.printStackTrace();
            return false;
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }


    public static Connection GetConnection() throws ClassNotFoundException,SQLException {
        Connection conn = null;
        try {
            LoadFile();
            String driver = prop.getProperty("driver");
            String url = prop.getProperty("url");
            String user = prop.getProperty("user");
            String pwd = prop.getProperty("pwd");
            System.out.print(driver+"/"+url+"/"+user+"/"+pwd);
            Class.forName(driver);
            conn = DriverManager.getConnection(url,user,pwd);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }


    public static void CloseConnection(Connection conn) {
        try {
            if (conn!=null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void CloseResultSet (ResultSet resultSet) {
        try {
            if (resultSet != null) {
                resultSet.close();
                resultSet = null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void CloseStatement (PreparedStatement preparedStatement) {
        try {
            if (preparedStatement != null) {
                preparedStatement.close();
                preparedStatement = null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void CloseAll(Connection conn,PreparedStatement pst) {
        CloseAll(conn,null,pst);
    }

    public static void CloseAll(Connection conn,ResultSet rs,PreparedStatement pst) {
        if(rs==null) {
            CloseConnection(conn);
            CloseStatement(pst);
        }
        CloseConnection(conn);
        CloseResultSet(rs);
        CloseStatement(pst);
    }



    public static int InsertDB(CaseEntity entity) throws SQLException,Exception{
        String sql = "INSERT INTO skyseaapp_case_run_log(CaseID,CaseName,Result,RunDate,StartTime,EndTime) VALUES (?,?,?,?,?,?)";
        conn = DBHelper.GetConnection();
        int id = 0;
        if(!conn.isClosed()) {
            pst = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            pst.setString(1,entity.getCaseId());
            pst.setString(2,entity.getCaseName());
            pst.setInt(3,entity.getResult());
            pst.setString(4,entity.getRunDate());
            pst.setString(5,entity.getStartTime());
            pst.setString(6,entity.getEndTime());
            int rows = pst.executeUpdate();
            if(rows>0) {
                rs = pst.getGeneratedKeys();
                if(rs.next()){
                    id = rs.getInt(1);
                }
            }
            DBHelper.CloseAll(conn,rs,pst);
        }
        return id;
    }

    public static void UpdateDB(int id) throws SQLException,Exception {
        String sql = "UPDATE skyseaapp_case_run_log SET result=?,endtime=? WHERE id=?";
        conn = DBHelper.GetConnection();
        if (!conn.isClosed()) {
            pst = conn.prepareStatement(sql);
            pst.setInt(1,1);
            pst.setString(2,(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())));
            pst.setInt(3,id);
            pst.executeUpdate();
            DBHelper.CloseAll(conn,pst);
        }

    }


    public static int InsertResult(CaseEntity entity) throws SQLException,Exception {
        StackTraceElement stackTraceElement[] = Thread.currentThread().getStackTrace();
        String str = stackTraceElement[2].getClassName();//skysea.app.ios.testcase.iosSkyseaAppMainTest
        String className = str.substring(str.lastIndexOf(".")+1);
        String methodName = stackTraceElement[2].getMethodName();
        entity.setCaseId("SkyseaApp-"+className);
        entity.setCaseName(methodName);
        return DBHelper.InsertDB(entity);
    }




}
