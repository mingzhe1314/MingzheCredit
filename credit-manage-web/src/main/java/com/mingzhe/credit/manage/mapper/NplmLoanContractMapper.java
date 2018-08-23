package com.mingzhe.credit.manage.mapper;

import com.mingzhe.credit.bean.NplmLoanContract;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface NplmLoanContractMapper extends Mapper<NplmLoanContract> {

    public List<NplmLoanContract> getNplmLoanContractMapList(@Param("pageIndex") int pageIndex,@Param("pageSize") int pageSize) ;

    public int getContractMapCount() ;

    public List<NplmLoanContract> queryContractMapList(@Param("nplmLoanContract") NplmLoanContract nplmLoanContract,@Param("pageIndex") int pageIndex,@Param("pageSize") int pageSize) ;

    public int queryContractMapCount(NplmLoanContract nplmLoanContract);



}
