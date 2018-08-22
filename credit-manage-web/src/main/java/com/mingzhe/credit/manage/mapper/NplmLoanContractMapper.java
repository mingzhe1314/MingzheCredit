package com.mingzhe.credit.manage.mapper;

import com.mingzhe.credit.bean.NplmLoanContract;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface NplmLoanContractMapper extends Mapper<NplmLoanContract> {

    public List<NplmLoanContract> getNplmLoanContractMapList() ;
}
