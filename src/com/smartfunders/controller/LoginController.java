package com.smartfunders.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.smartfunders.model.Rol;
import com.smartfunders.model.User;
import com.smartfunders.model.UserWrapper;
import com.smartfunders.service.UserService;

@Controller
public class LoginController {

	private UserService userService;

	@RequestMapping("/webApplication")
	public ModelAndView webApplication() {
		return new ModelAndView("webApplication");
	}

	@RequestMapping(value = "/doLogin", method = RequestMethod.POST, consumes="application/json")
	public @ResponseBody
	Rol doLogin(@RequestParam  Object data) throws Exception {

		try {

			return userService.checkUser((User) data);

		} catch (Exception e) {

			return null;
		}
	}
	
	@RequestMapping(value = "/doLoginWrapper")
	public @ResponseBody
	Rol doLogin(@RequestBody  UserWrapper data) throws Exception {

		try {

			return userService.checkUser(data.getData());

		} catch (Exception e) {

			return null;
		}
	}
	
	@RequestMapping(value = "/doLoginUser")
	public @ResponseBody
	Rol doLogin(@RequestBody  User data) throws Exception {

		try {

			return userService.checkUser(data);

		} catch (Exception e) {

			return null;
		}
	}
	
	@RequestMapping(value = "/doLogin2", method = RequestMethod.POST, consumes="application/json")
	public ModelAndView doLogin2(@RequestBody  String user, @RequestBody  String pass) {

		return new ModelAndView("loginTest");
	}

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
