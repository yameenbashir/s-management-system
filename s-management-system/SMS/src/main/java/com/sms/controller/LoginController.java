package com.sms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;



import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sms.beans.Login;
import com.sms.beans.Train;
import com.sms.service.LoginService;

@Controller
@RequestMapping("/logins")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value = "/validateUser", method = RequestMethod.POST)
    public @ResponseBody void validateUser(@RequestBody Login login) {
		loginService.validateUser(login);
    }
//	@RequestMapping(value = "/addTrain", method = RequestMethod.POST)
//    public @ResponseBody void addTrain(@RequestBody Train train) {
//        trainService.addTrain(train);
//    }
	
//	@RequestMapping("/layout")
//    public String getTrainPartialPage(ModelMap modelMap) {
//        return "trains/layout";
//    }
	@RequestMapping("/layout")
    public String getloginPartialPage(ModelMap modelMap) {
        return "logins/layout";
    }

}
