package com.ecps.seckill.mapper;

import com.mingzhe.credit.bean.NplmRepaymentDetail;
import com.mingzhe.credit.bean.NplmRepaymentDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NplmRepaymentDetailMapper {
    int countByExample(NplmRepaymentDetailExample example);

    int deleteByExample(NplmRepaymentDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NplmRepaymentDetail record);

    int insertSelective(NplmRepaymentDetail record);

    List<NplmRepaymentDetail> selectByExample(NplmRepaymentDetailExample example);

    NplmRepaymentDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NplmRepaymentDetail record, @Param("example") NplmRepaymentDetailExample example);

    int updateByExample(@Param("record") NplmRepaymentDetail record, @Param("example") NplmRepaymentDetailExample example);

    int updateByPrimaryKeySelective(NplmRepaymentDetail record);

    int updateByPrimaryKey(NplmRepaymentDetail record);
}