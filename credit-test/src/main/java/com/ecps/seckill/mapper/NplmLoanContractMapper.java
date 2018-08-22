package com.ecps.seckill.mapper;

import com.mingzhe.credit.bean.NplmLoanContract;
import com.mingzhe.credit.bean.NplmLoanContractExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NplmLoanContractMapper {
    int countByExample(NplmLoanContractExample example);

    int deleteByExample(NplmLoanContractExample example);

    int deleteByPrimaryKey(String id);

    int insert(NplmLoanContract record);

    int insertSelective(NplmLoanContract record);

    List<NplmLoanContract> selectByExample(NplmLoanContractExample example);

    NplmLoanContract selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") NplmLoanContract record, @Param("example") NplmLoanContractExample example);

    int updateByExample(@Param("record") NplmLoanContract record, @Param("example") NplmLoanContractExample example);

    int updateByPrimaryKeySelective(NplmLoanContract record);

    int updateByPrimaryKey(NplmLoanContract record);
}