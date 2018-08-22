package com.mingzhe.credit.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 还款_还款记录表
 */
public class NplmRepaymentRecord implements Serializable {

    private Integer id;

    private Integer businessRequestId;

    private Integer loanContractNum;

    private Date repaymentDate;

    private Integer overdueDays;

    private Integer overdueAmount;

    private Integer repaymentAmount;

    private Integer successAmount;

    private String status;

    private String remark;

    private String specialCode;

    private Integer sort;

    private String dataCreateType;

    private Date reserveTime;

    private String creator;

    private Date createTime;

    private String updater;

    private Date updateTime;

    private String accountName;

    private String acctIdenType;

    private String acctIdenNum;

    private String accountNo;

    private String accountType;

    private String accountBankid;

    private String accountBranchNo;

    private String accountBankName;

    private String publicPrivate;

    private String actProvince;

    private String accountCity;

    private String updateType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBusinessRequestId() {
        return businessRequestId;
    }

    public void setBusinessRequestId(Integer businessRequestId) {
        this.businessRequestId = businessRequestId;
    }

    public Integer getLoanContractNum() {
        return loanContractNum;
    }

    public void setLoanContractNum(Integer loanContractNum) {
        this.loanContractNum = loanContractNum;
    }

    public Date getRepaymentDate() {
        return repaymentDate;
    }

    public void setRepaymentDate(Date repaymentDate) {
        this.repaymentDate = repaymentDate;
    }

    public Integer getOverdueDays() {
        return overdueDays;
    }

    public void setOverdueDays(Integer overdueDays) {
        this.overdueDays = overdueDays;
    }

    public Integer getOverdueAmount() {
        return overdueAmount;
    }

    public void setOverdueAmount(Integer overdueAmount) {
        this.overdueAmount = overdueAmount;
    }

    public Integer getRepaymentAmount() {
        return repaymentAmount;
    }

    public void setRepaymentAmount(Integer repaymentAmount) {
        this.repaymentAmount = repaymentAmount;
    }

    public Integer getSuccessAmount() {
        return successAmount;
    }

    public void setSuccessAmount(Integer successAmount) {
        this.successAmount = successAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getSpecialCode() {
        return specialCode;
    }

    public void setSpecialCode(String specialCode) {
        this.specialCode = specialCode == null ? null : specialCode.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getDataCreateType() {
        return dataCreateType;
    }

    public void setDataCreateType(String dataCreateType) {
        this.dataCreateType = dataCreateType == null ? null : dataCreateType.trim();
    }

    public Date getReserveTime() {
        return reserveTime;
    }

    public void setReserveTime(Date reserveTime) {
        this.reserveTime = reserveTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater == null ? null : updater.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    public String getAcctIdenType() {
        return acctIdenType;
    }

    public void setAcctIdenType(String acctIdenType) {
        this.acctIdenType = acctIdenType == null ? null : acctIdenType.trim();
    }

    public String getAcctIdenNum() {
        return acctIdenNum;
    }

    public void setAcctIdenNum(String acctIdenNum) {
        this.acctIdenNum = acctIdenNum == null ? null : acctIdenNum.trim();
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo == null ? null : accountNo.trim();
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType == null ? null : accountType.trim();
    }

    public String getAccountBankid() {
        return accountBankid;
    }

    public void setAccountBankid(String accountBankid) {
        this.accountBankid = accountBankid == null ? null : accountBankid.trim();
    }

    public String getAccountBranchNo() {
        return accountBranchNo;
    }

    public void setAccountBranchNo(String accountBranchNo) {
        this.accountBranchNo = accountBranchNo == null ? null : accountBranchNo.trim();
    }

    public String getAccountBankName() {
        return accountBankName;
    }

    public void setAccountBankName(String accountBankName) {
        this.accountBankName = accountBankName == null ? null : accountBankName.trim();
    }

    public String getPublicPrivate() {
        return publicPrivate;
    }

    public void setPublicPrivate(String publicPrivate) {
        this.publicPrivate = publicPrivate == null ? null : publicPrivate.trim();
    }

    public String getActProvince() {
        return actProvince;
    }

    public void setActProvince(String actProvince) {
        this.actProvince = actProvince == null ? null : actProvince.trim();
    }

    public String getAccountCity() {
        return accountCity;
    }

    public void setAccountCity(String accountCity) {
        this.accountCity = accountCity == null ? null : accountCity.trim();
    }

    public String getUpdateType() {
        return updateType;
    }

    public void setUpdateType(String updateType) {
        this.updateType = updateType == null ? null : updateType.trim();
    }
}