package com.jun.smalltarget.dao;

import com.jun.smalltarget.model.BillBean;
import com.jun.smalltarget.model.CostSummaryBean;
import com.jun.smalltarget.model.UserBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    UserBean queryUser(UserBean userBean);
}
