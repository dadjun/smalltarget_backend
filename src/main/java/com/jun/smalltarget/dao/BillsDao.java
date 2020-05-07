package com.jun.smalltarget.dao;

import com.jun.smalltarget.model.BillBean;
import com.jun.smalltarget.model.CostSummaryBean;
import org.apache.ibatis.annotations.Param;

import java.text.ParseException;
import java.util.List;

public interface BillsDao {
    int insert(BillBean bill);
    int delete(BillBean bill);
    List<BillBean> selectAll();
    List<CostSummaryBean> getCostSummary(@Param("yearMonth") String yearMonth);
}
