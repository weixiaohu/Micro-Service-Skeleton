package com.microservice.asc.foo.controller;

import com.microservice.skeleton.common.vo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Mr.Yangxiufeng
 * Date: 2018-06-13
 * Time: 10:28
 */
@Slf4j
@RestController
@RequestMapping("order")
public class OrderController {
    @GetMapping("getOrder/{orderId}")
    public Result getRolePermission(@PathVariable("orderId") Integer orderId){
        return Result.ok().setData("order:" + orderId);
    }

}
