package com.mingzhe.credit.service;

import com.mingzhe.credit.bean.NplmLoanContract;

import java.util.List;

public interface CreditService {
    //查询合同信息
    public List<NplmLoanContract> getNplmLoanContractList(int pageIndex, int pageSize);
    //查询合同信息总条数
    public int getContractCount();
    //条件查询合同信息
    List<NplmLoanContract> queryContractList(NplmLoanContract nplmLoanContract, int pageIndex, int pageSize);
    //条件查询合同信息总条数
    int queryContractCount(NplmLoanContract nplmLoanContract);
}
