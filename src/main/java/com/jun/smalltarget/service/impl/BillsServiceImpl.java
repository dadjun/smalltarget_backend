package com.jun.smalltarget.service.impl;

import com.jun.smalltarget.dao.BillsDao;
import com.jun.smalltarget.model.BillBean;
import com.jun.smalltarget.model.CostSummaryBean;
import com.jun.smalltarget.service.BillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service(value = "billsService")
public class BillsServiceImpl implements BillsService {

    @Autowired
    private BillsDao billsDao;

    @Override
    public int addBills(BillBean bill) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(new Date()));
        Date time = new java.sql.Date(new java.util.Date().getTime());
        bill.setInTime(sdf.parse(sdf.format(new Date())));
        return billsDao.insert(bill);
    }

    @Override
    public int deleteBills(BillBean billBean){
        return billsDao.delete(billBean);
    }

    @Override
    public List<BillBean> selectAllBills() throws ParseException {
        return billsDao.selectAll();
    }

    @Override
    public List<CostSummaryBean> getCostSummary(String yearMonth) throws ParseException {
        return billsDao.getCostSummary(yearMonth);
    }

}
