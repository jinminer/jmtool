package com.uxun.epay.jobexecutor.entity;

import java.util.Date;

public class AgreePaySignTemp {
    private String userId;

    private String acctNo;

    private String acctName;

    private String idNo;

    private String mobile;

    private String bankCode;

    private String bankName;

    private String protocolNo;

    private Date createTime;

    private String channelCode;

    public AgreePaySignTemp(String userId, String acctNo, String acctName, String idNo, String mobile, String bankCode, String bankName, String protocolNo, Date createTime, String channelCode) {
        this.userId = userId;
        this.acctNo = acctNo;
        this.acctName = acctName;
        this.idNo = idNo;
        this.mobile = mobile;
        this.bankCode = bankCode;
        this.bankName = bankName;
        this.protocolNo = protocolNo;
        this.createTime = createTime;
        this.channelCode = channelCode;
    }

    public AgreePaySignTemp() {
        super();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo == null ? null : acctNo.trim();
    }

    public String getAcctName() {
        return acctName;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName == null ? null : acctName.trim();
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo == null ? null : idNo.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getProtocolNo() {
        return protocolNo;
    }

    public void setProtocolNo(String protocolNo) {
        this.protocolNo = protocolNo == null ? null : protocolNo.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode == null ? null : channelCode.trim();
    }
}