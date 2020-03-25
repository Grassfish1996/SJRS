package com.bigeng.sjrs.controller;


import com.bigeng.sjrs.entity.Student;
import com.bigeng.sjrs.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author bigeng
 * @since 2020-03-25
 */
@Controller
@RequestMapping("/student")
@CrossOrigin(origins = {"http://localhost:4200", "null"})
public class StudentController {

    @Autowired
    IStudentService studentService;

    @GetMapping("list")
    @ResponseBody
    public List<Student> list(){
        List<Student> list = studentService.list();
        return list;
    }

}

