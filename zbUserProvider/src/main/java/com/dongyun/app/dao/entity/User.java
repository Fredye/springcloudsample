package com.dongyun.app.dao.entity;

import java.util.Date;

public class User {
    private String oidUserId;

    private String userId;

    private String mobile;

    private String email;

    private String headpic;

    private String userPwd;

    private String userPwdStrength;

    private String userPayPwd;

    private String userType;

    private String investmentFlg;

    private String financingFlg;

    private String guaranteeFlg;

    private String emailVerifyFlg;

    private Integer loginTimes;

    private Integer loginErrorTimes;

    private String lastLoginIp;

    private Date lastLoginDate;

    private Byte oidCustomerServiceId;

    private String autoFinanceTenderFlg;

    private String autoFinanceProdFlg;

    private String delFlg;

    private Date insDate;

    private Date updDate;

    private String pushClientId;

    private String pushClientTag;

    private String valid;

    private String oldPassword;

    private String oldSalt;

    private String thirdPartFlag;

    private String thirdPartNumber;

    private String userDivision;

    private String userAccountType;

    private String province;

    private String city;

    private String area;

    private String nickname;

    private String userStatusType;

    private String userStatusFlg;

    private String tagEndMode;

    private String pushAfterFlg;

    private String userLevel;

    public String getOidUserId() {
        return oidUserId;
    }

    public void setOidUserId(String oidUserId) {
        this.oidUserId = oidUserId == null ? null : oidUserId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getHeadpic() {
        return headpic;
    }

    public void setHeadpic(String headpic) {
        this.headpic = headpic == null ? null : headpic.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public String getUserPwdStrength() {
        return userPwdStrength;
    }

    public void setUserPwdStrength(String userPwdStrength) {
        this.userPwdStrength = userPwdStrength == null ? null : userPwdStrength.trim();
    }

    public String getUserPayPwd() {
        return userPayPwd;
    }

    public void setUserPayPwd(String userPayPwd) {
        this.userPayPwd = userPayPwd == null ? null : userPayPwd.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public String getInvestmentFlg() {
        return investmentFlg;
    }

    public void setInvestmentFlg(String investmentFlg) {
        this.investmentFlg = investmentFlg == null ? null : investmentFlg.trim();
    }

    public String getFinancingFlg() {
        return financingFlg;
    }

    public void setFinancingFlg(String financingFlg) {
        this.financingFlg = financingFlg == null ? null : financingFlg.trim();
    }

    public String getGuaranteeFlg() {
        return guaranteeFlg;
    }

    public void setGuaranteeFlg(String guaranteeFlg) {
        this.guaranteeFlg = guaranteeFlg == null ? null : guaranteeFlg.trim();
    }

    public String getEmailVerifyFlg() {
        return emailVerifyFlg;
    }

    public void setEmailVerifyFlg(String emailVerifyFlg) {
        this.emailVerifyFlg = emailVerifyFlg == null ? null : emailVerifyFlg.trim();
    }

    public Integer getLoginTimes() {
        return loginTimes;
    }

    public void setLoginTimes(Integer loginTimes) {
        this.loginTimes = loginTimes;
    }

    public Integer getLoginErrorTimes() {
        return loginErrorTimes;
    }

    public void setLoginErrorTimes(Integer loginErrorTimes) {
        this.loginErrorTimes = loginErrorTimes;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public Byte getOidCustomerServiceId() {
        return oidCustomerServiceId;
    }

    public void setOidCustomerServiceId(Byte oidCustomerServiceId) {
        this.oidCustomerServiceId = oidCustomerServiceId;
    }

    public String getAutoFinanceTenderFlg() {
        return autoFinanceTenderFlg;
    }

    public void setAutoFinanceTenderFlg(String autoFinanceTenderFlg) {
        this.autoFinanceTenderFlg = autoFinanceTenderFlg == null ? null : autoFinanceTenderFlg.trim();
    }

    public String getAutoFinanceProdFlg() {
        return autoFinanceProdFlg;
    }

    public void setAutoFinanceProdFlg(String autoFinanceProdFlg) {
        this.autoFinanceProdFlg = autoFinanceProdFlg == null ? null : autoFinanceProdFlg.trim();
    }

    public String getDelFlg() {
        return delFlg;
    }

    public void setDelFlg(String delFlg) {
        this.delFlg = delFlg == null ? null : delFlg.trim();
    }

    public Date getInsDate() {
        return insDate;
    }

    public void setInsDate(Date insDate) {
        this.insDate = insDate;
    }

    public Date getUpdDate() {
        return updDate;
    }

    public void setUpdDate(Date updDate) {
        this.updDate = updDate;
    }

    public String getPushClientId() {
        return pushClientId;
    }

    public void setPushClientId(String pushClientId) {
        this.pushClientId = pushClientId == null ? null : pushClientId.trim();
    }

    public String getPushClientTag() {
        return pushClientTag;
    }

    public void setPushClientTag(String pushClientTag) {
        this.pushClientTag = pushClientTag == null ? null : pushClientTag.trim();
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid == null ? null : valid.trim();
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword == null ? null : oldPassword.trim();
    }

    public String getOldSalt() {
        return oldSalt;
    }

    public void setOldSalt(String oldSalt) {
        this.oldSalt = oldSalt == null ? null : oldSalt.trim();
    }

    public String getThirdPartFlag() {
        return thirdPartFlag;
    }

    public void setThirdPartFlag(String thirdPartFlag) {
        this.thirdPartFlag = thirdPartFlag == null ? null : thirdPartFlag.trim();
    }

    public String getThirdPartNumber() {
        return thirdPartNumber;
    }

    public void setThirdPartNumber(String thirdPartNumber) {
        this.thirdPartNumber = thirdPartNumber == null ? null : thirdPartNumber.trim();
    }

    public String getUserDivision() {
        return userDivision;
    }

    public void setUserDivision(String userDivision) {
        this.userDivision = userDivision == null ? null : userDivision.trim();
    }

    public String getUserAccountType() {
        return userAccountType;
    }

    public void setUserAccountType(String userAccountType) {
        this.userAccountType = userAccountType == null ? null : userAccountType.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getUserStatusType() {
        return userStatusType;
    }

    public void setUserStatusType(String userStatusType) {
        this.userStatusType = userStatusType == null ? null : userStatusType.trim();
    }

    public String getUserStatusFlg() {
        return userStatusFlg;
    }

    public void setUserStatusFlg(String userStatusFlg) {
        this.userStatusFlg = userStatusFlg == null ? null : userStatusFlg.trim();
    }

    public String getTagEndMode() {
        return tagEndMode;
    }

    public void setTagEndMode(String tagEndMode) {
        this.tagEndMode = tagEndMode == null ? null : tagEndMode.trim();
    }

    public String getPushAfterFlg() {
        return pushAfterFlg;
    }

    public void setPushAfterFlg(String pushAfterFlg) {
        this.pushAfterFlg = pushAfterFlg == null ? null : pushAfterFlg.trim();
    }

    public String getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel == null ? null : userLevel.trim();
    }
}