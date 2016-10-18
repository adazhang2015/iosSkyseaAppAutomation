package skysea.app.ios.util;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * Created by ctrip on 16/10/17.
 */
public class CaseEntity {
    private String caseId = "";
    private String caseName = "";
    private int result = 0;
    private String runDate = (new SimpleDateFormat("yyyyMMdd").format(new Date()));
    private String startTime = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    private String endTime = "";


    public String getCaseId() {
        return caseId;
    }
    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getCaseName() {
        return caseName;
    }
    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public int getResult() {
        return result;
    }
    public void setResult(int result) {
        this.result = result;
    }

    public String getRunDate() {
        return runDate;
    }
    public void setRunDate(String runDate) {
        this.runDate = runDate;
    }

    public String getStartTime() {
        return startTime;
    }
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }
    public void setEndTime(String endTime) {
        this.endTime=endTime;
    }
}
