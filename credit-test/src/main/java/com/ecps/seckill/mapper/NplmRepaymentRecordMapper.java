package com.ecps.seckill.mapper;

import com.mingzhe.credit.bean.NplmRepaymentRecord;
import com.mingzhe.credit.bean.NplmRepaymentRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NplmRepaymentRecordMapper {
    int countByExample(NplmRepaymentRecordExample example);

    int deleteByExample(NplmRepaymentRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NplmRepaymentRecord record);

    int insertSelective(NplmRepaymentRecord record);

    List<NplmRepaymentRecord> selectByExample(NplmRepaymentRecordExample example);

    NplmRepaymentRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NplmRepaymentRecord record, @Param("example") NplmRepaymentRecordExample example);

    int updateByExample(@Param("record") NplmRepaymentRecord record, @Param("example") NplmRepaymentRecordExample example);

    int updateByPrimaryKeySelective(NplmRepaymentRecord record);

    int updateByPrimaryKey(NplmRepaymentRecord record);
}