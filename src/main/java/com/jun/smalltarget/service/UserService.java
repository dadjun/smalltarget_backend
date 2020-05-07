package com.jun.smalltarget.service;

import com.jun.smalltarget.model.BillBean;
import com.jun.smalltarget.model.CostSummaryBean;
import com.jun.smalltarget.model.UserBean;

import java.text.ParseException;
import java.util.List;

public interface UserService {

    UserBean queryUser(UserBean userBean) throws ParseException;

}
