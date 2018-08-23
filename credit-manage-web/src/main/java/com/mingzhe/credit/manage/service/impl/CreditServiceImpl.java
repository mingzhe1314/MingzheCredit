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
    public List<NplmLoanContract> getNplmLoanContractList(int pageIndex, int pageSize) {
        List<NplmLoanContract> loanContractList = nplmLoanContractMapper.getNplmLoanContractMapList(pageIndex, pageSize) ;
        return loanContractList;
    }

    @Override
    public int getContractCount() {
        int count = nplmLoanContractMapper.getContractMapCount();
        return count;
    }

    @Override
    public List<NplmLoanContract> queryContractList(NplmLoanContract nplmLoanContract, int pageIndex, int pageSize) {
        List<NplmLoanContract> nplmLoanContracts = nplmLoanContractMapper.queryContractMapList(nplmLoanContract, pageIndex, pageSize);
        return nplmLoanContracts;
    }

    @Override
    public int queryContractCount(NplmLoanContract nplmLoanContract) {
        int count = nplmLoanContractMapper.queryContractMapCount(nplmLoanContract);
        return count;
    }
}
