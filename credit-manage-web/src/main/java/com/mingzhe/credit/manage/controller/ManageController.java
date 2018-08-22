package com.mingzhe.credit.manage.controller;


import com.alibaba.fastjson.JSON;
import com.mingzhe.credit.bean.NplmLoanContract;
import com.mingzhe.credit.service.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ManageController {

    @Autowired
    private CreditService creditService ;



    //后台管理
    @RequestMapping("index")
    public String smp(){
        List<NplmLoanContract> loanContractList = creditService.getNplmLoanContractList();
        String jsonString = JSON.toJSONString(loanContractList);
//        return jsonString ;
        return "index";
    }

    //放款列表
    @RequestMapping("loanList")
    public String loanList(Model model){
        List<NplmLoanContract> loanContractList = creditService.getNplmLoanContractList();
        String jsonString = JSON.toJSONString(loanContractList);
        model.addAttribute("loanContractList",loanContractList) ;
        return "loanList" ;
    }
    //合同列表
    @RequestMapping("contractList")
    public String contractList(){
        return "contractList" ;
    }
    //查看还款情况页面
    @RequestMapping("viewRepaymentStatusPage")
    public String viewRepaymentStatusPage(){

        return "viewRepaymentStatusPage" ;
    }
    //修改还款情况页面
    @RequestMapping("modifyRepaymentStatusPage")
    public String modifyRepaymentStatusPage(){

        return "modifyRepaymentStatusPage" ;
    }
    //前期费用列表
    @RequestMapping("preCostList")
    public String preCostList(){

        return "preCostList" ;
    }
    //变更费用列表
    @RequestMapping("changeFeeList")
    public String changeFeeList(){
        return "changeFeeList" ;
    }
}
