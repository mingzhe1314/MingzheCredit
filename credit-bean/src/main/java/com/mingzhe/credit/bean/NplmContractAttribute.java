package com.mingzhe.credit.bean;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * 合同_合同属性表
 */
public class NplmContractAttribute implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private Integer loanContractId;
    @Column
    private Integer loanContractNum;
    @Column
    private String businessType;
    @Column
    private String isExpedited;
    @Column
    private Date signDate;
    @Column
    private Integer signType;
    @Column
    private String approveDate;
    @Column
    private String firstRepayDate;
    @Column
    private Integer feeFlag;
    @Column
    private String interestFlag;
    @Column
    private Integer interestType;
    @Column
    private Integer graceDays;
    @Column
    private Integer irr;
    @Column
    private Integer lnsRate;
    @Column
    private String channelCode;
    @Column
    private String channelName;
    @Column
    private String loanOfficerId;
    @Column
    private String cityid;
    @Column
    private String city;
    @Column
    private String isModify;
    @Column
    private String isSchemeModify;
    @Column
    private Integer recycleWay;
    @Column
    private String isRecycleLoad;
    @Column
    private Integer recycleLoanCnt;
    @Column
    private String oldContractNum;
    @Column
    private Integer settleAmount;
    @Column
    private String newContractNum;
    @Column
    private String isShorten;
    @Column
    private String isExtend;
    @Column
    private String isChangeProduce;
    @Column
    private String isOverdue;
    @Column
    private String isPayAhead;
    @Column
    private String isPayPart;
    @Column
    private String purpose;
    @Column
    private String purposeSon;
    @Column
    private String purposeDetail;
    @Column
    private String isDivAccount;
    @Column
    private String systemType;
    @Column
    private String highRisk;
    @Column
    private String isBuyout;
    @Column
    private String feeProcessType;
    @Column
    private String studentCorpName;
    @Column
    private String settleDate;
    @Column
    private String habitTime;
    @Column
    private String repayday;
    @Column
    private String applyId;
    @Column
    private String oldApplyId;
    //部门编号
    @Column
    private String deptId;
    //部门名称
    @Column
    private String deptName;
    @Column
    private String creator;
    @Column
    private Date createTime;
    @Column
    private String updater;
    @Column
    private Date updateTime;
    @Column
    private String updateType;
    @Column
    private Integer frontChargeDiscount;
    @Column
    private Integer monthMRate;
    @Column
    private Integer handleChargeRate;
    @Column
    private Integer loanTimes;
    @Column
    private String pawn;
    @Column
    private Integer handleCharge;
    @Column
    private Integer monthChargeDiscount;
    @Column
    private Integer guaranteeFee;
    @Column
    private String guaranteeCompany;
    @Column
    private String def1;
    @Column
    private String def2;
    @Column
    private String def3;
    @Column
    private String def4;
    @Column
    private String def5;
    @Column
    private String def6;
    @Column
    private String def7;
    @Column
    private String def8;
    @Column
    private String def9;
    @Column
    private String def10;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLoanContractId() {
        return loanContractId;
    }

    public void setLoanContractId(Integer loanContractId) {
        this.loanContractId = loanContractId;
    }

    public Integer getLoanContractNum() {
        return loanContractNum;
    }

    public void setLoanContractNum(Integer loanContractNum) {
        this.loanContractNum = loanContractNum;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType == null ? null : businessType.trim();
    }

    public String getIsExpedited() {
        return isExpedited;
    }

    public void setIsExpedited(String isExpedited) {
        this.isExpedited = isExpedited == null ? null : isExpedited.trim();
    }

    public Date getSignDate() {
        return signDate;
    }

    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }

    public Integer getSignType() {
        return signType;
    }

    public void setSignType(Integer signType) {
        this.signType = signType;
    }

    public String getApproveDate() {
        return approveDate;
    }

    public void setApproveDate(String approveDate) {
        this.approveDate = approveDate == null ? null : approveDate.trim();
    }

    public String getFirstRepayDate() {
        return firstRepayDate;
    }

    public void setFirstRepayDate(String firstRepayDate) {
        this.firstRepayDate = firstRepayDate == null ? null : firstRepayDate.trim();
    }

    public Integer getFeeFlag() {
        return feeFlag;
    }

    public void setFeeFlag(Integer feeFlag) {
        this.feeFlag = feeFlag;
    }

    public String getInterestFlag() {
        return interestFlag;
    }

    public void setInterestFlag(String interestFlag) {
        this.interestFlag = interestFlag == null ? null : interestFlag.trim();
    }

    public Integer getInterestType() {
        return interestType;
    }

    public void setInterestType(Integer interestType) {
        this.interestType = interestType;
    }

    public Integer getGraceDays() {
        return graceDays;
    }

    public void setGraceDays(Integer graceDays) {
        this.graceDays = graceDays;
    }

    public Integer getIrr() {
        return irr;
    }

    public void setIrr(Integer irr) {
        this.irr = irr;
    }

    public Integer getLnsRate() {
        return lnsRate;
    }

    public void setLnsRate(Integer lnsRate) {
        this.lnsRate = lnsRate;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode == null ? null : channelCode.trim();
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    public String getLoanOfficerId() {
        return loanOfficerId;
    }

    public void setLoanOfficerId(String loanOfficerId) {
        this.loanOfficerId = loanOfficerId == null ? null : loanOfficerId.trim();
    }

    public String getCityid() {
        return cityid;
    }

    public void setCityid(String cityid) {
        this.cityid = cityid == null ? null : cityid.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getIsModify() {
        return isModify;
    }

    public void setIsModify(String isModify) {
        this.isModify = isModify == null ? null : isModify.trim();
    }

    public String getIsSchemeModify() {
        return isSchemeModify;
    }

    public void setIsSchemeModify(String isSchemeModify) {
        this.isSchemeModify = isSchemeModify == null ? null : isSchemeModify.trim();
    }

    public Integer getRecycleWay() {
        return recycleWay;
    }

    public void setRecycleWay(Integer recycleWay) {
        this.recycleWay = recycleWay;
    }

    public String getIsRecycleLoad() {
        return isRecycleLoad;
    }

    public void setIsRecycleLoad(String isRecycleLoad) {
        this.isRecycleLoad = isRecycleLoad == null ? null : isRecycleLoad.trim();
    }

    public Integer getRecycleLoanCnt() {
        return recycleLoanCnt;
    }

    public void setRecycleLoanCnt(Integer recycleLoanCnt) {
        this.recycleLoanCnt = recycleLoanCnt;
    }

    public String getOldContractNum() {
        return oldContractNum;
    }

    public void setOldContractNum(String oldContractNum) {
        this.oldContractNum = oldContractNum == null ? null : oldContractNum.trim();
    }

    public Integer getSettleAmount() {
        return settleAmount;
    }

    public void setSettleAmount(Integer settleAmount) {
        this.settleAmount = settleAmount;
    }

    public String getNewContractNum() {
        return newContractNum;
    }

    public void setNewContractNum(String newContractNum) {
        this.newContractNum = newContractNum == null ? null : newContractNum.trim();
    }

    public String getIsShorten() {
        return isShorten;
    }

    public void setIsShorten(String isShorten) {
        this.isShorten = isShorten == null ? null : isShorten.trim();
    }

    public String getIsExtend() {
        return isExtend;
    }

    public void setIsExtend(String isExtend) {
        this.isExtend = isExtend == null ? null : isExtend.trim();
    }

    public String getIsChangeProduce() {
        return isChangeProduce;
    }

    public void setIsChangeProduce(String isChangeProduce) {
        this.isChangeProduce = isChangeProduce == null ? null : isChangeProduce.trim();
    }

    public String getIsOverdue() {
        return isOverdue;
    }

    public void setIsOverdue(String isOverdue) {
        this.isOverdue = isOverdue == null ? null : isOverdue.trim();
    }

    public String getIsPayAhead() {
        return isPayAhead;
    }

    public void setIsPayAhead(String isPayAhead) {
        this.isPayAhead = isPayAhead == null ? null : isPayAhead.trim();
    }

    public String getIsPayPart() {
        return isPayPart;
    }

    public void setIsPayPart(String isPayPart) {
        this.isPayPart = isPayPart == null ? null : isPayPart.trim();
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose == null ? null : purpose.trim();
    }

    public String getPurposeSon() {
        return purposeSon;
    }

    public void setPurposeSon(String purposeSon) {
        this.purposeSon = purposeSon == null ? null : purposeSon.trim();
    }

    public String getPurposeDetail() {
        return purposeDetail;
    }

    public void setPurposeDetail(String purposeDetail) {
        this.purposeDetail = purposeDetail == null ? null : purposeDetail.trim();
    }

    public String getIsDivAccount() {
        return isDivAccount;
    }

    public void setIsDivAccount(String isDivAccount) {
        this.isDivAccount = isDivAccount == null ? null : isDivAccount.trim();
    }

    public String getSystemType() {
        return systemType;
    }

    public void setSystemType(String systemType) {
        this.systemType = systemType == null ? null : systemType.trim();
    }

    public String getHighRisk() {
        return highRisk;
    }

    public void setHighRisk(String highRisk) {
        this.highRisk = highRisk == null ? null : highRisk.trim();
    }

    public String getIsBuyout() {
        return isBuyout;
    }

    public void setIsBuyout(String isBuyout) {
        this.isBuyout = isBuyout == null ? null : isBuyout.trim();
    }

    public String getFeeProcessType() {
        return feeProcessType;
    }

    public void setFeeProcessType(String feeProcessType) {
        this.feeProcessType = feeProcessType == null ? null : feeProcessType.trim();
    }

    public String getStudentCorpName() {
        return studentCorpName;
    }

    public void setStudentCorpName(String studentCorpName) {
        this.studentCorpName = studentCorpName == null ? null : studentCorpName.trim();
    }

    public String getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(String settleDate) {
        this.settleDate = settleDate == null ? null : settleDate.trim();
    }

    public String getHabitTime() {
        return habitTime;
    }

    public void setHabitTime(String habitTime) {
        this.habitTime = habitTime == null ? null : habitTime.trim();
    }

    public String getRepayday() {
        return repayday;
    }

    public void setRepayday(String repayday) {
        this.repayday = repayday == null ? null : repayday.trim();
    }

    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId == null ? null : applyId.trim();
    }

    public String getOldApplyId() {
        return oldApplyId;
    }

    public void setOldApplyId(String oldApplyId) {
        this.oldApplyId = oldApplyId == null ? null : oldApplyId.trim();
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
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

    public String getUpdateType() {
        return updateType;
    }

    public void setUpdateType(String updateType) {
        this.updateType = updateType == null ? null : updateType.trim();
    }

    public Integer getFrontChargeDiscount() {
        return frontChargeDiscount;
    }

    public void setFrontChargeDiscount(Integer frontChargeDiscount) {
        this.frontChargeDiscount = frontChargeDiscount;
    }

    public Integer getMonthMRate() {
        return monthMRate;
    }

    public void setMonthMRate(Integer monthMRate) {
        this.monthMRate = monthMRate;
    }

    public Integer getHandleChargeRate() {
        return handleChargeRate;
    }

    public void setHandleChargeRate(Integer handleChargeRate) {
        this.handleChargeRate = handleChargeRate;
    }

    public Integer getLoanTimes() {
        return loanTimes;
    }

    public void setLoanTimes(Integer loanTimes) {
        this.loanTimes = loanTimes;
    }

    public String getPawn() {
        return pawn;
    }

    public void setPawn(String pawn) {
        this.pawn = pawn == null ? null : pawn.trim();
    }

    public Integer getHandleCharge() {
        return handleCharge;
    }

    public void setHandleCharge(Integer handleCharge) {
        this.handleCharge = handleCharge;
    }

    public Integer getMonthChargeDiscount() {
        return monthChargeDiscount;
    }

    public void setMonthChargeDiscount(Integer monthChargeDiscount) {
        this.monthChargeDiscount = monthChargeDiscount;
    }

    public Integer getGuaranteeFee() {
        return guaranteeFee;
    }

    public void setGuaranteeFee(Integer guaranteeFee) {
        this.guaranteeFee = guaranteeFee;
    }

    public String getGuaranteeCompany() {
        return guaranteeCompany;
    }

    public void setGuaranteeCompany(String guaranteeCompany) {
        this.guaranteeCompany = guaranteeCompany == null ? null : guaranteeCompany.trim();
    }

    public String getDef1() {
        return def1;
    }

    public void setDef1(String def1) {
        this.def1 = def1 == null ? null : def1.trim();
    }

    public String getDef2() {
        return def2;
    }

    public void setDef2(String def2) {
        this.def2 = def2 == null ? null : def2.trim();
    }

    public String getDef3() {
        return def3;
    }

    public void setDef3(String def3) {
        this.def3 = def3 == null ? null : def3.trim();
    }

    public String getDef4() {
        return def4;
    }

    public void setDef4(String def4) {
        this.def4 = def4 == null ? null : def4.trim();
    }

    public String getDef5() {
        return def5;
    }

    public void setDef5(String def5) {
        this.def5 = def5 == null ? null : def5.trim();
    }

    public String getDef6() {
        return def6;
    }

    public void setDef6(String def6) {
        this.def6 = def6 == null ? null : def6.trim();
    }

    public String getDef7() {
        return def7;
    }

    public void setDef7(String def7) {
        this.def7 = def7 == null ? null : def7.trim();
    }

    public String getDef8() {
        return def8;
    }

    public void setDef8(String def8) {
        this.def8 = def8 == null ? null : def8.trim();
    }

    public String getDef9() {
        return def9;
    }

    public void setDef9(String def9) {
        this.def9 = def9 == null ? null : def9.trim();
    }

    public String getDef10() {
        return def10;
    }

    public void setDef10(String def10) {
        this.def10 = def10 == null ? null : def10.trim();
    }
}