package com.baizhi.dao;

import com.baizhi.entity.Admin;
import com.baizhi.entity.d_department;
import com.baizhi.entity.d_user;
import com.baizhi.entity.other;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDAO {
    //登陆
    Admin login(@Param("username") String username, @Param("password") String password);
    //注册
    void addAdmin(Admin a);

    //查询所在部门的所有员工
    List<other> selectById(Integer id);
    //添加、
    void addUser(d_user u);
    //修改
    void update (d_user u);
    //删除
    void delete(Integer id);
    //查单个
    other selectOne(Integer id);
    //查询所有部门
    List<d_department> all1();
    //查询单个部门
    d_department selectA(Integer id);
    //添加部门
    void addDepartment(d_department d);
    //修改部门
    void updateDepartment(d_department d);

}
