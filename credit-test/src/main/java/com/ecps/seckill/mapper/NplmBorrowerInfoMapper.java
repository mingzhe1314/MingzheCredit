package com.ecps.seckill.mapper;

import com.mingzhe.credit.bean.NplmBorrowerInfo;
import com.mingzhe.credit.bean.NplmBorrowerInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NplmBorrowerInfoMapper {
    int countByExample(NplmBorrowerInfoExample example);

    int deleteByExample(NplmBorrowerInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NplmBorrowerInfo record);

    int insertSelective(NplmBorrowerInfo record);

    List<NplmBorrowerInfo> selectByExample(NplmBorrowerInfoExample example);

    NplmBorrowerInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NplmBorrowerInfo record, @Param("example") NplmBorrowerInfoExample example);

    int updateByExample(@Param("record") NplmBorrowerInfo record, @Param("example") NplmBorrowerInfoExample example);

    int updateByPrimaryKeySelective(NplmBorrowerInfo record);

    int updateByPrimaryKey(NplmBorrowerInfo record);
}