package com.bigeng.sjrs.controller;


import com.bigeng.sjrs.entity.Score;
import com.bigeng.sjrs.service.IScoreService;
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
@RequestMapping("/score")
public class ScoreController {

    @Autowired
    IScoreService scoreService;

    @GetMapping("list")
    @ResponseBody
    public List<Score> getList(){
        return scoreService.list();
    }

    @PostMapping("add")
    @ResponseBody
    public boolean add(@RequestBody Score score){
        return scoreService.save(score);
    }

    @PostMapping("update")
    @ResponseBody
    public boolean update(@RequestBody Score score){
        return scoreService.updateById(score);
    }

    @PostMapping("delete")
    @ResponseBody
    public boolean delete(@RequestBody List<String> idList){
        return scoreService.removeByIds(idList);
    }

}

