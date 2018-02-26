package entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * @author hxc，xiongchao.hao@htouhui.com
 * @date 2017/7/26.
 */
public class Records implements Serializable {
    private static final long serialVersionUID = -6980932884533005393L;

    /**
     * 用户姓名
     */
    @SerializedName("user_name")
    private String userName = "";

    /**
     * 证件类型
     * 0-身份证；1-户口簿；2-护照；3-军官证；4-士兵证；5-港澳居民来往内地通行证；6-台湾同胞来往内地通行证；
     * 7-临时身份证；8-外国人居留证；9-警官证；A-香港身份证；B-澳门身份证；C-台湾身份证；X-其他证件
     */
    @SerializedName("user_credentials_type")
    private String userCredentialsType = "0";

    /**
     * 证件号码
     */
    @SerializedName("user_credentials_no")
    private String userCredentialsNo = "";

    /**
     * 业务号
     */
    @SerializedName("order_no")
    private String orderNo = "";

    /**
     * 业务种类
     * 1-贷款；
     */
    @SerializedName("biz_type")
    private String bizType = "1";

    /**
     * 业务状态01-审批通过；02-审批否决；03-用户放弃；04-已放款
     */
    @SerializedName("order_status")
    private String orderStatus = "";

    /**
     * 授信额度 / 放款金额
     */
    @SerializedName("create_amt")
    private String createAmt = "";

    /**
     * 还款月份
     */
    @SerializedName("pay_month")
    private String payMonth = "";

    /**
     * 各阶段时间日期
     */
    @SerializedName("gmt_ovd_date")
    private String gmtOvdDate = "";

    /**
     * 当前逾期天数
     */
    @SerializedName("overdue_days")
    private String overdueDays = "";

    /**
     * 当前逾期总额
     */
    @SerializedName("overdue_amt")
    private String overdueAmt = "";

    /**
     * 结清日期
     */
    @SerializedName("gmt_pay")
    private String gmtPay = "";

    /**
     * 备注
     */
    @SerializedName("memo")
    private String memo = "";

    @Override
    public String toString() {
        return "ZhimaDataBatchFeedbackDTO{" +
                "userName='" + userName + '\'' +
                ", userCredentialsType='" + userCredentialsType + '\'' +
                ", userCredentialsNo='" + userCredentialsNo + '\'' +
                ", orderNo='" + orderNo + '\'' +
                ", bizType='" + bizType + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                ", createAmt='" + createAmt + '\'' +
                ", payMonth='" + payMonth + '\'' +
                ", gmtOvdDate='" + gmtOvdDate + '\'' +
                ", overdueDays='" + overdueDays + '\'' +
                ", overdueAmt='" + overdueAmt + '\'' +
                ", gmtPay='" + gmtPay + '\'' +
                ", memo='" + memo + '\'' +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserCredentialsType() {
        return userCredentialsType;
    }

    public void setUserCredentialsType(String userCredentialsType) {
        this.userCredentialsType = userCredentialsType;
    }

    public String getUserCredentialsNo() {
        return userCredentialsNo;
    }

    public void setUserCredentialsNo(String userCredentialsNo) {
        this.userCredentialsNo = userCredentialsNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getCreateAmt() {
        return createAmt;
    }

    public void setCreateAmt(String createAmt) {
        this.createAmt = createAmt;
    }

    public String getPayMonth() {
        return payMonth;
    }

    public void setPayMonth(String payMonth) {
        this.payMonth = payMonth;
    }

    public String getGmtOvdDate() {
        return gmtOvdDate;
    }

    public void setGmtOvdDate(String gmtOvdDate) {
        this.gmtOvdDate = gmtOvdDate;
    }

    public String getOverdueDays() {
        return overdueDays;
    }

    public void setOverdueDays(String overdueDays) {
        this.overdueDays = overdueDays;
    }

    public String getOverdueAmt() {
        return overdueAmt;
    }

    public void setOverdueAmt(String overdueAmt) {
        this.overdueAmt = overdueAmt;
    }

    public String getGmtPay() {
        return gmtPay;
    }

    public void setGmtPay(String gmtPay) {
        this.gmtPay = gmtPay;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
