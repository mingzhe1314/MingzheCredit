package com.ecps.seckill.mapper;

import com.mingzhe.credit.bean.NplmOverdueContract;
import com.mingzhe.credit.bean.NplmOverdueContractExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NplmOverdueContractMapper {
    int countByExample(NplmOverdueContractExample example);

    int deleteByExample(NplmOverdueContractExample example);

    int deleteByPrimaryKey(String id);

    int insert(NplmOverdueContract record);

    int insertSelective(NplmOverdueContract record);

    List<NplmOverdueContract> selectByExample(NplmOverdueContractExample example);

    NplmOverdueContract selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") NplmOverdueContract record, @Param("example") NplmOverdueContractExample example);

    int updateByExample(@Param("record") NplmOverdueContract record, @Param("example") NplmOverdueContractExample example);

    int updateByPrimaryKeySelective(NplmOverdueContract record);

    int updateByPrimaryKey(NplmOverdueContract record);
}