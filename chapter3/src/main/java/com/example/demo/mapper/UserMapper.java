package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.po.*;

@Mapper
public interface UserMapper {
	// 查询所有用户
	@Select("select * from tb_user")
	List<User> getAllUsers();
	
    // 删除用户
    @Delete("DELETE FROM tb_user WHERE id =#{id}")
    void delete(Integer id);
    
    @Update("Update tb_user set username=#{name} where id=#{id}")
    void update(String name,Integer id);
}