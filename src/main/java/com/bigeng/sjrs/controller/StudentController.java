package com.bigeng.sjrs.controller;


import com.bigeng.sjrs.entity.Student;
import com.bigeng.sjrs.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

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
public class StudentController {

    @Autowired
    IStudentService studentService;

    @GetMapping("list")
    @ResponseBody
    public List<Student> list(){
        List<Student> list = studentService.list();
        return list;
    }

    @PostMapping("update")
    @ResponseBody
    public boolean update(@RequestBody Student student){
        return studentService.updateById(student);
    }

    @PostMapping("add")
    @ResponseBody
    public boolean add(@RequestBody Student student){
        return studentService.save(student);
    }

    @PostMapping("delete")
    @ResponseBody
    public boolean delete(@RequestBody List<String> idList){
        return studentService.removeByIds(idList);
    }

}

