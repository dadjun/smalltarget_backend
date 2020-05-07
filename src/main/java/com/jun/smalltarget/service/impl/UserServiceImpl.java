package com.jun.smalltarget.service.impl;

import com.jun.smalltarget.dao.BillsDao;
import com.jun.smalltarget.dao.UserDao;
import com.jun.smalltarget.model.BillBean;
import com.jun.smalltarget.model.CostSummaryBean;
import com.jun.smalltarget.model.UserBean;
import com.jun.smalltarget.service.BillsService;
import com.jun.smalltarget.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public UserBean queryUser(UserBean userBean) throws ParseException {
        return  userDao.queryUser(userBean);

    }


}
