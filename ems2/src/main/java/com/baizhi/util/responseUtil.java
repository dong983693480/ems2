package com.baizhi.util;

import com.alibaba.fastjson.JSON;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class responseUtil {

    public static void x1(Object o){
        HttpServletResponse response = ServletActionContext.getResponse();
        response.setCharacterEncoding("utf-8");
        String s = JSON.toJSONString(o);
        try {
            PrintWriter out = response.getWriter();
            out.print(s);
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
