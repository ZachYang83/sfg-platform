package com.gpzi.gpplatform.shengfagai.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gpzi.gpplatform.common.lang.Result;
import com.gpzi.gpplatform.shengfagai.entity.Huoyun;
import com.gpzi.gpplatform.shengfagai.entity.LiuchuHj;
import com.gpzi.gpplatform.shengfagai.service.HuoyunService;
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
 * @since 2022-12-11
 */
@RestController
@RequestMapping("/shengfagai/huoyun")
public class HuoyunController {


    @Autowired
    HuoyunService huoyunService;

    @GetMapping("/getDesData")
    public Result getDesData(@RequestParam Integer countyId){
        QueryWrapper<Huoyun> wrapper = new QueryWrapper<>();
        wrapper.eq("countyId",countyId);
        wrapper.select("*");
        List<Huoyun> huoyunList = huoyunService.list(wrapper);
        return Result.succ(huoyunList);
    }

    @GetMapping("/getCity")
    public Result getCity(@RequestParam String city){
        QueryWrapper<Huoyun> wrapper = new QueryWrapper<>();
        wrapper.select("sum(sum2) as sum2");
        wrapper.eq("city",city);
        List<Huoyun> huoyunList = huoyunService.list(wrapper);
        return Result.succ(huoyunList);
    }
}
