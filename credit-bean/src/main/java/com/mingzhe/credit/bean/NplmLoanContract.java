package com.mingzhe.credit.bean;

import javax.annotation.Generated;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 合同_贷款合同表
 */
public class NplmLoanContract implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    //合同编号
    @Column
    private String loanContractNum;
    @Column
    private String borrowerId;
    @Column
    private String ecifId;
    @Column
    private String proCategoryCode;
    @Column
    private String proCategoryName;
    @Column
    private Integer productInfoId;
    @Column
    private Integer loanInstalments;
    @Column
    private String loanInstalmentUnit;
    @Column
    private Integer loanAmount;
    @Column
    private Integer preFee;
    @Column
    private Integer putAmount;
    @Column
    private String creditType;
    @Column
    private String payMod;
    @Column
    private String repayWay;
    @Column
    private String loanType;
    @Column
    private Integer saleDepartmentId;
    @Column
    private String repayAccountName;
    @Column
    private String repayAcctIdenType;
    @Column
    private String repayAcctIdenNum;
    @Column
    private String repayAccount;
    @Column
    private String repayAccountType;
    @Column
    private String repayAccountBankid;
    @Column
    private String repayActBranchNo;
    @Column
    private String repayAccountBankName;
    @Column
    private String publicPrivate;
    @Column
    private String repayActProvince;
    @Column
    private String repayAccountCity;
    @Column
    private String posStatus;
    @Column
    private Date startDate;
    @Column
    private Date endDate;
    @Column
    private String contractSource;
    @Column
    private Integer repayBalance;
    @Column
    private String contractType;
    @Column
    private String creator;
    @Column
    private String updater;
    @Column
    private Date createTime;
    @Column
    private Date updateTime;
    @Column
    private String remark;
    @Column
    private String cycleCreditId;
    @Column
    private String updateType;
    @Transient
    private NplmBorrowerInfo nplmBorrowerInfo ;
    @Transient
    private NplmContractAttribute nplmContractAttribute ;

    public NplmBorrowerInfo getNplmBorrowerInfo() {
        return nplmBorrowerInfo;
    }

    public void setNplmBorrowerInfo(NplmBorrowerInfo nplmBorrowerInfo) {
        this.nplmBorrowerInfo = nplmBorrowerInfo;
    }

    public NplmContractAttribute getNplmContractAttribute() {
        return nplmContractAttribute;
    }

    public void setNplmContractAttribute(NplmContractAttribute nplmContractAttribute) {
        this.nplmContractAttribute = nplmContractAttribute;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getLoanContractNum() {
        return loanContractNum;
    }

    public void setLoanContractNum(String loanContractNum) {
        this.loanContractNum = loanContractNum == null ? null : loanContractNum.trim();
    }

    public String getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId(String borrowerId) {
        this.borrowerId = borrowerId == null ? null : borrowerId.trim();
    }

    public String getEcifId() {
        return ecifId;
    }

    public void setEcifId(String ecifId) {
        this.ecifId = ecifId == null ? null : ecifId.trim();
    }

    public String getProCategoryCode() {
        return proCategoryCode;
    }

    public void setProCategoryCode(String proCategoryCode) {
        this.proCategoryCode = proCategoryCode == null ? null : proCategoryCode.trim();
    }

    public String getProCategoryName() {
        return proCategoryName;
    }

    public void setProCategoryName(String proCategoryName) {
        this.proCategoryName = proCategoryName == null ? null : proCategoryName.trim();
    }

    public Integer getProductInfoId() {
        return productInfoId;
    }

    public void setProductInfoId(Integer productInfoId) {
        this.productInfoId = productInfoId;
    }

    public Integer getLoanInstalments() {
        return loanInstalments;
    }

    public void setLoanInstalments(Integer loanInstalments) {
        this.loanInstalments = loanInstalments;
    }

    public String getLoanInstalmentUnit() {
        return loanInstalmentUnit;
    }

    public void setLoanInstalmentUnit(String loanInstalmentUnit) {
        this.loanInstalmentUnit = loanInstalmentUnit == null ? null : loanInstalmentUnit.trim();
    }

    public Integer getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Integer loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Integer getPreFee() {
        return preFee;
    }

    public void setPreFee(Integer preFee) {
        this.preFee = preFee;
    }

    public Integer getPutAmount() {
        return putAmount;
    }

    public void setPutAmount(Integer putAmount) {
        this.putAmount = putAmount;
    }

    public String getCreditType() {
        return creditType;
    }

    public void setCreditType(String creditType) {
        this.creditType = creditType == null ? null : creditType.trim();
    }

    public String getPayMod() {
        return payMod;
    }

    public void setPayMod(String payMod) {
        this.payMod = payMod == null ? null : payMod.trim();
    }

    public String getRepayWay() {
        return repayWay;
    }

    public void setRepayWay(String repayWay) {
        this.repayWay = repayWay == null ? null : repayWay.trim();
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType == null ? null : loanType.trim();
    }

    public Integer getSaleDepartmentId() {
        return saleDepartmentId;
    }

    public void setSaleDepartmentId(Integer saleDepartmentId) {
        this.saleDepartmentId = saleDepartmentId;
    }

    public String getRepayAccountName() {
        return repayAccountName;
    }

    public void setRepayAccountName(String repayAccountName) {
        this.repayAccountName = repayAccountName == null ? null : repayAccountName.trim();
    }

    public String getRepayAcctIdenType() {
        return repayAcctIdenType;
    }

    public void setRepayAcctIdenType(String repayAcctIdenType) {
        this.repayAcctIdenType = repayAcctIdenType == null ? null : repayAcctIdenType.trim();
    }

    public String getRepayAcctIdenNum() {
        return repayAcctIdenNum;
    }

    public void setRepayAcctIdenNum(String repayAcctIdenNum) {
        this.repayAcctIdenNum = repayAcctIdenNum == null ? null : repayAcctIdenNum.trim();
    }

    public String getRepayAccount() {
        return repayAccount;
    }

    public void setRepayAccount(String repayAccount) {
        this.repayAccount = repayAccount == null ? null : repayAccount.trim();
    }

    public String getRepayAccountType() {
        return repayAccountType;
    }

    public void setRepayAccountType(String repayAccountType) {
        this.repayAccountType = repayAccountType == null ? null : repayAccountType.trim();
    }

    public String getRepayAccountBankid() {
        return repayAccountBankid;
    }

    public void setRepayAccountBankid(String repayAccountBankid) {
        this.repayAccountBankid = repayAccountBankid == null ? null : repayAccountBankid.trim();
    }

    public String getRepayActBranchNo() {
        return repayActBranchNo;
    }

    public void setRepayActBranchNo(String repayActBranchNo) {
        this.repayActBranchNo = repayActBranchNo == null ? null : repayActBranchNo.trim();
    }

    public String getRepayAccountBankName() {
        return repayAccountBankName;
    }

    public void setRepayAccountBankName(String repayAccountBankName) {
        this.repayAccountBankName = repayAccountBankName == null ? null : repayAccountBankName.trim();
    }

    public String getPublicPrivate() {
        return publicPrivate;
    }

    public void setPublicPrivate(String publicPrivate) {
        this.publicPrivate = publicPrivate == null ? null : publicPrivate.trim();
    }

    public String getRepayActProvince() {
        return repayActProvince;
    }

    public void setRepayActProvince(String repayActProvince) {
        this.repayActProvince = repayActProvince == null ? null : repayActProvince.trim();
    }

    public String getRepayAccountCity() {
        return repayAccountCity;
    }

    public void setRepayAccountCity(String repayAccountCity) {
        this.repayAccountCity = repayAccountCity == null ? null : repayAccountCity.trim();
    }

    public String getPosStatus() {
        return posStatus;
    }

    public void setPosStatus(String posStatus) {
        this.posStatus = posStatus == null ? null : posStatus.trim();
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getContractSource() {
        return contractSource;
    }

    public void setContractSource(String contractSource) {
        this.contractSource = contractSource == null ? null : contractSource.trim();
    }

    public Integer getRepayBalance() {
        return repayBalance;
    }

    public void setRepayBalance(Integer repayBalance) {
        this.repayBalance = repayBalance;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType == null ? null : contractType.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater == null ? null : updater.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getCycleCreditId() {
        return cycleCreditId;
    }

    public void setCycleCreditId(String cycleCreditId) {
        this.cycleCreditId = cycleCreditId == null ? null : cycleCreditId.trim();
    }

    public String getUpdateType() {
        return updateType;
    }

    public void setUpdateType(String updateType) {
        this.updateType = updateType == null ? null : updateType.trim();
    }
}