package com.mingzhe.credit.manage.service.impl;

import com.mingzhe.credit.bean.NplmLoanContract;
import com.mingzhe.credit.manage.mapper.NplmLoanContractMapper;
import com.mingzhe.credit.service.CreditService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class CreditServiceImpl implements CreditService {

    @Autowired
    private NplmLoanContractMapper nplmLoanContractMapper ;

    @Override
    public List<NplmLoanContract> getNplmLoanContractList() {
        List<NplmLoanContract> loanContractList = nplmLoanContractMapper.getNplmLoanContractMapList() ;
        return loanContractList;
    }
}
