package com.mingzhe.credit.service;

import com.mingzhe.credit.bean.NplmLoanContract;

import java.util.List;

public interface CreditService {
    //查询合同信息
    public List<NplmLoanContract> getNplmLoanContractList(int pageIndex, int pageSize);
    //查询合同信息总条数
    public int getContractCount();

}
