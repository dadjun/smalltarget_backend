package com.jun.smalltarget.model;

public class CostSummaryBean {

    private String userName;
    private String type;
    private String billDesc;
    private Integer totalCost;
    private String yearMonth;
    private Integer count;

    
    
    public void setBillDesc(String billDesc) {
        this.billDesc = billDesc;
    }
 
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Integer totalCost) {
        this.totalCost = totalCost;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getBillDesc() {
        return billDesc;
    }

    public String getYearMonth() {
        return yearMonth;
    }

    public void setYearMonth(String yearMonth) {
        this.yearMonth = yearMonth;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
