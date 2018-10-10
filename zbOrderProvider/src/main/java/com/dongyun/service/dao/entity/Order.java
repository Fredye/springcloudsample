package com.dongyun.service.dao.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    private String id;

    private String userid;

    private String tenantid;

    private String wid;

    private BigDecimal oriamount;

    private BigDecimal descount;

    private BigDecimal amount;

    private BigDecimal freight;

    private BigDecimal otherAmount;

    private BigDecimal usedPoint;

    private String addressid;

    private String expressId;

    private String expressType;

    private String paytype;

    private String slipTitle;

    private String status;

    private Date setupTime;

    private Date paymentTime;

    private String oriorderid;

    private String trncompid;

    private String trnslipno;

    private Date trnsendTime;

    private Date presettleTime;

    private Date scheduledTime;

    private Date trnsignTime;

    private String trnsignPerson;

    private Date confirmTime;

    private Date completeTime;

    private Date cancelTime;

    private String cancelReson;

    private String tenantAid1;

    private String tenantAid2;

    private String tenantAid3;

    private String couponid1;

    private String couponid2;

    private String couponid3;

    private String buyerComment;

    private String orderComment;

    private String scoredFlag;

    private BigDecimal lastDiscount;

    private BigDecimal acceptAmount;

    private BigDecimal returnAmount;

    private String orderType;

    private String payedFlag;

    private Date instime;

    private String insuser;

    private Date updtime;

    private String upduser;

    private String delflg;

    private String paymentLogId;

    private String commitFlag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getTenantid() {
        return tenantid;
    }

    public void setTenantid(String tenantid) {
        this.tenantid = tenantid == null ? null : tenantid.trim();
    }

    public String getWid() {
        return wid;
    }

    public void setWid(String wid) {
        this.wid = wid == null ? null : wid.trim();
    }

    public BigDecimal getOriamount() {
        return oriamount;
    }

    public void setOriamount(BigDecimal oriamount) {
        this.oriamount = oriamount;
    }

    public BigDecimal getDescount() {
        return descount;
    }

    public void setDescount(BigDecimal descount) {
        this.descount = descount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public BigDecimal getOtherAmount() {
        return otherAmount;
    }

    public void setOtherAmount(BigDecimal otherAmount) {
        this.otherAmount = otherAmount;
    }

    public BigDecimal getUsedPoint() {
        return usedPoint;
    }

    public void setUsedPoint(BigDecimal usedPoint) {
        this.usedPoint = usedPoint;
    }

    public String getAddressid() {
        return addressid;
    }

    public void setAddressid(String addressid) {
        this.addressid = addressid == null ? null : addressid.trim();
    }

    public String getExpressId() {
        return expressId;
    }

    public void setExpressId(String expressId) {
        this.expressId = expressId == null ? null : expressId.trim();
    }

    public String getExpressType() {
        return expressType;
    }

    public void setExpressType(String expressType) {
        this.expressType = expressType == null ? null : expressType.trim();
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype == null ? null : paytype.trim();
    }

    public String getSlipTitle() {
        return slipTitle;
    }

    public void setSlipTitle(String slipTitle) {
        this.slipTitle = slipTitle == null ? null : slipTitle.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getSetupTime() {
        return setupTime;
    }

    public void setSetupTime(Date setupTime) {
        this.setupTime = setupTime;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public String getOriorderid() {
        return oriorderid;
    }

    public void setOriorderid(String oriorderid) {
        this.oriorderid = oriorderid == null ? null : oriorderid.trim();
    }

    public String getTrncompid() {
        return trncompid;
    }

    public void setTrncompid(String trncompid) {
        this.trncompid = trncompid == null ? null : trncompid.trim();
    }

    public String getTrnslipno() {
        return trnslipno;
    }

    public void setTrnslipno(String trnslipno) {
        this.trnslipno = trnslipno == null ? null : trnslipno.trim();
    }

    public Date getTrnsendTime() {
        return trnsendTime;
    }

    public void setTrnsendTime(Date trnsendTime) {
        this.trnsendTime = trnsendTime;
    }

    public Date getPresettleTime() {
        return presettleTime;
    }

    public void setPresettleTime(Date presettleTime) {
        this.presettleTime = presettleTime;
    }

    public Date getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(Date scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    public Date getTrnsignTime() {
        return trnsignTime;
    }

    public void setTrnsignTime(Date trnsignTime) {
        this.trnsignTime = trnsignTime;
    }

    public String getTrnsignPerson() {
        return trnsignPerson;
    }

    public void setTrnsignPerson(String trnsignPerson) {
        this.trnsignPerson = trnsignPerson == null ? null : trnsignPerson.trim();
    }

    public Date getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
    }

    public Date getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(Date completeTime) {
        this.completeTime = completeTime;
    }

    public Date getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    public String getCancelReson() {
        return cancelReson;
    }

    public void setCancelReson(String cancelReson) {
        this.cancelReson = cancelReson == null ? null : cancelReson.trim();
    }

    public String getTenantAid1() {
        return tenantAid1;
    }

    public void setTenantAid1(String tenantAid1) {
        this.tenantAid1 = tenantAid1 == null ? null : tenantAid1.trim();
    }

    public String getTenantAid2() {
        return tenantAid2;
    }

    public void setTenantAid2(String tenantAid2) {
        this.tenantAid2 = tenantAid2 == null ? null : tenantAid2.trim();
    }

    public String getTenantAid3() {
        return tenantAid3;
    }

    public void setTenantAid3(String tenantAid3) {
        this.tenantAid3 = tenantAid3 == null ? null : tenantAid3.trim();
    }

    public String getCouponid1() {
        return couponid1;
    }

    public void setCouponid1(String couponid1) {
        this.couponid1 = couponid1 == null ? null : couponid1.trim();
    }

    public String getCouponid2() {
        return couponid2;
    }

    public void setCouponid2(String couponid2) {
        this.couponid2 = couponid2 == null ? null : couponid2.trim();
    }

    public String getCouponid3() {
        return couponid3;
    }

    public void setCouponid3(String couponid3) {
        this.couponid3 = couponid3 == null ? null : couponid3.trim();
    }

    public String getBuyerComment() {
        return buyerComment;
    }

    public void setBuyerComment(String buyerComment) {
        this.buyerComment = buyerComment == null ? null : buyerComment.trim();
    }

    public String getOrderComment() {
        return orderComment;
    }

    public void setOrderComment(String orderComment) {
        this.orderComment = orderComment == null ? null : orderComment.trim();
    }

    public String getScoredFlag() {
        return scoredFlag;
    }

    public void setScoredFlag(String scoredFlag) {
        this.scoredFlag = scoredFlag == null ? null : scoredFlag.trim();
    }

    public BigDecimal getLastDiscount() {
        return lastDiscount;
    }

    public void setLastDiscount(BigDecimal lastDiscount) {
        this.lastDiscount = lastDiscount;
    }

    public BigDecimal getAcceptAmount() {
        return acceptAmount;
    }

    public void setAcceptAmount(BigDecimal acceptAmount) {
        this.acceptAmount = acceptAmount;
    }

    public BigDecimal getReturnAmount() {
        return returnAmount;
    }

    public void setReturnAmount(BigDecimal returnAmount) {
        this.returnAmount = returnAmount;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    public String getPayedFlag() {
        return payedFlag;
    }

    public void setPayedFlag(String payedFlag) {
        this.payedFlag = payedFlag == null ? null : payedFlag.trim();
    }

    public Date getInstime() {
        return instime;
    }

    public void setInstime(Date instime) {
        this.instime = instime;
    }

    public String getInsuser() {
        return insuser;
    }

    public void setInsuser(String insuser) {
        this.insuser = insuser == null ? null : insuser.trim();
    }

    public Date getUpdtime() {
        return updtime;
    }

    public void setUpdtime(Date updtime) {
        this.updtime = updtime;
    }

    public String getUpduser() {
        return upduser;
    }

    public void setUpduser(String upduser) {
        this.upduser = upduser == null ? null : upduser.trim();
    }

    public String getDelflg() {
        return delflg;
    }

    public void setDelflg(String delflg) {
        this.delflg = delflg == null ? null : delflg.trim();
    }

    public String getPaymentLogId() {
        return paymentLogId;
    }

    public void setPaymentLogId(String paymentLogId) {
        this.paymentLogId = paymentLogId == null ? null : paymentLogId.trim();
    }

    public String getCommitFlag() {
        return commitFlag;
    }

    public void setCommitFlag(String commitFlag) {
        this.commitFlag = commitFlag == null ? null : commitFlag.trim();
    }
}