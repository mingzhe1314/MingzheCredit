package com.ecps.seckill.mapper;

import com.mingzhe.credit.bean.NplmContractAttribute;
import com.mingzhe.credit.bean.NplmContractAttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NplmContractAttributeMapper {
    int countByExample(NplmContractAttributeExample example);

    int deleteByExample(NplmContractAttributeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NplmContractAttribute record);

    int insertSelective(NplmContractAttribute record);

    List<NplmContractAttribute> selectByExample(NplmContractAttributeExample example);

    NplmContractAttribute selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NplmContractAttribute record, @Param("example") NplmContractAttributeExample example);

    int updateByExample(@Param("record") NplmContractAttribute record, @Param("example") NplmContractAttributeExample example);

    int updateByPrimaryKeySelective(NplmContractAttribute record);

    int updateByPrimaryKey(NplmContractAttribute record);
}