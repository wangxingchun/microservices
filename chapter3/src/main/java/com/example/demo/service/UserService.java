package com.example.demo.service;

import java.util.List;

import com.example.demo.po.User;
public interface UserService {
	// 查询所有
	List<User> getAllUsers();
    // 删除数据
    void deleteUser(Integer id);
}