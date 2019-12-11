package com.baizhi.service;

import com.baizhi.dao.UserDAO;
import com.baizhi.entity.Admin;
import com.baizhi.entity.d_department;
import com.baizhi.entity.d_user;
import com.baizhi.entity.other;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public Admin login(String username, String password) {
        Admin a = userDAO.login(username, password);
        return a;
    }

    @Override
    public void maddAdmin(Admin a) {
        userDAO.addAdmin(a);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<other> selectById(Integer id) {
        List<other> uu = userDAO.selectById(id);
        return uu;
    }

    @Override
    public void maddUser(d_user u) {
        System.out.println(u+"service");
        userDAO.addUser(u);
    }

    @Override
    public void mupdate(d_user u) {
        userDAO.update(u);
    }

    @Override
    public void mdelete(Integer id) {
        userDAO.delete(id);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public other selectOne(Integer id) {
        other d_user = userDAO.selectOne(id);
        return d_user;
    }

    @Override
    public List<d_department> all1() {
        List<d_department> d_departments = userDAO.all1();
        return d_departments;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public d_department selectA(Integer id) {
        d_department d_department = userDAO.selectA(id);
        return d_department;
    }

    @Override
    public void maddDepartment(d_department d) {
        userDAO.addDepartment(d);

    }

    @Override
    public void mupdateDepartment(d_department d) {
        userDAO.updateDepartment(d);

    }
}
