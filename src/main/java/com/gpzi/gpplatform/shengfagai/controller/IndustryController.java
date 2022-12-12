package com.gpzi.gpplatform.shengfagai.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gpzi.gpplatform.common.lang.Result;
import com.gpzi.gpplatform.shengfagai.entity.Huoyun;
import com.gpzi.gpplatform.shengfagai.entity.Industry;
import com.gpzi.gpplatform.shengfagai.service.IndustryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author gpzi
 * @since 2022-12-12
 */
@RestController
@RequestMapping("/shengfagai/industry")
public class IndustryController {

    @Autowired
    IndustryService industryService;

    @GetMapping("/getGyyById")
    public Result getGyyById(@RequestParam Integer id){
        QueryWrapper<Industry> wrapper = new QueryWrapper<>();
        Industry gongyeyuan = industryService.getById(id);
        return Result.succ(gongyeyuan);
    }

}
