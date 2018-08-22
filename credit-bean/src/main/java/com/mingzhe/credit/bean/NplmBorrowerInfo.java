package com.mingzhe.credit.bean;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * 客户_借款人信息
 */
public class NplmBorrowerInfo implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private Integer applyClientId;
    @Column
    private Integer ecifId;
    //客户姓名
    @Column
    private String clientName;
    @Column
    private String mobile;
    @Column
    private String oldName;
    @Column
    private String sex;
    @Column
    private String nation;
    @Column
    private String birthday;
    @Column
    private String marital;
    @Column
    private Integer haveChildren;
    @Column
    private Integer childrenCount;
    @Column
    private String nationality;
    @Column
    private String hProvince;
    //户籍所在市
    @Column
    private String hCity;
    @Column
    private String hDress;
    @Column
    private String identityType;
    //证件号码
    @Column
    private String identityNum;
    @Column
    private String identityValidDate;
    @Column
    private String haveCar;
    @Column
    private String houseExplain;
    @Column
    private String resideExplain;
    @Column
    private String resideYear;
    @Column
    private String degree;
    @Column
    private String diploma;
    @Column
    private Integer yearIncome;
    @Column
    private String industry;
    @Column
    private String job;
    @Column
    private String company;
    @Column
    private String companyType;
    @Column
    private String department;
    @Column
    private String position;
    @Column
    private Integer workTime;
    @Column
    private String workTimeUnit;
    @Column
    private String clientArea;
    @Column
    private String clientType;
    @Column
    private String fNation;
    @Column
    private String fProvince;
    @Column
    private String fCity;
    @Column
    private String fArea;
    @Column
    private String fStreet;
    @Column
    private String fZipcode;
    @Column
    private String cNation;
    @Column
    private String cProvince;
    @Column
    private String cCity;
    @Column
    private String cArea;
    @Column
    private String cStreet;
    @Column
    private String cZipcode;
    @Column
    private String mobile1;
    @Column
    private String mobile2;
    @Column
    private String mobile3;
    @Column
    private String fTel1;
    @Column
    private String fTel2;
    @Column
    private String fTel3;
    @Column
    private String cTel1;
    @Column
    private String cTel2;
    @Column
    private String cTel3;
    @Column
    private String email1;
    @Column
    private String email2;
    @Column
    private String email3;
    @Column
    private Integer creditAmount;
    @Column
    private String sociallSecurity;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getApplyClientId() {
        return applyClientId;
    }

    public void setApplyClientId(Integer applyClientId) {
        this.applyClientId = applyClientId;
    }

    public Integer getEcifId() {
        return ecifId;
    }

    public void setEcifId(Integer ecifId) {
        this.ecifId = ecifId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName == null ? null : clientName.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getOldName() {
        return oldName;
    }

    public void setOldName(String oldName) {
        this.oldName = oldName == null ? null : oldName.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getMarital() {
        return marital;
    }

    public void setMarital(String marital) {
        this.marital = marital == null ? null : marital.trim();
    }

    public Integer getHaveChildren() {
        return haveChildren;
    }

    public void setHaveChildren(Integer haveChildren) {
        this.haveChildren = haveChildren;
    }

    public Integer getChildrenCount() {
        return childrenCount;
    }

    public void setChildrenCount(Integer childrenCount) {
        this.childrenCount = childrenCount;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality == null ? null : nationality.trim();
    }

    public String gethProvince() {
        return hProvince;
    }

    public void sethProvince(String hProvince) {
        this.hProvince = hProvince == null ? null : hProvince.trim();
    }

    public String gethCity() {
        return hCity;
    }

    public void sethCity(String hCity) {
        this.hCity = hCity == null ? null : hCity.trim();
    }

    public String gethDress() {
        return hDress;
    }

    public void sethDress(String hDress) {
        this.hDress = hDress == null ? null : hDress.trim();
    }

    public String getIdentityType() {
        return identityType;
    }

    public void setIdentityType(String identityType) {
        this.identityType = identityType == null ? null : identityType.trim();
    }

    public String getIdentityNum() {
        return identityNum;
    }

    public void setIdentityNum(String identityNum) {
        this.identityNum = identityNum == null ? null : identityNum.trim();
    }

    public String getIdentityValidDate() {
        return identityValidDate;
    }

    public void setIdentityValidDate(String identityValidDate) {
        this.identityValidDate = identityValidDate == null ? null : identityValidDate.trim();
    }

    public String getHaveCar() {
        return haveCar;
    }

    public void setHaveCar(String haveCar) {
        this.haveCar = haveCar == null ? null : haveCar.trim();
    }

    public String getHouseExplain() {
        return houseExplain;
    }

    public void setHouseExplain(String houseExplain) {
        this.houseExplain = houseExplain == null ? null : houseExplain.trim();
    }

    public String getResideExplain() {
        return resideExplain;
    }

    public void setResideExplain(String resideExplain) {
        this.resideExplain = resideExplain == null ? null : resideExplain.trim();
    }

    public String getResideYear() {
        return resideYear;
    }

    public void setResideYear(String resideYear) {
        this.resideYear = resideYear == null ? null : resideYear.trim();
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree == null ? null : degree.trim();
    }

    public String getDiploma() {
        return diploma;
    }

    public void setDiploma(String diploma) {
        this.diploma = diploma == null ? null : diploma.trim();
    }

    public Integer getYearIncome() {
        return yearIncome;
    }

    public void setYearIncome(Integer yearIncome) {
        this.yearIncome = yearIncome;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType == null ? null : companyType.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public Integer getWorkTime() {
        return workTime;
    }

    public void setWorkTime(Integer workTime) {
        this.workTime = workTime;
    }

    public String getWorkTimeUnit() {
        return workTimeUnit;
    }

    public void setWorkTimeUnit(String workTimeUnit) {
        this.workTimeUnit = workTimeUnit == null ? null : workTimeUnit.trim();
    }

    public String getClientArea() {
        return clientArea;
    }

    public void setClientArea(String clientArea) {
        this.clientArea = clientArea == null ? null : clientArea.trim();
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType == null ? null : clientType.trim();
    }

    public String getfNation() {
        return fNation;
    }

    public void setfNation(String fNation) {
        this.fNation = fNation == null ? null : fNation.trim();
    }

    public String getfProvince() {
        return fProvince;
    }

    public void setfProvince(String fProvince) {
        this.fProvince = fProvince == null ? null : fProvince.trim();
    }

    public String getfCity() {
        return fCity;
    }

    public void setfCity(String fCity) {
        this.fCity = fCity == null ? null : fCity.trim();
    }

    public String getfArea() {
        return fArea;
    }

    public void setfArea(String fArea) {
        this.fArea = fArea == null ? null : fArea.trim();
    }

    public String getfStreet() {
        return fStreet;
    }

    public void setfStreet(String fStreet) {
        this.fStreet = fStreet == null ? null : fStreet.trim();
    }

    public String getfZipcode() {
        return fZipcode;
    }

    public void setfZipcode(String fZipcode) {
        this.fZipcode = fZipcode == null ? null : fZipcode.trim();
    }

    public String getcNation() {
        return cNation;
    }

    public void setcNation(String cNation) {
        this.cNation = cNation == null ? null : cNation.trim();
    }

    public String getcProvince() {
        return cProvince;
    }

    public void setcProvince(String cProvince) {
        this.cProvince = cProvince == null ? null : cProvince.trim();
    }

    public String getcCity() {
        return cCity;
    }

    public void setcCity(String cCity) {
        this.cCity = cCity == null ? null : cCity.trim();
    }

    public String getcArea() {
        return cArea;
    }

    public void setcArea(String cArea) {
        this.cArea = cArea == null ? null : cArea.trim();
    }

    public String getcStreet() {
        return cStreet;
    }

    public void setcStreet(String cStreet) {
        this.cStreet = cStreet == null ? null : cStreet.trim();
    }

    public String getcZipcode() {
        return cZipcode;
    }

    public void setcZipcode(String cZipcode) {
        this.cZipcode = cZipcode == null ? null : cZipcode.trim();
    }

    public String getMobile1() {
        return mobile1;
    }

    public void setMobile1(String mobile1) {
        this.mobile1 = mobile1 == null ? null : mobile1.trim();
    }

    public String getMobile2() {
        return mobile2;
    }

    public void setMobile2(String mobile2) {
        this.mobile2 = mobile2 == null ? null : mobile2.trim();
    }

    public String getMobile3() {
        return mobile3;
    }

    public void setMobile3(String mobile3) {
        this.mobile3 = mobile3 == null ? null : mobile3.trim();
    }

    public String getfTel1() {
        return fTel1;
    }

    public void setfTel1(String fTel1) {
        this.fTel1 = fTel1 == null ? null : fTel1.trim();
    }

    public String getfTel2() {
        return fTel2;
    }

    public void setfTel2(String fTel2) {
        this.fTel2 = fTel2 == null ? null : fTel2.trim();
    }

    public String getfTel3() {
        return fTel3;
    }

    public void setfTel3(String fTel3) {
        this.fTel3 = fTel3 == null ? null : fTel3.trim();
    }

    public String getcTel1() {
        return cTel1;
    }

    public void setcTel1(String cTel1) {
        this.cTel1 = cTel1 == null ? null : cTel1.trim();
    }

    public String getcTel2() {
        return cTel2;
    }

    public void setcTel2(String cTel2) {
        this.cTel2 = cTel2 == null ? null : cTel2.trim();
    }

    public String getcTel3() {
        return cTel3;
    }

    public void setcTel3(String cTel3) {
        this.cTel3 = cTel3 == null ? null : cTel3.trim();
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1 == null ? null : email1.trim();
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2 == null ? null : email2.trim();
    }

    public String getEmail3() {
        return email3;
    }

    public void setEmail3(String email3) {
        this.email3 = email3 == null ? null : email3.trim();
    }

    public Integer getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(Integer creditAmount) {
        this.creditAmount = creditAmount;
    }

    public String getSociallSecurity() {
        return sociallSecurity;
    }

    public void setSociallSecurity(String sociallSecurity) {
        this.sociallSecurity = sociallSecurity == null ? null : sociallSecurity.trim();
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
}