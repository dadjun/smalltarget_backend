package com.jun.smalltarget.controller;

import com.jun.smalltarget.model.BillBean;
import com.jun.smalltarget.model.CostSummaryBean;
import com.jun.smalltarget.service.BillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
public class BillsController {

    @Autowired
    BillsService billsService;

    @CrossOrigin
    @PostMapping("/putBills")
    public String putBills(BillBean billBean) throws ParseException {

       int count =  billsService.addBills(billBean);
        return String.valueOf(count);

    }

    @GetMapping("/getBills")
    @CrossOrigin
    public List<BillBean> getBills() throws ParseException {

       List<BillBean> billBeans = billsService.selectAllBills();
        return billBeans;
    }

    @GetMapping("/getTotalCost")
    @CrossOrigin
    public List<CostSummaryBean> getSummaryCost(@RequestParam(value = "yearMonth",required = false) String yearMonth) throws ParseException {

        List<CostSummaryBean> billBeans = billsService.getCostSummary(yearMonth);
        return billBeans;
    }

    @CrossOrigin
    @GetMapping("/hi")
    public String testHi(){
        return "haha";
    }
}
