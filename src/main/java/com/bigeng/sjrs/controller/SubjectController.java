package com.bigeng.sjrs.controller;


import com.bigeng.sjrs.entity.Subject;
import com.bigeng.sjrs.service.ISubjectService;
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
 * @since 2020-03-29
 */
@Controller
@RequestMapping("/subject")
public class SubjectController {

    @Autowired
    ISubjectService subjectService;

    @GetMapping("list")
    @ResponseBody
    public List<Subject> getList(){
        return subjectService.list();
    }

    @PostMapping("add")
    @ResponseBody
    public boolean add(@RequestBody Subject subject){
        return subjectService.save(subject);
    }

    @PostMapping("update")
    @ResponseBody
    public boolean update(@RequestBody Subject subject){
        return subjectService.updateById(subject);
    }

    @PostMapping("delete")
    @ResponseBody
    public boolean delete(@RequestBody List<String> idList){
        return subjectService.removeByIds(idList);
    }

}

