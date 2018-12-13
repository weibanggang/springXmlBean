package com.wbg.springxmlbean.controller;

import com.wbg.springxmlbean.entity.ComplexAssembly;
import com.wbg.springxmlbean.entity.MapUserRole;
import com.wbg.springxmlbean.entity.User;
import com.wbg.springxmlbean.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Role.xml");
        MapUserRole mapUserRole= (MapUserRole) applicationContext.getBean("mapUserRole");
        System.out.println(mapUserRole);
    }
}
