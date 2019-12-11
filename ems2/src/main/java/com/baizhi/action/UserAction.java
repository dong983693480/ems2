package com.baizhi.action;

import com.baizhi.entity.Admin;
import com.baizhi.entity.d_department;
import com.baizhi.entity.d_user;
import com.baizhi.entity.other;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.Date;
import java.util.List;

@Controller
@Scope(value = "prototype")
public class UserAction {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(HttpSession session,String username, String password) {
        Admin a = userService.login(username, password);
        if (a != null) {
            session.setAttribute("xx","xx");
            return "redirect:/all.do";
        } else {
            return "no";
        }
    }

    @RequestMapping("/add1")
    public String add1(Admin a) {
        userService.maddAdmin(a);
        return "login";
    }

    //展示部门
    @RequestMapping("/all")
    public String all(Model m) {
        List<d_department> list = userService.all1();
        m.addAttribute("list", list);
        return "departments";
    }

    //查询单个部门
    @RequestMapping("/selectA")
    public String selectA(Model m, Integer id) {
        d_department d = userService.selectA(id);
        m.addAttribute("d", d);
        return "updateDepartment";
    }

    //添加部门
    @RequestMapping("/addDepartment")
    public String addDepartment(d_department d) {
        userService.maddDepartment(d);
        return "redirect:all.do";
    }

    //添加员工
    @RequestMapping("/addUser")
    public String addUser(MultipartFile upload, HttpSession session, d_user user)throws Exception {
        ServletContext servletContext = session.getServletContext();
        //获取目标文件夹的路径
         String realPath = servletContext.getRealPath("/img");
         //获取上传文件的名字 创建与上传文件 同名的文件 此时文件为空
        String newSrc=new Date().getTime()+upload.getOriginalFilename();
        File file = new File(realPath + "/" + newSrc);
        // 把上传文件转入空的文件
        upload.transferTo(file);
        user.setSrc(newSrc);
        userService.maddUser(user);
        return "redirect:all.do";
    }

    //删除员工
    @RequestMapping("/deleteUser")
    public String deleteUser(Integer id) {
        userService.mdelete(id);
        return "redirect:all.do";
    }

    //类别Ajax
    @RequestMapping("/xx")
    @ResponseBody
    public List<d_department> xx() {
        List<d_department> d = userService.all1();
        return d;
    }

    //修改部门信息
    @RequestMapping("/updateDepartment")
    public String updateDepartment(d_department d) {
        userService.mupdateDepartment(d);
        return "redirect:all.do";
    }

    //展示根据id查询单个员工信息
    @RequestMapping("/selectOne")
    public String selectOne(Model m, Integer id) {
        other o = userService.selectOne(id);
        m.addAttribute("o", o);
        return "updateEmp";
    }

    @RequestMapping("/selectById")
    public String selectById(Model model, Integer id) {
        List<other> users = userService.selectById(id);
        System.out.println(users);
        model.addAttribute("users", users);
        return "emplist";
    }

    //修改员工信息
    @RequestMapping("/updateUser")
    public String updateUser(MultipartFile upload, HttpSession session,d_user user) throws Exception{

        if(upload.getOriginalFilename().contains(".")){
            ServletContext servletContext = session.getServletContext();
            //获取目标文件夹的路径
            String realPath = servletContext.getRealPath("/img");
            //获取上传文件的名字 创建与上传文件 同名的文件 此时文件为空
            String newSrc=new Date().getTime()+upload.getOriginalFilename();
            File file = new File(realPath + "/" + newSrc);
            // 把上传文件转入空的文件
            upload.transferTo(file);
            System.out.println(newSrc+"+++++++++++");
            user.setSrc(newSrc);
        }else {
            other other = userService.selectOne(user.getId());
            System.out.println(other.getSrc()+"------");
            user.setSrc(other.getSrc());
        }
        System.out.println(user+"对象");
        userService.mupdate(user);
        return "redirect:all.do";
    }

}
