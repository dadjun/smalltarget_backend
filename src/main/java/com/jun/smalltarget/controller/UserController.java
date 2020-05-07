package com.jun.smalltarget.controller;

import com.jun.smalltarget.model.BillBean;
import com.jun.smalltarget.model.CostSummaryBean;
import com.jun.smalltarget.model.UserBean;
import com.jun.smalltarget.service.BillsService;
import com.jun.smalltarget.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

/*
    @CrossOrigin
    @PostMapping("/putBills")
    public String putBills(BillBean billBean) throws ParseException {

       int count =  billsService.addBills(billBean);
        return String.valueOf(count);

    }
*/

    @PostMapping("/login")
    @CrossOrigin
    public UserBean login(UserBean userBean) throws ParseException {

        UserBean billBeans = userService.queryUser(userBean);
        return billBeans;
    }

}
