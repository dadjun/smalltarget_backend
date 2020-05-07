package com.jun.smalltarget.service;

import com.jun.smalltarget.model.BillBean;
import com.jun.smalltarget.model.CostSummaryBean;

import java.text.ParseException;
import java.util.List;

public interface BillsService {

    int addBills(BillBean bill) throws ParseException;
    int deleteBills(BillBean billBean);
    List<BillBean> selectAllBills() throws ParseException;
    List<CostSummaryBean> getCostSummary(String yearMonth)  throws ParseException;

}
