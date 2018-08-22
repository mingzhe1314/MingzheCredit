package com.ecps.seckill.mapper;

import com.mingzhe.credit.bean.NplmRepaymentPlan;
import com.mingzhe.credit.bean.NplmRepaymentPlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NplmRepaymentPlanMapper {
    int countByExample(NplmRepaymentPlanExample example);

    int deleteByExample(NplmRepaymentPlanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NplmRepaymentPlan record);

    int insertSelective(NplmRepaymentPlan record);

    List<NplmRepaymentPlan> selectByExample(NplmRepaymentPlanExample example);

    NplmRepaymentPlan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NplmRepaymentPlan record, @Param("example") NplmRepaymentPlanExample example);

    int updateByExample(@Param("record") NplmRepaymentPlan record, @Param("example") NplmRepaymentPlanExample example);

    int updateByPrimaryKeySelective(NplmRepaymentPlan record);

    int updateByPrimaryKey(NplmRepaymentPlan record);
}