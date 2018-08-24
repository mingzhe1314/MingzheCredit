package com.mingzhe.credit.manage.controller;


import com.alibaba.fastjson.JSON;
import com.mingzhe.credit.bean.NplmLoanContract;
import com.mingzhe.credit.service.CreditService;
import org.codehaus.groovy.util.ListHashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ManageController {

    @Autowired
    private CreditService creditService ;



    //后台管理
    @RequestMapping("index")
    public String smp(){

        return "index";
    }

    //放款列表
    @RequestMapping("loanList")
    @ResponseBody
    public String loanList(Model model){

        return null ;
    }
    //合同列表
    @RequestMapping("contractList")
    public String contractList(){

        return "contractList" ;
    }
    //异步合同信息查询
    @ResponseBody
    @RequestMapping("queryLoanContractList")
    public Map<String,Object> queryLoanContractList(@RequestParam Map<String,Object> param){
        //当前页码
        String page = (String) param.get("page");
        //每页条数
        String rows = (String) param.get("rows");

        int pageNum = Integer.parseInt(page);
        int pageSize = Integer.parseInt(rows);
        //每页起始索引
        int pageIndex = (pageNum-1)*pageSize ;
        //查询合同分页信息
        List<NplmLoanContract> nplmLoanContractList = creditService.getNplmLoanContractList(pageIndex, pageSize);
        //查询合同信息总条数
        int contractCount = creditService.getContractCount();

        Map<String,Object> result = new HashMap<>() ;

        result.put("total",contractCount) ;
        result.put("rows",nplmLoanContractList) ;

        return result ;

    }


    @ResponseBody
    @RequestMapping("queryContractList")
    public Map<String,Object> queryContractList(@RequestParam Map<String,Object> param,NplmLoanContract nplmLoanContract){

        //当前页码
        String page = (String) param.get("page");
        //每页条数
        String rows = (String) param.get("rows");

        int pageNum = Integer.parseInt(page);
        int pageSize = Integer.parseInt(rows);
        //每页起始索引
        int pageIndex = (pageNum-1)*pageSize ;
        //条件查询合同信息
        List<NplmLoanContract> nplmLoanContractList = creditService.queryContractList(nplmLoanContract, pageIndex, pageSize);
        //条件查询合同信息总条数
        int contractCount = creditService.queryContractCount(nplmLoanContract);
        Map<String,Object> result = new HashMap<>() ;

        result.put("total",contractCount) ;
        result.put("rows",nplmLoanContractList) ;

        return result ;
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
