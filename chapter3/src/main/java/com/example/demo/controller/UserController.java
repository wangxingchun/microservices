package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.po.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	// 注入用户Service
	@Autowired
	private UserService userService;
	// 查询所有用户
	@RequestMapping("/userList")
	public List<User> getAllUsers(){
		List<User> list = this.userService.getAllUsers();
		return list;		
	}
	// 删除用户
	@RequestMapping("/delete/{id}")
	public void delete(@PathVariable Integer id){
		this.userService.deleteUser(id);
	}
}