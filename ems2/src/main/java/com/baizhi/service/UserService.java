package com.baizhi.service;

import com.baizhi.entity.Admin;
import com.baizhi.entity.d_department;
import com.baizhi.entity.d_user;
import com.baizhi.entity.other;

import java.util.List;

public interface UserService {
    //登陆
    Admin login(String username,String password);
    //注册
    void maddAdmin(Admin a);

    //查询所在部门的所有员工
    List<other> selectById(Integer id);
    //添加、
    void maddUser(d_user u);
    //修改
    void mupdate (d_user u);
    //删除
    void mdelete(Integer id);
    //查单个
    other selectOne(Integer id);
    //查询所有部门
    List<d_department> all1();
    //查询单个部门
    d_department selectA(Integer id);
    //添加部门
    void maddDepartment(d_department d);
    //修改部门
    void mupdateDepartment(d_department d);
}
