package com.gpzi.gpplatform.shengfagai.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gpzi.gpplatform.common.lang.Result;
import com.gpzi.gpplatform.shengfagai.entity.Industry;
import com.gpzi.gpplatform.shengfagai.entity.Shangquan;
import com.gpzi.gpplatform.shengfagai.service.HuoyunService;
import com.gpzi.gpplatform.shengfagai.service.ShangquanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author gpzi
 * @since 2022-12-13
 */
@RestController
@RequestMapping("/shengfagai/shangquan")
public class ShangquanController {

    @Autowired
    ShangquanService shangquanService;

    @GetMapping("/getSqById")
    public Result getSqById(@RequestParam Integer id){
        QueryWrapper<Shangquan> wrapper = new QueryWrapper<>();
        Shangquan shangquan = shangquanService.getById(id);
        return Result.succ(shangquan);
    }

}
