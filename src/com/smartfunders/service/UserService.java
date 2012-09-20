package com.smartfunders.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.smartfunders.model.Rol;
import com.smartfunders.model.User;

@Service
public class UserService {

	public Rol checkUser(User user) {

		if (user.getUserName().compareTo("erico") == 0
				&& user.getPass().compareTo("12345678") == 0){
			Rol rol = new Rol();
			rol.setRol(1);
			rol.setUserName(user.getUserName());
			return rol;
		} else{
			Rol rol = new Rol();
			rol.setRol(0);
			rol.setUserName(user.getUserName());
			return rol;
		}
	}

	public List<User> getUsers() {
		// TODO Auto-generated method stub
		List<User> list = new ArrayList<User>();
		User usr = new User();
		usr.setUserName("erico");
		usr.setPass("12345678");
		list.add(usr);
		usr.setUserName("test");
		usr.setPass("test");
		list.add(usr);
		
		return list;
	}
}
